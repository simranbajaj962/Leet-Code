<h2>1346. Check If N and Its Double Exist</h2><hr>
<h3>Easy</h3>
<div>
<p>Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

<ul>
<li>i != j</li>
<li>0 <= i, j < arr.length</li>
<li>arr[ i ] == 2 * arr[ j ]</li>
</ul>

</p>

<p><b>Example 1: </b></p>

<pre><strong>Input:</strong> arr = [10,2,5,3]
<strong>Output:</strong> true
<strong>Explanation:</strong> N = 10 is the double of M = 5,that is, 10 = 2 * 5.
</pre>

<p><b>Example 2: </b></p>

<pre><strong>Input:</strong> arr = [7,1,14,11]
<strong>Output:</strong> true
<strong>Explanation:</strong> N = 14 is the double of M = 7,that is, 14 = 2 * 7.
</pre>

<p><b>Example 3: </b></p>

<pre><strong>Input:</strong> arr = [3,1,7,11]
<strong>Output:</strong> false
<strong>Explanation:</strong> In this case does not exist N and M, such that N = 2 * M.
</pre>

<p><b>Constraints:</b></p>
<ul> 
   <li>2 <= arr.length <= 500</li>
   <li>-10^3 <= arr[i] <= 10^3</li>
</ul>
</div>
