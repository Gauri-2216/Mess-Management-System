<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="masterPage.jsp"></jsp:include>
<table class="table">
<tr>
<th>ID</th>
<th>Menu Day</th>
<th>Lunch</th>
<th>Dinner</th>
<th>DELETE</th>
<th>UPDATE</th></tr>
<c:forEach var="m" items="${menuList}">
<tr>
<td>${m.getMid()}</td>
<td>${m.getMday()}</td>
<td>${m.getLunch()}</td>
<td>${m.getDinner()}</td>
<td><a href=''>DELETE</a></td>
<td><a href=''>Update</a></td>
</tr>
</c:forEach>
</table>

</div>
</body>
</html>