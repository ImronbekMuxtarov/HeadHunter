<%@ page import="java.util.List" %>
<%@ page import="org.example.model.Country" %><%--
  Created by IntelliJ IDEA.
  User: imuxt
  Date: 1/11/2024
  Time: 1:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<% List<Country> countryList = (List<Country>) request.getAttribute("countries");%>
<html>
<head>
    <title>New City</title>
</head>
<body style="background-color: black">
<%@include file="navbar.jsp"%>
    <form action="<%= request.getContextPath()%>/addcity" method="post" style="align-items: center; background-color: #212529; padding: 20px;">
        <div class="mb-3">
            <label for="name" class="form-label" style="color: white;">City Name: </label>
            <input type="text" class="form-control" id="name" name="name" required>
        </div>
        <select class="form-select" aria-label="Default select example" name="countryid" id="countryid" required>
            <option value="" selected>Country</option>
            <% for(Country country : countryList){%>
                <option value="<%= country.getId()%>"><%= country.getName()%></option>
            <% } %>
        </select>
        <button type="submit" class="btn btn-success">Submit</button>
    </form>
</body>
</html>
