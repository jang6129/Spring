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

<form action="http://localhost:8080/chap03/foodorder" method="POST">
    주문자 : <input type="text" name="name"><br/>
    주문테이블 : <input type="number" name="number"><br/>
    메뉴 : <input type="text" name="menu"><br/>
    <input type="submit" value="주문">
</form>

</body>
</html>