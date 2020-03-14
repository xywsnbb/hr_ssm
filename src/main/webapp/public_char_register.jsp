<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		action="publicCharController/save.do">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--公共属性设置
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="提交"
					class="BUTTON_STYLE1">
					<input type="button" value="返回" class="BUTTON_STYLE1"
					onclick="window.location.href='publicCharController/query.do'"></td>
			</tr>
		</table>
		<input type="hidden" value="${pbc_id }" name="pbc_id">
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="19%" class="TD_STYLE1">属性种类</td>
				<td width="81%" class="TD_STYLE2">
					<input type="text" value="" name="attribute_kind" class="INPUT_STYLE1">
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">属性名称</td>
				<td class="TD_STYLE2"><input type="text"
					name="attribute_name" value="" class="INPUT_STYLE1"></td>
			</tr>
		</table>
	</form>
</body>
</html>