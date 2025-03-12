<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 12.
  Time: 오후 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Web App</title>
</head>
<body>
<h1>주차요금계산 결과</h1>
<p>
    차량번호 [${param.car}] 고객님의 주차시간은 ${param.minutes}분. 주차금액은 ${param.purchse} 원으로 주차요금이 계산 되었습니다
</p>
<p>
    정산금액은 ${fee} 입니다.
</p>

</body>
</html>
