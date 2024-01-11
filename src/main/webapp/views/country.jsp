<%@ page import="org.example.model.Country" %><%--
  Created by IntelliJ IDEA.
  User: imuxt
  Date: 1/11/2024
  Time: 12:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Country country = (Country) request.getAttribute("country");%>
<html>
<head>
    <title><%= country.getName()%></title>
</head>
<body style="background-color: black">
    <%@include file="navbar.jsp"%>
    <div class="card" style="width: 18rem; background-color: #212529">
        <div class="card-body">
            <h5 class="card-title" style="color: white">About Country</h5>
            <p class="card-text" style="color: white">Name: <%= country.getName()%></p>
            <a href="<%= request.getContextPath()%>/citiesbycountryid/<%= country.getId()%>" class="btn btn-info">Cities</a>
        </div>
    </div>
</body>
</html>
