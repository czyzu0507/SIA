<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 26.09.16
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittle</title>
</head>
<body>
<div class="spittleView">
<div class="spittleMessage"><c:out value="${spittle.message}"/></div>
  <span><div class="spittleTime"><c:out value="${spittle.time}"/></div></span>
</div>
</body>
</html>
