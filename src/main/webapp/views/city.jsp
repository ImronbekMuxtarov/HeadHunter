<%@ page import="org.example.model.City" %>
<%--
  Created by IntelliJ IDEA.
  User: imuxt
  Date: 1/11/2024
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<% City city = (City) request.getAttribute("city");%>
<html>
<head>
    <title><%= city.getName()%></title>
</head>
<body style="background-color: black">
<%@include file="navbar.jsp"%>
    <div class="card" style="width: 18rem; background-color: #212529">
        <div class="card-body">
            <h5 class="card-title" style="color: white">About City</h5>
            <p class="card-text" style="color: white">Name: <%= city.getName()%></p>
            <p style="color: white">Country Name:
                <a href="<%= request.getContextPath()%>/viewcountry/<%= city.getCountry().getId()%>"><%= city.getCountry().getName()%></a>
            </p>
        </div>
    </div>
</body>
</html>
