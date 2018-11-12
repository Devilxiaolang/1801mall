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
				<div class="page-header">
					<h1>
						welcome <small>${username}</small>
					</h1>
				</div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-12 column">
				<table class="table">
					<tr>
						<th>编号</th>
						<th>姓名</th>
						<th>岗位</th>
						<th>入职时间</th>
						<th>经理</th>
						<th>工资</th>
						<th>奖金</th>
						<th>部门编号</th>
					</tr>
					<c:forEach items="${res.data}" var="emp">
						<tr>
							<td>${emp.empno}</td>
							<td>${emp.ename}</td>
							<td>${emp.job}</td>
							<td>${emp.mgr}</td>
							<td>${emp.hiredate}</td>
							<td>${emp.sal}</td>
							<td>${emp.comm}</td>
							<td>${emp.deptno}</td>
							<td>
								<form action="${pageContext.request.contextPath}/empAction/emp/${emp.empno}" method="post">
									<input type="hidden" name="_method" value="DELETE">
									<input type="submit" value="delete">
								</form>
								<a
								href="${pageContext.request.contextPath}/empAction/emp/${emp.empno}">update</a></td>
						</tr>
					</c:forEach>
				</table>
				<center>
					<ul class="pagination">
						<%--使用路由跳转到其他页面--%>
						<li><a
							href="${pageContext.request.contextPath}/emp_save.jsp">creat
								new emp</a></li>
						<li><a href="${pageContext.request.contextPath}/ReportServlet">get report</a></li>
					</ul>
				</center>
						<form
							action="${pageContext.request.contextPath}/EmpFindByNameServlet"
							method="post">
							<input type="text" name="ename"> <input type="submit"
								value="find by ename">
						</form>
			</div>
		</div>
	</div>
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>