<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>This is loginform</title>
</head>
<body>

<h1>로그인</h1>

<form action="http://localhost:8080/login" method="POST">
    ID : <input type="text" name="id"><br/>
    PW : <input type="password" name="pw"><br/>
    <input type="submit" value="제출">
</form>

</body>
</html>