<h2>1342. Number of Steps to Reduce a Number to Zero</h2>
<h3>Easy</h3>
<hr>
<div>
<p>Given an integer <code>num</code>, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by <code>2</code>, otherwise, you have to subtract <code>1</code> from it.</p>

<p><b>Example 1: </b></p>

<pre><strong>Input:</strong> num = 14
<strong>Output:</strong> 6
<strong>Explanation:</strong> 
Step 1) 14 is even; divide by 2 and obtain 7. 
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3. 
Step 4) 3 is odd; subtract 1 and obtain 2. 
Step 5) 2 is even; divide by 2 and obtain 1. 
Step 6) 1 is odd; subtract 1 and obtain 0.
</pre>

<p><b>Example 2: </b></p>

<pre><strong>Input:</strong> num = 8
<strong>Output:</strong> 4
<strong>Explanation:</strong> 
Step 1) 8 is even; divide by 2 and obtain 4. 
Step 2) 4 is even; divide by 2 and obtain 2. 
Step 3) 2 is even; divide by 2 and obtain 1. 
Step 4) 1 is odd; subtract 1 and obtain 0.
</pre>

<p><b>Example 3: </b></p>

<pre><strong>Input:</strong> n = 123
<strong>Output:</strong> 12
</pre>

<p><b>Constraints:</b></p>
<ul> 
   <li>0 <= num <= 10⁶</li>
</ul>
</div>
