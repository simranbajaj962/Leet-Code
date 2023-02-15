<h2>724. Find Pivot Index</h2>
<h3>Easy</h3>
<hr>
<div>
<p>Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

</p>

<p><b>Example 1: </b></p>
<pre>
<strong>Input:</strong> nums = [1,7,3,6,5,6]
<strong>Output:</strong> 3
<strong>Explanation:</strong> The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
</pre>

<p><b>Example 2: </b></p>
<pre>
<strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> -1
<strong>Explanation:</strong> There is no index that satisfies the conditions in the problem statement.
</pre>

<p><b>Example 3: </b></p>
<pre>
<strong>Input:</strong> nums = [2,1,-1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
</pre>

<p><b>Constraints:</b></p>
<ul> 
    <li>1 <= nums.length <= 10⁴</li>
    <li>-1000 <= nums[i] <= 1000</li>
</ul>
</div>
