<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="easyui/1.3.4/themes/default/easyui.css" />
		<link rel="stylesheet" type="text/css" href="css/wu.css" />
		<link rel="stylesheet" type="text/css" href="css/icon.css" />
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="easyui/1.3.4/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="easyui/1.3.4/locale/easyui-lang-zh_CN.js"></script>
		
	
	</head>
	<body>
		<!--页面布局开始-->
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'center',border:false">
				<!-- 工具栏 开始-->
				<div id="wu-toolbar">
					<div class="wu-toolbar-button">
						<a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加</a>
						<a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()" plain="true">修改</a>
						<a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="remove()" plain="true">删除</a>
				
					</div>
					<div class="wu-toolbar-search">

						<label>姓名：</label><input class="wu-text" id="selectSname" style="width:100px">
						<label>性别：</label>	<input type="radio" name="selecctSex" value="男" />男
											<input type="radio" name="selecctSex" value="女" />女
						<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="selectInfo()">查询</a>
					</div>
				</div>
				<!-- 工具栏结束 -->
				<!--表格开始-->
				<table id="wu-datagrid" toolbar="#wu-toolbar"></table>

				<!--表格结束-->
			</div>
		</div>
		<!--页面布局介绍-->
		
		<!-- 模态框开始 -->
		<div id="wu-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px; padding:10px;">
			<form id="wu-form" method="get">
				<table>	
					<tr>					
						<td><input type="hidden" name="sId" class="wu-text" /></td>
					</tr>
					<tr>
						<td width="60" align="right">姓名:</td>
						<td><input type="text" name="sName" class="wu-text" /></td>
					</tr>
					<tr>
						<td align="right">性别:</td>
						<td>
						<input type="radio" name="sSex" value="男" />男
						<input type="radio" name="sSex" value="女" />女
						</td>
					</tr>
				</table>
			</form>
		</div>
		<!-- 模态框结束 -->
	</body>
<script>

/**
 * 加载列表数据
 */
$('#wu-datagrid').datagrid({
	url: 'selectStudent.do',//服务端地址
	method: "get", //提交方式	
	title : '学生列表', //表格名称
	iconCls : 'icon-chart-organisation', //图标
	singleSelect: true,//是否允许多选，true：单选，false:多选
 	pagination : true,//如果表格需要支持服务端分页，必须设置该选项为true
	pageSize : 2, //表格中每页显示的行数 row:2 page:1
	pageList : [ 2, 5, 10],//分页下来选择框 
	fitColumns: true,//表格的列自适应父级容器
	fit:true,//表格的高度是否适宜当前页面,true:表示适宜,false:不适宜
	remoteSort : false,//是否从服务器排序数
	sortName : 'sId', //按照指定的sId列的值排序
	sortOrder : 'asc', //使用倒序排序 */
	columns: [
		[{
				checkbox: true
			},
			{
				field: 'sId',
				title: '编号',
				width:20,
				sortable: true
			},
			{
				field: 'sName',
				title: '姓名',
				width: 100,
				sortable: true
			},
			{
				field: 'sSex',
				title: '性别',
				width: 100
			}

		]
	]
});

	/**
	 * 添加操作
	 */
	function add() {
		$('#wu-form').form('submit', {
			url: 'add.do',//服务端url地址
			success: function(data) {
				if(data) {
					$.messager.alert('信息提示', '提交成功！', 'info');
					//关闭模态框
					$('#wu-dialog').dialog('close');
					//刷新列表
					$('#wu-datagrid').datagrid("reload");
				} else {
					$.messager.alert('信息提示', '提交失败！', 'info');
				}
			}
		});
	}

	/**
	 * 修改操作
	 */
	function edit() {
		$('#wu-form').form('submit', {
			url: 'update.do',
			success: function(data) {
				if(data) {
					$.messager.alert('信息提示', '提交成功！', 'info');
					//关闭模态框
					$('#wu-dialog').dialog('close');
					//重新加载行，就像 load 方法一样，但是保持在当前页
					$('#wu-datagrid').datagrid("reload");
				} else {
					$.messager.alert('信息提示', '提交失败！', 'info');
				}
			}
		});
	}

	/**
	 * 删除操作
	 */
	function remove() {
		$.messager.confirm('信息提示', '确定要删除该记录？', function(result) {
			if(result) {
				//获取选中行的对象
				var items = $('#wu-datagrid').datagrid('getSelected');
				console.log(items);
				$.ajax({
					url: 'del.do',
					data: {"id":items.sId},
					success: function(data) {
						if(data) {
							$.messager.alert('信息提示', '删除成功！', 'info');
						} else {
							$.messager.alert('信息提示', '删除失败！', 'info');
						}
						//重新加载行，就像 load 方法一样，但是保持在当前页
						$('#wu-datagrid').datagrid("reload");
					}
				});
			}
		});
	}

	/**
	 *  打开添加模态窗口
	 */
	function openAdd() {
		//清空模态框中的表单数据
		$('#wu-form').form('clear');
		
		$('#wu-dialog').dialog({
			closed: false,
			modal: true,
			title: "添加信息",
			buttons: [{
				text: '确定',
				iconCls: 'icon-ok',
				handler: add
			}, {
				text: '取消',
				iconCls: 'icon-cancel',
				handler: function() {
					$('#wu-dialog').dialog('close');
				}
			}]
		});
	}

	/**
	 * 打开修改模态窗口
	 */
	function openEdit() {
		$('#wu-form').form('clear');
		//获取当前选中行数据
		var item = $('#wu-datagrid').datagrid('getSelected');
		//把选中行的数据绑定到模态框窗口的表单中
		$('#wu-form').form('load', item)

		$('#wu-dialog').dialog({
			closed: false,
			modal: true,
			title: "修改信息",
			buttons: [{
				text: '确定',
				iconCls: 'icon-ok',
				handler: edit
			}, {
				text: '取消',
				iconCls: 'icon-cancel',
				handler: function() {
					$('#wu-dialog').dialog('close');
				}
			}]
		});
	}

	

	
	//条件查询
	function selectInfo(){
		
		var sName = $("#selectSname").val();
		var sSex = $("input[name='selecctSex']:checked").val();
		
		$('#wu-datagrid').datagrid("load",{"sName":sName,"sSex":sSex});
	}
</script>
</html>

