<h2>844. Backspace String Compare</h2>
<h3>Easy</h3>
<hr>
<div>
<p>Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

</p>

<p><b>Example 1: </b></p>
<pre>
<strong>Input:</strong> s = "ab#c", t = "ad#c"
<strong>Output:</strong> true
<strong>Explanation:</strong> Both s and t become "ac".
</pre>

<p><b>Example 2: </b></p>
<pre>
<strong>Input:</strong> s = "ab##", t = "c#d#"
<strong>Output:</strong> true
<strong>Explanation:</strong> Both s and t become "".
</pre>

<p><b>Example 3: </b></p>
<pre>
<strong>Input:</strong> s = "a#c", t = "b"
<strong>Output:</strong> false
<strong>Explanation:</strong> s becomes "c" while t becomes "b".
</pre>

<p><b>Constraints:</b></p>
<ul> 
    <li>1 <= s.length, t.length <= 200</li>
    <li>s and t only contain lowercase letters and '#' characters.</li>
</ul>
</div>
