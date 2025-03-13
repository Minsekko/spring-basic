<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 13.
  Time: 오전 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Talbe Booking</title>
</head>
<body>
<h2> Table Booking </h2>
<form action="${pageContext.request.contextPath}/booking/proceed">
    <p>
        <label>고객이름 : <input type="text" name="customerName" value="고객이름"/> </label>
    </p>
    <p>
        <label>방문객인원 : <input type="number" name="guests" value="방문인원"/> </label>
    </p>
    <p>
        <label>방문일자 : <input type="date" name="bookingDate" value="방문일자"/> </label>
    </p>
    <p>
        <label>Email : <input type="text" name="contact" value="Email"/> </label>
    </p>
    <p>
        <label>요구사항 : <textarea name="request" cols="40" rows="8" > </textarea> </label>
    </p>
    <p>
        <button type="submit">예약하기</button>
    </p>
</form>
</body>
</html>
