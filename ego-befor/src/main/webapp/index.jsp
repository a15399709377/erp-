<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>后端广告图片</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
	    <table class="table table-striped">
		   <tr>
		   	  <td>编号</td>
		   	  <td>图片</td>
		   </tr>
		   <c:forEach items="${list}" var="pic">
		      <tr>
			   	  <td>${pic.tid}</td>
			   	  <td><img src="images/${pic.tname}" width="60px"/></td>
		      </tr>
		   </c:forEach>   
		</table>
	  
	    <hr/>
		<form method="post" action="add" enctype="multipart/form-data">
			<div class="form-group" >
				<label for="exampleInputFile">广告图片</label> 
				<input type="file" id="exampleInputFile" name="imgFile">
			</div>
			<button type="submit" class="btn btn-default">提交</button>
		</form>
	</div>
</body>
</html>