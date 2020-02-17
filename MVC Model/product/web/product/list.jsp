<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/02/2020
  Time: 4:36 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product list</title>
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Manufacturer</td>
        <td>Edit</td>
        <td>Delete</td>
        <td>View</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var = "product">
<tr>
<td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a> </td>
    <td>${product.getPrice()}</td>
    <td>${product.getDescription()}</td>
    <td>${product.getManufacturer()}</td>
    <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
    <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
    <td><a href="/products?action=view&id=${product.getId()}">view</a></td>
</tr>
    </c:forEach>
</table>
</body>
</html>
