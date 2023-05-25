<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>책 출시</title>
</head>
<body>

<h2>${book.title}의 저자
    ${book.author}는
    ${book.publisher}를 통해
    ${book.date}에 이 책을 출시했습니다.<br/>
    많은 관심 부탁드립니다.</h2>

</body>
</html>