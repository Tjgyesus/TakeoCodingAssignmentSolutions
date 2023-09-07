<%--
  Created by IntelliJ IDEA.
  User: tsegaygebreyesus
  Date: 9/7/23
  Time: 1:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
<h1>User Registration</h1>

<form method="post" action="/register">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required placeholder="enter user name" /><br/><br/>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required placeholder="enter password"/><br/><br/>

    <input type="submit" value="Register"/>
</form>

<p>${message}</p>
</body>
</html>
