<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
        color: #333;
        text-align: center;
    }
    h1 {
        margin-top: 50px;
    }
</style>
</head>
<body>
    <h1>Welcome to the welcome page!!!</h1>
    <%= request.getAttribute("data")%>
</body>
</html>
