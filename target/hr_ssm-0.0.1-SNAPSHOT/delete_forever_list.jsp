<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" href="table.css" type="text/css">
<script type="text/javascript">
	function toDel(id) {
		document.forms[0].action = document.forms[0].action + "?operate=toDelForever&id=" + id;
		document.forms[0].submit();
	}
</script>
</head>

<body>
	<form action="humanfile.do" method="post">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案删除管理--人力资源档案永久删除</font>
				</td>
			</tr>
			<tr>
				<td>符合条件的人力资源档案总数：0例</td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td width="14%" height="13" class="TD_STYLE1">档案编号</td>
				<td width="11%" class="TD_STYLE1">姓名</td>
				<td width="6%" class="TD_STYLE1">性别</td>
				<td width="13%" class="TD_STYLE1">I级机构</td>
				<td width="12%" class="TD_STYLE1">II级机构</td>
				<td width="13%" class="TD_STYLE1">III级机构</td>
				<td width="11%" class="TD_STYLE1">职位分类</td>
				<td width="13%" class="TD_STYLE1">职位名称</td>
				<td width="7%" class="TD_STYLE1">永久删除</td>
			</tr>

		</table>
		<p>
			&nbsp;&nbsp;总数：0例 &nbsp;&nbsp;&nbsp;当前第 1 页 &nbsp;&nbsp;&nbsp;共 1 页
			&nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1>
			页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18
				border=0>
	</form>
</body>
</html>