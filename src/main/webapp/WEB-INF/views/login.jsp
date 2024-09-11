<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
*{
margin:0;
padding:0;
box-sizing:0;
}
h1{
margin-left:600px;
}
.form-box
{
width:60%;
height:500px;
margin:auto;
border:1px solid black;
margin-top:100px;
}
</style>
<body>
<h1>Register Here</h1>
<body>
	<div class="form-box">
	Login Form
		<div class="header-text">
		<form name="frm" action="reg" method="GET">		
		</div><input placeholder="Your Email Address" type="text" name="username">
		 <input placeholder="Your Password" type="password" name="password">
		   <button>login</button>
		   </form>
	</div>
</body>
</html>