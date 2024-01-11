<%@ page import="java.util.List" %>
<%@ page import="org.example.model.City" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<% List<City> cityList = (List<City>) request.getAttribute("cities");%>
<html>
<head>
    <title>Cities</title>
</head>
<body style="background-color: black">
<%@include file="navbar.jsp"%>
    <a type="button" class="btn btn-success" href="<%= request.getContextPath()%>/addcity">Add City></a>
    <table class="table table-dark">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Country Name</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        <% for(City city : cityList){%>
            <tr>
                <th scope="row"><%= city.getId()%></th>
                <td><%= city.getName()%></td>
                <td><a href="<%= request.getContextPath()%>/viewcountry/<%= city.getCountry().getId()%>"><%= city.getCountry().getName()%></a></td>
                <td>
                    <a class="btn btn-info" href="<%= request.getContextPath()%>/viewcity/<%= city.getId()%>">View</a>
                    <a class="btn btn-warning" href="<%= request.getContextPath()%>/updatecity/<%= city.getId()%>">Edit</a>
                    <a class="btn btn-danger" href="<%= request.getContextPath()%>/deletecity/<%= city.getId()%>">Delete</a>
                </td>
            </tr>
        <%}%>
        </tbody>
    </table>
</body>
</html>
