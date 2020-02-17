<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13/02/2020
  Time: 9:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form action="calculate" method="post">
    <input type="text" name="num1" value="${num1}">
    <input type="text" name="num2" value="${num2}">
    <p>
      <input type="submit" name="operator" value="Addition(+)">
      <input type="submit" name="operator" value="Subtraction(-)">
      <input type="submit" name="operator" value="Multiplication(X)">
      <input type="submit" name="operator" value="Division(/)">
    </p>
  </form>
  <h2>Result ${operator}: ${result}</h2>
  </body>
</html>
