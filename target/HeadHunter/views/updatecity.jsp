<%@ page import="org.example.model.Country" %>
<%@ page import="org.example.model.City" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.stream.Collectors" %><%--
  Created by IntelliJ IDEA.
  User: imuxt
  Date: 1/11/2024
  Time: 12:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<% City city = (City) request.getAttribute("city");%>
<% List<Country> countryList = (List<Country>) request.getAttribute("countries");%>
<% Country c = countryList.stream()
        .filter(x -> x.getId() == city.getCountryId())
        .collect(Collectors.toList())
        .get(0);%>
<html>
<head>
    <title>Update City</title>
</head>
<body style="background-color: black">
<%@include file="navbar.jsp"%>
<form action="<%= request.getContextPath()%>/updatecity/<%= city.getId()%>" method="post" style="align-items: center; background-color: #212529; padding: 20px;">
    <div class="mb-3">
        <label for="name" class="form-label" style="color: white;">Country Name: </label>
        <input type="text" class="form-control" id="name" name="name" required value="<%= city.getName()%>">
    </div>
    <select class="form-select" aria-label="Default select example" name="countryid" id="countryid" required>
        <option selected value="<%= c.getId()%>"><%= c.getName()%></option>
        <% for(Country country : countryList){%>
        <option value="<%= country.getId()%>"><%= country.getName()%></option>
        <% } %>
    </select>
    <button type="submit" class="btn btn-success">Submit</button>
</form>
</body>
</html>
