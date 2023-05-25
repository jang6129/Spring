<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>HOBBY</title>
</head>
<body>


<h1>name is ${name}</h1>
<ol>
    <c:forEach var="a" items="${age}">
        <li>${a}</li>
    </c:forEach>
</ol>

</body>
</html>