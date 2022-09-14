class MyCircularQueue {

    int size, head = 0, tail = -1;
    int queue[];

    public MyCircularQueue(int k) {
        queue = new int[k];
        size = k;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        tail = (tail + 1) % size;
        queue[tail] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        if (head == tail) {
            head = 0;
            tail = -1;
        } else {
            head = (head + 1) % size;
        }
        return true;
    }

    public int Front() {
        return isEmpty() ? -1 : queue[head];
    }

    public int Rear() {
        return isEmpty() ? -1 : queue[tail];
    }

    public boolean isEmpty() {
        return tail == -1;
    }

    public boolean isFull() {
        return !isEmpty() && (tail + 1) % size == head;
    }
}
