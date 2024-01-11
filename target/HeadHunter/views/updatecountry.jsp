<%@ page import="org.example.model.Country" %><%--
  Created by IntelliJ IDEA.
  User: imuxt
  Date: 1/11/2024
  Time: 12:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Country country = (Country) request.getAttribute("country");%>
<html>
<head>
    <title>Update Country</title>
</head>
<body style="background-color: black">
    <%@include file="navbar.jsp"%>
    <form action="<%= request.getContextPath()%>/updatecountry/<%= country.getId()%>" method="post" style="align-items: center; background-color: #212529; padding: 20px;">
        <div class="mb-3">
            <label for="name" class="form-label" style="color: white;">Country Name: </label>
            <input type="text" class="form-control" id="name" name="name" required value="<%= country.getName()%>">
        </div>
        <button type="submit" class="btn btn-success">Submit</button>
    </form>
</body>
</html>
