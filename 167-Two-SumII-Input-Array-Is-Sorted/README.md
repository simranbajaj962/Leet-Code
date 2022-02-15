<h2>167. Two Sum II - Input Array Is Sorted</h2><h3>Medium</h3><hr>
<div>
<p>Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.</p>

<p><b>Example 1: </b></p>

<pre><strong>Input:</strong> numbers = [2,7,11,15], target = 9
<strong>Output:</strong> [1,2]
<strong>Explanation:</strong> The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
</pre>

<p><b>Example 2: </b></p>

<pre><strong>Input:</strong> numbers = [2,3,4], target = 6
<strong>Output:</strong> [1,3]
<strong>Explanation:</strong> The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
</pre>

<p><b>Example 3: </b></p>

<pre><strong>Input:</strong> numbers = [-1,0], target = -1
<strong>Output:</strong> [1,2]
<strong>Explanation:</strong> The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
</pre>

<p><b>Constraints:</b></p>
<ul> 
   <li>2 <= numbers.length <= 3 * 10⁴</li>
   <li>-1000 <= numbers[i] <= 1000</li>
   <li>numbers is sorted in non-decreasing order.</li>
   <li>-1000 <= target <= 1000</li>
   <li>The tests are generated such that there is exactly one solution.</li>
</ul>
</div>
