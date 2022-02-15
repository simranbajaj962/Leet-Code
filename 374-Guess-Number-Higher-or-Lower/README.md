<h2>374. Guess Number Higher or Lower</h2><h3>Easy</h3><hr>
<div>
<p>We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

<ul>
  <li>-1: Your guess is higher than the number I picked (i.e. num > pick).</li>
  <li>1: Your guess is lower than the number I picked (i.e. num < pick). </li>
  <li>0: your guess is equal to the number I picked (i.e. num == pick). </li>
Return the number that I picked.</p>

<p><b>Example 1: </b></p>

<pre><strong>Input:</strong> n = 10, pick = 6
<strong>Output:</strong> 6
</pre>

<p><b>Example 2: </b></p>

<pre><strong>Input:</strong> n = 1, pick = 1
<strong>Output:</strong> 1
</pre>

<p><b>Example 3: </b></p>

<pre><strong>Input:</strong> n = 2, pick = 1
<strong>Output:</strong> 1
</pre>

<p><b>Constraints:</b></p>
<ul> 
   <li>1 <= n <= 2³¹ - 1</li>
   <li>1 <= pick <= n</li>
</ul>
</div>
