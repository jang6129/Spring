<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>HOBBY</title>
</head>
<body>

<h1>${n} likes to</h1>
<ol>
    <c:forEach var="h" items="${hList}">
        <li>${h}</li>
    </c:forEach>
</ol>


</body>
</html>