<h2>121. Best Time to Buy and Sell Stock</h2>
<hr>
<h3>Easy</h3>
<div>
<p>You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.</p>

<p><b>Example 1: </b></p>

<pre><strong>Input:</strong> prices = [7,1,5,3,6,4]
<strong>Output:</strong> 5
<strong>Explanation:</strong> Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
</pre>

<p><b>Example 2: </b></p>

<pre><strong>Input:</strong> prices = [7,6,4,3,1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> In this case, no transactions are done and the max profit = 0.
</pre>

<p><b>Constraints:</b></p>
<ul> 
   <li>1 <= prices.length <= 10⁵</li>
   <li>0 <= prices[i] <= 10⁴</li>
</ul>
</div>
