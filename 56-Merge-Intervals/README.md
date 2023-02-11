<h2>56. Merge Intervals</h2>
<h3>Medium</h3>
<hr>
<div>
<p>Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

</p>

<p><b>Example 1: </b></p>
<pre>
<strong>Input:</strong> intervals = [[1,3],[2,6],[8,10],[15,18]]
<strong>Output:</strong> [[1,6],[8,10],[15,18]]
<strong>Explanation:</strong> BSince intervals [1,3] and [2,6] overlap, merge them into [1,6].
</pre>

<p><b>Example 2: </b></p>
<pre>
<strong>Input:</strong> intervals = [[1,4],[4,5]]
<strong>Output:</strong> [[1,5]]
<strong>Explanation:</strong> Intervals [1,4] and [4,5] are considered overlapping.
</pre>

<p><b>Constraints:</b></p>
<ul> 
    <li>1 <= intervals.length <= 10⁴</li>
    <li>intervals[i].length == 2</li>
    <li>0 <= start[i] <= end[i] <= 10⁴</li>
</ul>
</div>
