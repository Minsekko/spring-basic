<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 13.
  Time: 오후 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>식당예약</title>
</head>
<body>
<div style="width:560px; margin: auto; text-align: center">
    <div>
        <h2>고요한 밥상 예약 시스템</h2>
        <p>
            한 끼의 식사는 하나의 추억이 됩니다.<br/>
            <b>고요한 밥상</b>에서 소중한 순간을 예약하세요.
        </p>

        <div style="font-size:small">
            원활한 서비스 제공을 위해 당일 예약은 어렵습니다.
        </div>
    </div>

    <h3>예약정보입력하기</h3>
    <form action="${pageContext.request.contextPath}/booking/proceed">
        <p>
            <input type="text" name="customerName" placeholder="예약자" style="width: 100%; padding: 6px;"
                   value="${tableBooking.customerName}"/>
            <c:if test="${customerNameError != null }">
        <div style="color:red">
            예약자 이름은 필수 기입 정보입니다.
        </div>
        </c:if>
        </p>
        <p>
            <input type="number" name="guests" placeholder="예약인원" style="width: 100%; padding: 6px;"/>
            <c:if test="${guestsErrorCount != 0 }">
        <div style="color:red">
            최소 인원은 2명, 최대인원은 6명입니다.
        </div>
        </c:if>
        </p>
        <p>
            <input type="date" name="bookingDate"  style="width: 100%; padding: 6px;" value="${tableBooking.bookingDate}"/>
            <c:if test="${bindingResult.getFieldErrorCount('bookingDate') != 0 }">
        <div>
            예약가능일자는 내일부터 선택 가능합니다.
        </div>
        </c:if>
        </p>
        <p>
            <input type="text" name="contact" placeholder="이메일주소" style="width: 100%; padding: 6px;"/>
        </p>
        <p>
            <textarea  name="request" placeholder="요청사항" style="width: 100%; padding: 6px;"></textarea>
        </p>
        <p>
            <button type="submit" style="width: 100%; padding: 6px;">예약진행하기</button>
        </p>
    </form>
    <p>
        부적절한 포함되어 있습니다.
    </p>
</div>
</body>
</html>