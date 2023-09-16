<%--
  Created by IntelliJ IDEA.
  User: tsegaygebreyesus
  Date: 9/7/23
  Time: 6:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="" prefix="c" %>

<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Information Display</title>
</head>
<body>
First Name : ${user.firstName}
Last Name : ${user.lastName}
Gender : ${user.gender}
Courses: ${user.courses}
</body>
</html>
