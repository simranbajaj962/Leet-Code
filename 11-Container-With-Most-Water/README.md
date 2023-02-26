<h2>11. Container With Most Water</h2>
<h3>Medium</h3>
<hr>
<div>
<p>You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

</p>

<p><b>Example 1: </b></p>
<img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg">
<pre>
<strong>Input:</strong> height = [1,8,6,2,5,4,8,3,7]
<strong>Output:</strong> 49
<strong>Explanation:</strong> The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
</pre>

<p><b>Example 2: </b></p>
<pre>
<strong>Input:</strong> height = [1,1]
<strong>Output:</strong> 1
</pre>

<p><b>Constraints:</b></p>
<ul> 
    <li>n == height.length</li>
    <li>2 <= n <= 10⁵</li>
    <li>0 <= height[i] <= 10⁴</li>
</ul>
</div>
