<h2>189. Rotate Array</h2>
<h3>Medium</h3>
<hr>
<div>
<p>Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
</p>

<p><b>Example 1: </b></p>
<pre>
<strong>Input:</strong> nums = [1,2,3,4,5,6,7], k = 3
<strong>Output:</strong> [5,6,7,1,2,3,4]
<strong>Explanation:</strong> rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
</pre>

<p><b>Example 2: </b></p>
<pre>
<strong>Input:</strong> nums = [-1,-100,3,99], k = 2
<strong>Output:</strong> [3,99,-1,-100]
<strong>Explanation:</strong> rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
</pre>

<p><b>Constraints:</b></p>
<ul> 
    <li>1 <= nums.length <= 10⁵</li>
    <li>-2³¹ <= nums[i] <= 2³¹ - 1</li>
    <li>0 <= k <= 10⁵</li>
</ul>
</div>
