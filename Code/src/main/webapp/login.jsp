<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Login Page</h1>
<br/>
<form action="ProcessServlet" method="post">
    <input type="text" name="inUsername" placeholder="username"/>
    <input type="text" name="inPassword" placeholder="password"/>
    <input type="submit" value="Login" name="btnLogin">
</form>
</body>
</html>