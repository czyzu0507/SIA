<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 21.09.16
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Splittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="resources/style.css" />"/>
</head>
<body>
    <h1>Witamy w servisie</h1>
    <a href="<c:url value="/spittles"/>"> Spittle</a>
    <a href="<c:url value="/spitter/register"/>">Rejestracja</a>
</body>
</html>