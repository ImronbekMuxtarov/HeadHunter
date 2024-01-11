<%@ page import="java.util.List" %>
<%@ page import="org.example.model.Country" %><%--
  Created by IntelliJ IDEA.
  User: imuxt
  Date: 1/10/2024
  Time: 10:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<% List<Country> countryList = (List<Country>) request.getAttribute("countries");%>
<html>
<head>
    <title>Countries</title>
</head>
<body style="background: black">
<%@include file="navbar.jsp"%>
    <a type="button" class="btn btn-success" href="<%= request.getContextPath()%>/addcountry">Add Country></a>
    <table class="table table-dark">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        <% for(Country country : countryList){%>
            <tr>
                <th scope="row"><%= country.getId()%></th>
                <td><%= country.getName()%></td>
                <td>
                    <a class="btn btn-info" href="<%= request.getContextPath()%>/viewcountry/<%= country.getId()%>">View</a>
                    <a class="btn btn-warning" href="<%= request.getContextPath()%>/updatecountry/<%= country.getId()%>">Edit</a>
                    <a class="btn btn-danger" href="<%= request.getContextPath()%>/deletecountry/<%= country.getId()%>">Delete</a>
                </td>
            </tr>
        <%}%>
        </tbody>
    </table>
</body>
</html>
