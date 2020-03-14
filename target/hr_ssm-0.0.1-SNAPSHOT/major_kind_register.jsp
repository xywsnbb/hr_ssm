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
<link rel="stylesheet" href="table.css" type="text/css">
<script type="text/javascript" src="javascript/comm/comm.js"></script>
</head>
<body>
	<form name="configMajorKindControllerForm" method="post"
		action="configMajorKindController/save.do">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--职位分类设置
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="提交"
					class="BUTTON_STYLE1">
					<input type="button" value="返回" class="BUTTON_STYLE1"
					onclick="window.location.href='configMajorKindController/query.do'"></td>
			</tr>
		</table>
		<input type="hidden" value="${mfk_id }" name="mfk_id">
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="19%" class="TD_STYLE1">职位分类编号</td>
				<td width="81%" class="TD_STYLE2">${major_kind_id }</td>
				<input type="hidden" value="${major_kind_id }" name="major_kind_id">
			</tr>
			<tr>
				<td class="TD_STYLE1">职位分类名称</td>
				<td class="TD_STYLE2"><input type="text"
					name="major_kind_name" value="" class="INPUT_STYLE1"></td>
			</tr>
		</table>
	</form>
</body>
</html>