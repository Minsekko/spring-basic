<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 13.
  Time: 오후 6:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>영화</title>
</head>
<body>
<h2> 영화 정보 </h2>
<form action="${pageContext.request.contextPath}/movie/create-proceed">
  <p>
    <input type="text" name="title" placeholder="제목"/>
  </p>
  <p>
    <textarea  name="description" placeholder="내용" style="width: 100%; padding: 6px;"></textarea>
    <!--<input type="text" name="description" value="내용"/> -->
  </p>
  <p>
    <input type="text" name="genre" placeholder="장르"/>
  </p>
  <p>
    <input type="date" name="releaseDate" placeholder="개봉일"/>
  </p>
  <p>
    <button type="submit"> 정보확인 </button>
  </p>

</form>
</body>
</html>
