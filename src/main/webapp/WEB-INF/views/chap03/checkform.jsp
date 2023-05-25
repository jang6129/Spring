<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>This is foodform</title>
</head>
<body>

<h1>주문서 작성</h1>

<form action="http://localhost:8080/chap03/check" method="POST">
    메뉴 : <input type="text" name="menu"><br/>
    가격 : <input type="number" name="price"><br/>
    <input type="submit" value="계산">
</form>

</body>
</html>