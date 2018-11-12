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
				<table class="table">
					<thead>
						<tr>
							<td>deptno</td>
							<td>maxsal</td>
							<td>minsal</td>
							<td>avgsal</td>
							<td>counter</td>
							<td>sumsal</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${reportFromServelt}" var="report">
							<tr>
								<td>${report.deptno}</td>
								<td>${report.maxsal}</td>
								<td>${report.minsal}</td>
								<td>${report.avgsal}</td>
								<td>${report.counter}</td>
								<td>${report.sumsal}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<hr />
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<table class="table">
					<thead>
						<tr>
							<td>deptno</td>
							<td>maxsal</td>
							<td>minsal</td>
							<td>avgsal</td>
							<td>counter</td>
							<td>sumsal</td>
						</tr>
					</thead>
					<tbody id="content">
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div id="main" style="width: 600px; height: 400px;"></div>
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script
		src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/echarts/4.1.0.rc2/echarts.min.js"></script>
	<script type="text/javascript">
		$(function() {
			var showEcharts = function(reports) {
				var xAxis_data = [];
				var series_data = [];
				//取出JSON集合对象的每一个单独对象的第一个对象
				for ( var key in reports[0]) {
					xAxis_data.push(key.toUpperCase());
				}
				for (var i = 0; i < reports.length; i++) {
					var report = reports[i];
					//每一个点的数值
					var data = [];
					for ( var j in report) {
						data.push(report[j]);
					}
					var singleLine = {
						type : "line",//样式
						data : data
					}
					//画出线
					series_data.push(singleLine);
				}
				var myChart = echarts.init(document.getElementById('main'));
				//表的x轴y轴设定
				option = {
					title : {
						text : '部门薪资统计表'
					},
					xAxis : {
						type : 'category',
						data : xAxis_data
					},
					yAxis : {
						type : 'value'
					},
					series : series_data
				};
				myChart.setOption(option);
			}
			var showtable = function(reports) {
				for (var i = 0; i < reports.length; i++) {
					var report = reports[i];
					$tr = $("<tr></tr>")
					for ( var j in report) {
						$tr.append($("<td></td>").html(report[j]));
					}
					$("#content").append($tr);
				}
			};
			$.ajax({
				type : "post",
				url : "http://localhost:8080/LoginTest/ReportServlet",
				async : true,
				success : function(data) {
					var reports = JSON.parse(data);
					showtable(reports);
					showEcharts(reports);
				}
			});
		})
	</script>
</body>
</html>