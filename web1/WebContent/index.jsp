<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
		<link rel="stylesheet" href="/static/css/bootstrap.min.css" />
</head>
<body>
	
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				
				<form action="/login" method="post" id="loginform">
					<legend>系统登录</legend>
					<%
					String error = request.getParameter("error");
					if("1001".equals(error)) {
				%>
					<div class="alert alert-danger">账号或密码错误</div>
				<%} %>
					<div class="form-group">
						<label>账号</label>
						<input type="text" name="username" class="form-control" />
					</div>
					<div class="form-group">
						<label>密码</label>
						<input type="password" name="password" class="form-control" />
					</div>
					<button type="button"  class="btn btn-default" id="loginbtn">登录</button>
				</form>
			</div>
		</div>
	</div>

	<script src="/static/js/jquery-3.1.1.min.js"></script>
	<script src="/static/js/jquery.validate.min.js"></script>
	<script>
		$(function() {
			
			$("#loginbtn").click(function() {
				$("#loginform").submit();
			});
			$("#loginform").validate({
				errorElement:"span",
				errorClass:"text-danger",
				rules:{
					username:{
						required:true
					},
					password:{
						required:true
					}
				},
				messages:{
					username:{
						required:"请输入账户"
					},
					password:{
						required:"请输入密码"
					}
				}
			});
		});
	</script>
</body>
</html>


