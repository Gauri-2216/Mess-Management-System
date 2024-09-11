<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
<jsp:include page="masterPage.jsp"></jsp:include>
<div>
<h1>Add New Menu</h1>
<form name='frm' action='saveMenu' method='post'>
 <div class="form-group">
    <label>Menu Day</label>
    <input type="text" class="form-control" id="mday" name="mday" placeholder="Enter Menu Day">
  </div>
  <div class="form-group">
    <label>Menu For Lunch</label>
    <input type="text" class="form-control" id="lunch" name="lunch" placeholder="Enter Menu For Lunch">
  </div>
  <div class="form-group">
    <label>Menu For Dinner</label>
    <input type="text" class="form-control" id="dinner" name="dinner" placeholder="Enter Menu For Dinner">
  </div>
  <div class="form-group">
    <input type="submit" class="form-control btn btn-primary" id="s" name="s" value="Add New Menu">
  </div>
  ${msg}
  </form>
</div>



</div>
</body>
</body>
</html>