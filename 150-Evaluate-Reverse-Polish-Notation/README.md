<h2>150. Evaluate Reverse Polish Notation</h2>
<h3>Medium</h3>
<hr>
<div>
<p>You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

<ul>
  <li>The valid operators are '+', '-', '*', and '/'.</li>
  <li>Each operand may be an integer or another expression.</li>
  <li>The division between two integers always truncates toward zero.</li>
  <li>There will not be any division by zero.</li>
  <li>The input represents a valid arithmetic expression in a reverse polish notation.</li>
  <li>The answer and all the intermediate calculations can be represented in a 32-bit integer.</li>
</ul>
</p>

<p><b>Example 1: </b></p>
<pre>
<strong>Input:</strong> tokens = ["2","1","+","3","*"]
<strong>Output:</strong> 9
<strong>Explanation:</strong> ((2 + 1) * 3) = 9
</pre>

<p><b>Example 2: </b></p>
<pre>
<strong>Input:</strong> tokens = ["4","13","5","/","+"]
<strong>Output:</strong> 6
<strong>Explanation:</strong> (4 + (13 / 5)) = 6
</pre>

<p><b>Example 3: </b></p>
<pre>
<strong>Input:</strong> tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
<strong>Output:</strong> 22
<strong>Explanation:</strong> ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
</pre>

<p><b>Constraints:</b></p>
<ul> 
    <li>1 <= tokens.length <= 10⁴</li>
    <li>tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].</li>
</ul>
</div>
