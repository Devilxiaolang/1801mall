<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>title</title>
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css">
</head>
<body>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">		
				<form action="${pageContext.request.contextPath}/empAction/emp"
		method="post">
				<table class="table">
						<tr>
							<td>员工姓名</td>
							<td><input type="text" name="ename" value=""></td>
						</tr>
						<tr>
							<td>员工岗位</td>
							<td><input type="text" name="job" value=""></td>
						</tr>
						<tr>
							<td>入职日期</td>
							<td><input type="date" name="hiredate"
								value=""></td>
						</tr>
						<tr>
							<td>经理</td>
							<td><input type="number" name="mgr" value=""></td>
						</tr>
						<tr>
							<td>工资</td>
							<td><input type="number" name="sal" value=""></td>
						</tr>
						<tr>
							<td>奖金</td>
							<td><input type="number" name="comm" value=""></td>
						</tr>
						<tr>
							<td>部门编号</td>
							<td><input type="number" name="deptno" value=""></td>
						</tr>
						<tr>
							<td><input type="submit" value="save"></td>
							<td><input type="reset" value="reset"></td>
						</tr>
				</table>
				</form>
			</div>
		</div>
	</div>
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>