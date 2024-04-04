<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Redirecting...</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #808080;
        color: #fff;
        text-align: center;
    }
</style>
</head>
<body>
    <div>
        <% 
            out.println(request.getAttribute("data"));
            response.setHeader("Refresh", "3; URL=login.jsp");
        %>
    </div>
</body>
</html>
