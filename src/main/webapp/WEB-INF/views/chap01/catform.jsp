<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>This is catform</title>
</head>
<body>

<h1>고양이 정보 등록</h1>

    <form action="http://localhost:8080/cat" method="POST">
        이름 : <input type="text" name="name"><br/>
        나이 : <input type="number" name="age"><br/>
        품종 : <input type="text" name="kind"><br/>
        <input type="submit" value="제출">
    </form>

</body>
</html>