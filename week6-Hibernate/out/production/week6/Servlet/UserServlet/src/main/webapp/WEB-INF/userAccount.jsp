<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<div align="center">
    <h1>User Register Form</h1>
    <form action="<%= request.getContextPath() %>/UserServlet" method="post">
        <table style="with: 80%">
            <tr>
                <td>Id</td>
                <td><input type="text" name="Id" /></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="Name" /></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address" /></td>
            </tr>
        </table>
        <input type="submit" value="Submit" />
    </form>
</div>
</body>
</html>