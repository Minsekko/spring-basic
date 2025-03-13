<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>여행경비 계산 결과</title>
</head>
<body>
<h2>여행 경비 계산기</h2>
<p>
  목적지와 예상 경비 및 동행 인원수를 입력하여 제출하세요. 1인당 부담 비용을 계산해드립니다. (해외 설정시 10% 추가 계산)
</p>
<h3>계산 결과</h3>
<p>
  선택하신 목적지로 여행을 하시게 되면 여행총경비는 ${tempTotal} (+${additionalTotal}) 원 이며,
  1인당 분담금은 ${costPerPerson} 원 입니다.
</p>
</body>
</html>