<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 14.
  Time: 오후 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Movie :: Spring</title>
</head>
<body>
<div style="text-align: center">
    <h2>${found.title}</h2>
    <p>
        <span style="color: gray">장르</span> <b>${found.genre}</b>
        <span style="color: gray">개봉일</span> <b>${found.releaseDate}</b>
    </p>
    <h4>시놉시스</h4>
    <p style="white-space: pre-wrap">${found.description}</p>
</div>
</body>
</html>
