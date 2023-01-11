<h2>57. Insert Interval</h2>
<h3>Medium</h3>
<hr>
<div>
<p>You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.</p>

<p><b>Example 1: </b></p>
<pre><strong>Input:</strong> intervals = [[1,3],[6,9]], newInterval = [2,5]
<strong>Output:</strong> [[1,5],[6,9]]
</pre>

<p><b>Example 2: </b></p>
<pre><strong>Input:</strong> intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
<strong>Output:</strong> [[1,2],[3,10],[12,16]]
<strong>Explanation:</strong> Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10]
</pre>

<p><b>Constraints:</b></p>
<ul> 
    <li>0 <= intervals.length <= 10⁴</li>
    <li>intervals[i].length == 2</li>
    <li>0 <= starti <= endi <= 10⁵</li>
    <li>intervals is sorted by starti in ascending order.</li>
    <li>newInterval.length == 2</li>
    <li>0 <= start <= end <= 10⁵</li>
</ul>
</div>
