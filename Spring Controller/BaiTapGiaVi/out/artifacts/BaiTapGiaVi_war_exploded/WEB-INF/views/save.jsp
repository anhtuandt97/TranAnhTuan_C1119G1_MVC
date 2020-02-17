<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13/02/2020
  Time: 3:45 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="save">
    <tr>
    <td><input type="checkbox" name="condiment" value="Lettuce">Lettuce</td>
    <td><input type="checkbox" name="condiment" value="Tomato">Tomato</td>
    <td><input type="checkbox" name="condiment" value="Mustard">Mustard</td>
    <td><input type="checkbox" name="condiment" value="Sprouts">Sprouts</td>
    <td><input type="submit" value="save"></td>
    </tr>
    <c:forEach items="${mess}" var="eat">
        <h1>${eat}</h1>
    </c:forEach>
</form>
</body>
</html>
