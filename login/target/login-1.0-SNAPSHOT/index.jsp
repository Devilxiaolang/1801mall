<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<title>登录页面</title>
		<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.css">
		<style type="text/css">
			#msg>div {
				display: inline-block;
			}
			
			#msg {
				min-height: 1em;
			}
		</style>
	</head>

	<body>
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column ">
					<div class="carousel slide" id="carousel-373421">
						<ol class="carousel-indicators">
							<li class="active" data-slide-to="0" data-target="#carousel-373421"></li>
							<li data-slide-to="1" data-target="#carousel-373421"></li>
							<li data-slide-to="2" data-target="#carousel-373421"></li>
						</ol>
						<div class="carousel-inner">
							<div class="item active">
								<img alt="" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1537425369439&di=6893e5aaada5c5f53055e2dc5b44f22d&imgtype=jpg&src=http%3A%2F%2Fi2.hdslb.com%2Fbfs%2Farchive%2F0a8887a2ded561d357caa3c3a6143b06745c7dfd.jpg" />
								<div class="carousel-caption">
								</div>
							</div>
							<div class="item">
								<img alt="" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1538020204&di=ce2ab24b749333de02f96bf14e2f2bd8&imgtype=jpg&er=1&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20180608%2F89ec110d665e431abc9b3d45c04edd60.jpeg" />
								<div class="carousel-caption">
								</div>
							</div>
							<div class="item">
								<img alt="" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1537425564352&di=5d3efd58c7d5f7e219e2c00f6a8dedfb&imgtype=jpg&src=http%3A%2F%2Fimg0.imgtn.bdimg.com%2Fit%2Fu%3D967900320%2C2031403490%26fm%3D214%26gp%3D0.jpg" />
								<div class="carousel-caption">
								</div>
							</div>
						</div>
						<a class="left carousel-control" href="#carousel-373421" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
						<a class="right carousel-control" href="#carousel-373421" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
					</div>
				</div>
			</div>
			<div class="row clearfix" style="margin-top: 10px; margin-bottom: 10px">
				<ul class="nav nav-pills nav-justified">
					<li>
						<a href="#">Home</a>
					</li>
					<li>
						<a href="#">User</a>
					</li>
					<li>
						<a href="#">Product</a>
					</li>
					<li>
						<a href="#">Report</a>
					</li>
					<li>
						<a href="#">Echarts</a>
					</li>
					<li>
						<a href="#">Map</a>
					</li>
				</ul>
			</div>
			<div class="row clearfix">
				<div class="col-md-4 col-md-offset-1 column">
					<form action="${pageContext.request.contextPath}/login.do" method="post">
						<div class="form-group">
							<span>用户名</span>
							<input type="text" name="username"  value="scott" class="form-control" id="username" autofocus />
						</div>
						<div id="msg">
							<div id="exist" style="display: none">
								<i class="fa fa-address-book" style="font-size: 1em; color: green"></i> <span></span>
							</div>
							<div id="no-exist" style="display: none">
								<i class="fa fa-address-book" style="font-size: 1em; color: red"></i>
								<span></span>
							</div>
						</div>
						<div class="form-group">
							<span>密码</span><input type="password" name="password"  value="tiger" class="form-control" id="password" />
						</div>
						<div id="pwd-error" style="display: none">
							<i class="fa fa-heartbeat" style="font-size: 1em; color: red"></i>
							<span></span>
						</div>
						<input type="submit" value="登录">
						<a href="#">注册新用户</a>
					</form>
				</div>
				<div class="col-md-6 col-md-offset-1 column">
					<div style="min-height: 230px;">
						<table class="table table-hover  table-striped">
							<thead>
								<tr>
									<th>产品编号</th>
									<th>产品名称</th>
									<th>价格</th>
									<th>库存</th>
								</tr>
							</thead>
							<tbody>
							</tbody>
						</table>
					</div>
					<ul class="pager">
						<li id="prev">
							<a href="#">Previous</a>
						</li>
						<li id="next">
							<a href="#">Next</a>
						</li>
					</ul>
				</div>
			</div>
		</div>

		<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
		<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script type="text/javascript">
			$(function() {

				var totalPage;
				var currentPage;
				var pageSize;

				//当页面文档加载后，ajax异步请求product产品数据，分页显示到主页中
				var showProductsByPage = function(page, size) {
					$.ajax({
							url: "http://localhost:8080/login/products.do",
							type: "POST",
							contentType:"application/json",
							data:JSON.stringify({
								"page":page,
								"size":size
							}),
							cache:false,
							asynch: true,
							success: function(response) {
								//{data:[......],totalPage:2,currentPage:2,pageSize:5}
								var data = response.data;
								totalPage = data.totalPage;
								currentPage = data.currentPage;
								pageSize = data.pageSize;
								var products = data.data;
								console.log(products);
								$("#prev").removeClass(); //清除所有class状态值
								$("#next").removeClass();
								if(totalPage == 1) {
									$("#prev").css("visibility", "hidden");
									$("#next").css("visibility", "hidden");
								} else if(currentPage == 1) {
									$("#prev").css("visibility", "hidden");
									$("#next").css("visibility", "visible");
								} else if(currentPage == totalPage) {
									$("#prev").css("visibility", "visible");
									$("#next").css("visibility", "hidden");
								} else {
									$("#next").css("visibility", "visible");
									$("#prev").css("visibility", "visible");
								}
								if(products.length > 0) {
									$("tbody").empty();
									for(var i in products) {
										var product = products[i];
										/*
										<tr>
											<th>产品编号</th>
											<th>产品名称</th>
											<th>价格</th>
											<th>库存</th>
										</tr>
										 */
										$tr = $("<tr></tr>");
										for(var j in product) {
											$tr.append($("<td></td>").html(
												product[j]));
										}
										$("tbody").append($tr);
									}
								}
							}
						});
				}

				//显示首页数据
				showProductsByPage(1, 5);
				//添加分页事件
				$("#prev").click(function() {
					showProductsByPage(currentPage - 1, 5);
				});
				$("#next").click(function() {
						showProductsByPage(currentPage + 1, 5);
					})
					//验证用户名不能为空，是否存在
				$(":text")
					.change(
						function(ev) {
							$
								.ajax({
									url: "http://localhost:8080/login/isuser.do?username=" +
										$(this).val(),
									method: "get",
									asynch: true,
									success: function(response) {
									    data = response.msg;
										if(data.indexOf("success") != -1) {
											$("#no-exist").css(
												"display", "none");
											$("#exist").css("display",
												"inline-block");
											$("#exist span:first")
												.html("欢迎，请输入密码")
												.css("color",
													"green");
										} else {
											$("#exist").css("display",
												"none");
											$("#no-exist").css(
												"display", "inline-block");
											$("#no-exist span:first")
												.html(
													($(":text")
														.val() == "") ? "用户名不能为空" :
													"用户名不存在")
												.css("color", "red");
										}
									}
								});
						});

				//验证密码位数及组成
				$(":submit").click(
					function(ev) {
						var password = $(":password").val();
						if($(":text").val() == "") {
							$("#exist").css("display",
								"none");
							$("#no-exist").css(
								"display", "inline-block");
							$("#no-exist span:first")
								.html(
									"用户名不能为空")
								.css("color", "red");
							return false;
						}
						if(/^[a-zA-Z0-9.-_$]{3,10}$/.test(password)) {
							return true; //form表单能够提交
						} else {
							$("#pwd-error").css("display", "block");
							$("#pwd-error span:first").html("密码不符合要求").css(
								"color", "red");
							return false; //form表单不提交
						}
					});
				$(".nav li").mouseover(function(ev) {
					$(this).addClass("active");
				}).mouseout(function(ev) {
					$(this).removeClass("active");
				})

			});
		</script>
	</body>

</html>