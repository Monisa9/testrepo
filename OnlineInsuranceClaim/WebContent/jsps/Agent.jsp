<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agent Page</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
Welcome ${user.roleCode} ...<br>


<a class="btn btn-primary" href="#" role="button">Claim Creation</a>

<a class="btn btn-primary" href="#" role="button">View Claim</a>
<br><br>
<!--  <form  method ="post" action="viewpolicy.htm"><input type="submit" value="View Policy"></form>-->

<a href="viewpolicy.htm?username=${user.username}">View Policies</a>
</body>
</html>