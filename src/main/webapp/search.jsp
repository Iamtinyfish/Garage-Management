<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Welcome, ${sessionScope.USER}</h1><br>
    <form action="searchAction">
        <input type="text" name="searchBox">
        <input type="submit" name="Search" value="btnSearch">
    </form>
</body>
</html>
