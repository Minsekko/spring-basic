<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 14.
  Time: 오전 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Movie :: Spring</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        a {
            text-decoration: none;
            color: #222;
            cursor : pointer;
        }

        tr:hover {background-color: skyblue;}
    </style>
</head>
<body>
<div style="text-align: center">
<h3> 영화 리스트</h3>
<ul>
    <c:forEach var="one" items="${movies}">
        <li>
            ${one.id} | ${one.title} | ${one.genre} | ${one.releaseDate}
        </li>
    </c:forEach>
</ul>
</div>
</body>
</html>
