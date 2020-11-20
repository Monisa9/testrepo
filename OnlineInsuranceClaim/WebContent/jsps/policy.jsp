<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> User's Policies</title>
</head>
<body>
current user details :<br>
UserName: ${sessionScope.currentUser.username}<br>

RoleCode: ${sessionScope.currentUser.roleCode}<br>



  <table border="1">
    <tr>
    <th>PolicyNumber</th>
    <th>PolicyPremium</th>
    <th>AccountNumber</th>
    <th>Link to Create Claim</th>
    </tr>
    <c:forEach items="${lis}" var="list">
        <tr>
            <td>${list.policyNumber}</td>
            <td><c:out value="${list.policyPremium}" /></td>
            <td>${list.accountNumber}</td>
            <td><a href="#">Click to Create Claim</a>
        </tr>
    </c:forEach>
</table>


</body>
</html>