<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="copyright" content="All Rights Reserved, Copyright (C) 2018, Wuyeguo, Ltd." />
<title>登录</title>
<link rel="stylesheet" type="text/css" href="easyui/1.3.4/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="css/wu.css" />
<link rel="stylesheet" type="text/css" href="css/icon.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="easyui/1.3.4/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/1.3.4/locale/easyui-lang-zh_CN.js"></script>
<style type="text/css">

	.imgbody{
		background: url(images/login.jpg);
		background-repeat: no-repeat;
		background-size: 100% 100%;
		background-attachment:fixed ;
	}
	
.myTitle{
		position: fixed;
		top: 15%;
		left: 35%;
		letter-spacing: 20px;
		font-family: STCaiyun;
		font-size: 38px;
	}


</style>
	</head>

	<body class="imgbody">
		<h1 class="myTitle">xxx人力资源系统</h1>
		<div id="login" class="easyui-window" title="用户登录" style="padding: 35px; width: 400px; height: 300px;">
			<div style="text-align: center; padding: 5px;">
				
					<div>
						<img src="images/user.png" widthe="20" height="20" style="position: relative; top: 5px;" />
						<!--用户登录输入框-->
						<label for="userName">用户名:&nbsp;</label>
						<input class="wu-text" style="width:160px" type="text" name="userName" placeholder="请输入用户名"></input>
					</div>
					<br />
					<div>
						<img src="images/pwd.png" widthe="20" height="20" style="position: relative; top: 5px;" />
						<!--密码登录输入框-->
						<label for="userPwd">密&nbsp;码:&nbsp;&nbsp;&nbsp; </label>
						<input class="wu-text" style="width:160px" name="userPwd" type="password" placeholder="请输入密码" ></input>
					</div>
					<div>
						<img src="images/pwd.png" width="20" height="20" style="position: relative; top: 5px;" />
						<label >验证码:&nbsp;</label>
						<input type="text" id="valCode" class="wu-text" style="width:160px" placeholder="请输入验证码" > 
						<br>
						<br>
						<img id="vimg" src="valCode.do" width="90" height="30" onclick="resh()">
					</div>
				
					<br/>
					<!--登录按钮-->
					<a href="javascript:void(0)" class="easyui-linkbutton" icon="icon-ok" onclick="login()">登录</a> &nbsp;&nbsp;&nbsp;
					<a href="javascript:void()" class="easyui-linkbutton" iconCls="icon-cancel" onclick="register()">取消</a>
			
			</div>
		</div>

		<script type="text/javascript">
			/* 登录触发方法 */
			function login() {
				var code = $("#valCode").val();
				$.ajax({
					url:"loginSubmit.do",
					type:"post",
					data:{'valCode':code},
					dataType:"json",
					success:function(data){
						if(data){
							alert("验证码输入正确");
						}else{
							alert("验证码输入失败");
						}
					}
					
				});
			}
			
					//登录窗口的设置
		$('#login').window({
			collapsible:false,//关闭折叠按钮
			maximizable:false,//关闭最大化按钮
			minimizable:false,//关闭最小化按钮
			resizable:false,//不允许调整尺寸
			draggable:false,//关闭拖拽
			closable:false//不显示关闭图标
		});
		//验证码刷新		
		function resh(){
			//获取现在时间的原始值
	    	var timestamp = (new Date()).valueOf();
			console.log(timestamp)
			//取出原src
	    	var url = $("#vimg").attr("src");
			//在原src后面拼接时间戳
	    	url = url + "?timestamp=" + timestamp;
			//将改变的后的url赋值给src
	    	$("#vimg").attr("src", url);
		}
		</script>
	</body>

</html>