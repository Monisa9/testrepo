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
Current Users's Policies are:

current user details : ${sessionScope.currentUser.username}<br>

${sessionScope.currentUser.roleCode}
<c:forEach items="${map}" var="partnerTypesMap">
 
  ${partnerTypesMap['key']}<br>
    
      ${partnerTypesMap['value']}<br><br>
   
    
</c:forEach>

</body>
</html>