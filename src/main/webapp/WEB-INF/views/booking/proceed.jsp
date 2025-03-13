<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 13.
  Time: 오후 12:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>식당예약</title>
</head>
<body>
<div style="width: 560px; margin: auto; text-align:center">
    <div>
        <h2>고요한 밥상 예약 시스템 </h2>
        <p>
            예약이 정상적으로 이루어 졌습니다.
        </p>
        <p>
            (예약번호 : ${uuid})
        </p>
        <p>
            예약은 <b>${tableBooking.customerName}</b> 님 이름으로
            예약일자는 <b> ${tableBooking.bookingDate} </b> 입니다.
        </p>
    </div>
</div>
</body>
</html>
