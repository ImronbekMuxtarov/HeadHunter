<%--
  Created by IntelliJ IDEA.
  User: imuxt
  Date: 1/10/2024
  Time: 11:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Country</title>
<%--    <link href="<%= request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">--%>
</head>
<body style="background-color: black">
    <%@include file="navbar.jsp"%>
    <form action="<%= request.getContextPath()%>/addcountry" method="post" style="align-items: center; background-color: #212529; padding: 20px;">
        <div class="mb-3">
            <label for="name" class="form-label" style="color: white;">Country Name: </label>
            <input type="text" class="form-control" id="name" name="name" required>
        </div>
        <button type="submit" class="btn btn-success">Submit</button>
    </form>

<%--<script src="<%= request.getContextPath()%>/resurslar/js/bootstrap.bundle.min.js"></script>--%>
</body>
</html>
