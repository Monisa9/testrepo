<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.cg.model.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>


<!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" >
 integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">  -->
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body style="text-align: center;margin-top: 3%;">

<p class="text-center" style="margin-top: 10px;margin-bottom:200px;">${user.roleCode} Login Successful</p>


${user }
<a class="btn btn-primary" href="#" role="button">New Profile Creation</a>&nbsp;&nbsp;

<a class="btn btn-primary" href="#" role="button">Claim Creation</a>&nbsp;&nbsp;

<a class="btn btn-primary" href="#" role="button">View Claim</a>&nbsp;&nbsp;

<a class="btn btn-primary" href="#" role="button">Report Generation</a>&nbsp;&nbsp;<br> <br> <br>


<!-- <form  method ="post" action="viewpolicy.htm" ><input type="submit" value="View Policy"></form> -->

<a href="viewpolicy.htm?username=${user.username}">View Policies</a>


</body>
</html> 