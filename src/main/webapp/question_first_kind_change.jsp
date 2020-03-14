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
<script type="text/javascript" src="javascript/comm/comm.js"></script>
</head>
<body>
	<form name="frm" method="post"
		action="configQuestionFirstKind/update.do">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--客户化设置--题库管理设置--试题一级分类设置
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="提交"
					class="BUTTON_STYLE1">
					<input type="button" value="返回" class="BUTTON_STYLE1"
					onclick="history.back();"></td>
			</tr>
		</table>

		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="20%" class="TD_STYLE1">
						试题I级分类编号
					</td>
					<td width="20%" class="TD_STYLE1">
						试题I级分类名称
					</td>
			</tr>
			<tr>
				<td width="20%" class="TD_STYLE1">
				<input type="hidden" value="<%=request.getParameter("qfk_id") %>" name="qfk_id"/>
				<input type="hidden" value="<%=request.getParameter("first_kind_id") %>" name="first_kind_id"/>
					<%=request.getParameter("first_kind_id") %>
				</td>
					<td width="20%" class="TD_STYLE1">
						<input type="text" value="<%=request.getParameter("first_kind_name") %>" name="first_kind_name"/>
					</td>
			</tr>
		</table>
	</form>
</body>
</html>