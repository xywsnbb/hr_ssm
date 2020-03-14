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
</head>
<body>
	<form method="post" action="exportfile.do">
		<table width="100%">
			<tr>
				<td colspan="2"><font color="#0000CC">您正在做的业务是：人力资源--标准数据报表--Excel标准数据报表置
				</font></td>
			</tr>
			<tr>
				<td width="49%">数据输出文件已成功生成，请下载。</td>
				<td width="51%" align="right"><input type="button" value="下载"
					class="BUTTON_STYLE1"> <input type="button" value="返回"
					class="BUTTON_STYLE1" onclick="history.back();"></td>
			</tr>
		</table>

	</form>
</body>
</html>
