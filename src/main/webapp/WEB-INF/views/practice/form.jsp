<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Submitting Form</title>
</head>
<body>

<h1>책 정보 입력</h1>

<form action="http://localhost:8080/practice/publish" method="POST">
    제목 : <input type="text" name="title"><br/>
    저자 : <input type="text" name="author"><br/>
    출판사 : <input type="text" name="publisher"><br/>
    출판일 : <input type="date" name="date"><br/>
    <input type="submit" value="입력">
</form>

</body>
</html>