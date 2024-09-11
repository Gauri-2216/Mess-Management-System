<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
<jsp:include page="masterPage.jsp"></jsp:include>
<div>
<h1>Add New Candidate</h1>
<form name='frm' action='savecandidate' method='post'>
 <div class="form-group">
    <label>Candidate Name</label>
    <input type="text" class="form-control" id="name" name="name" placeholder="Enter Name">
  </div>
  <div class="form-group">
    <label>Candidate Email</label>
    <input type="email" class="form-control" id="email" name="username" placeholder="Enter Email">
  </div>
  
  <div class="form-group">
    <label>Candidate Mobile No.</label>
    <input type="text" class="form-control" id="mobile" name="password" placeholder="Enter Mobile No">
  </div>
  <div class="form-group">
    <label>Start Date</label>
    <input type="date" class="form-control" id="start" name="start" placeholder="Enter Start Date">
  </div>
  <div class="form-group">
    <label>End Date</label>
    <input type="date" class="form-control" id="end" name="end" placeholder="Enter End Date">
  </div>
  <div class="form-group">
    <label>Due Date</label>
    <input type="date" class="form-control" id="due" name="due" placeholder="Enter Due Date">
  </div>
  <div class="form-group">
    <label>Amount Paid</label>
    <input type="number" class="form-control" id="paid" name="paid" placeholder="Enter Amount paid">
  </div>
  <div class="form-group">
    <label>Balance Amount</label>
    <input type="number" class="form-control" id="balance" name="balance" placeholder="Enter Balance Amount">
  </div>
  <div class="form-group">
    <input type="submit" class="form-control btn btn-primary" id="s" name="s" value="Add New Candidate">
  </div>
  ${msg}
  </form>
</div>



</div>
</body>
</html>