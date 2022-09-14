<h2>622. Design Circular Queue</h2>
<hr>
<h3>Medium</h3>
<div>
<p>Design your implementation of the circular queue. The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".

One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue, once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. But using the circular queue, we can use the space to store new values.

Implementation the MyCircularQueue class:

  <ul>
    <li>MyCircularQueue(k) Initializes the object with the size of the queue to be k.</li>
    <li>int Front() Gets the front item from the queue. If the queue is empty, return -1.</li>
    <li>int Rear() Gets the last item from the queue. If the queue is empty, return -1.</li>
    <li>boolean enQueue(int value) Inserts an element into the circular queue. Return true if the operation is successful.</li>
    <li>boolean deQueue() Deletes an element from the circular queue. Return true if the operation is successful.</li>
    <li>boolean isEmpty() Checks whether the circular queue is empty or not.</li>
    <li>boolean isFull() Checks whether the circular queue is full or not.</li>
</ul>

You must solve the problem without using the built-in queue data structure in your programming language. </code>

<p><b>Example 1: </b></p>

<pre><strong>Input:</strong> ["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]
[[3], [1], [2], [3], [4], [], [], [], [4], []]

<strong>Output:</strong> [null, true, true, true, false, 3, true, true, true, 4]

<strong>Explanation:</strong>
MyCircularQueue myCircularQueue = new MyCircularQueue(3);
myCircularQueue.enQueue(1); // return True
myCircularQueue.enQueue(2); // return True
myCircularQueue.enQueue(3); // return True
myCircularQueue.enQueue(4); // return False
myCircularQueue.Rear();     // return 3
myCircularQueue.isFull();   // return True
myCircularQueue.deQueue();  // return True
myCircularQueue.enQueue(4); // return True
myCircularQueue.Rear();     // return 4
</pre>

<p><b>Constraints:</b></p>
<ul> 
   <li>1 <= k <= 1000</li>
   <li>0 <= value <= 1000</li>
   <li>At most 3000 calls will be made to enQueue, deQueue, Front, Rear, isEmpty, and isFull.</li>
</ul>
</div>
