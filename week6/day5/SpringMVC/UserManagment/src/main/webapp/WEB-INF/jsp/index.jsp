<%--
  Created by IntelliJ IDEA.
  User: tsegaygebreyesus
  Date: 9/7/23
  Time: 5:59 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <title>Registration Page</title>
</head>
<body>
<form:form action="insert" modelAttribute="user" align="center">

First Name : <form:input path="firstName"/><br><br>

Last Name : <form:input path="lastName"/><br><br>

Gender :  Male<form:radiobutton path="gender" value="Male"/>

Female <form:radiobutton path="gender" value="Female"/> <br><br>

    Courses :  SpringBoot <form:checkbox path="courses" value="SpringBoot"/>
    MicroServices <form:checkbox path="courses" value="MicroServices"/>
    Docker <form:checkbox path="courses" value="Docker"/>
    <br><br>


    <input type="submit" value="Register">
</form:form>
    </body>
</html>
