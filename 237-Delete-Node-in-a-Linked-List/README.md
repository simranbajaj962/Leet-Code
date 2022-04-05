<h2>237. Delete Node in a Linked List</h2>
<h3>Easy</h3>
<hr>
<div>
<p>Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.

It is guaranteed that the node to be deleted is not a tail node in the list.</p>

<p><b>Example 1: </b></p>

<pre><strong>Input:</strong> head = [4,5,1,9], node = 5
<strong>Output:</strong> [4,1,9]
<strong>Explanation:</strong> You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
</pre>

<p><b>Example 2: </b></p>

<pre><strong>Input:</strong> head = [4,5,1,9], node = 1
<strong>Output:</strong> [4,5,9]
<strong>Explanation:</strong> You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
</pre>

<p><b>Constraints:</b></p>
<ul> 
   <li>The number of the nodes in the given list is in the range [2, 1000].</li>
   <li>-1000 <= Node.val <= 1000</li>
   <li>The value of each node in the list is unique.</li>
   <li>The node to be deleted is in the list and is not a tail node</li>
</ul>
</div>
