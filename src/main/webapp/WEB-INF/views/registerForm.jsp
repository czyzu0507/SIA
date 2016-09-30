<%@ taglib prefix="fx" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kuba
  Date: 26.09.16
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Rejestracja</h1>
<fx:form commandName="spitter" method="post" enctype="multipart/form-data">

    Imię: <fx:input path="firstName"/>
    <fx:errors path="firstName"/>
    Nazwisko: <fx:input path="lastName"/>
    <fx:errors path="lastName"/>
    Nazwa Użytkownika <fx:input path="userName"/>
    <fx:errors path="userName"/>
    Hasło: <fx:password path="password"/>
    <fx:errors path="password"/>
    profile Photo: <input type="file" name="profilePicture" accept="image/jpeg,image/png,image/gif">
    <input type="submit" value="zarejestruj">

</fx:form>
</body>
</html>
