<h2>39. Combination Sum</h2>
<h3>Medium</h3>
<hr>
<div>
<p>Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.</p>

<p><b>Example 1: </b></p>

<pre><strong>Input:</strong> candidates = [2,3,6,7], target = 7
<strong>Output:</strong> [[2,2,3],[7]]
<strong>Explanation:</strong> 
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
</pre>

<p><b>Example 2: </b></p>

<pre><strong>Input:</strong> candidates = [2,3,5], target = 8
<strong>Output:</strong> [[2,2,2,2],[2,3,3],[3,5]]
</pre>

<p><b>Example 3: </b></p>

<pre><strong>Input:</strong> candidates = [2], target = 1
<strong>Output:</strong> []
</pre>

<p><b>Constraints:</b></p>
<ul> 
   <li>1 <= candidates.length <= 30</li>
   <li>1 <= candidates[i] <= 200</li>
   <li>All elements of candidates are distinct.</li>
   <li>1 <= target <= 500</li>
</ul>
</div>
