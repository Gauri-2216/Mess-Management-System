<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function searchName(name)
{
	let xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange=function(){
		if(this.readyState==4 && this.status==200){
			document.getElementById("gridshow").innerHTML=this.responseText;
		}
	};
	xhttp.open("GET","searchByName?n="+name,true);
	xhttp.send();
}
</script>
</head>
<body>
<jsp:include page="masterPage.jsp"></jsp:include>
<div class="form-group mt-5">
    <input type="text" class="form-control" id="name" name="name" placeholder="Search........." onkeyup="searchName(this.value)">
  </div>
  <div id="gridshow">
<table class="table">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Contact</th>
<th>Start Date</th>
<th>End Date</th>
<th>Due Date</th>
<th>Paid</th>
<th>Balance</th>
<th>DELETE</th>
<th>UPDATE</th></tr>
<c:forEach var="c" items="${candidateList}">
<tr>
<td>${c.getId()}</td>
<td>${c.getName()}</td>
<td>${c.getUsername()}</td>
<td>${c.getPassword()}</td>
<td>${c.getStart()}</td>
<td>${c.getEnd()}</td>
<td>${c.getDue()}</td>
<td>${c.getPaid() }</td>
<td>${c.getBalance()}</td>
<th><a href='delCandiById?canid=${c.getId()}'>DELETE</a></th>
<th><a href='updateCandidateById?canid=${c.getId()} &name=${c.getName()}&username=${c.getUsername()}&password=
${c.getPassword()}&start=${c.getStart()}&end=${c.getEnd()}&due=${c.getDue()}&paid=${c.getPaid()}&balance=${c.getBalance()}'>UPDATE</a></th>

</tr>
</c:forEach>
</table>
</div>
</body>
</html>