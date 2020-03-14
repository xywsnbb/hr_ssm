<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
     
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
	<meta content="text/html;charset=utf-8" />
<link rel="stylesheet" href="table.css" type="text/css">
 <script type="text/javascript" src="javascript/comm/comm.js"></script> 
<script type="text/javascript" src="javascript/jquery-1.6.1.min.js"></script>
<script type="text/javascript">
	function back(){
		location.href="question_first_kind.jsp";
	}
</script>
</head>
<body>
	<form name="configfilefirstkindForm" method="post"
		action="configQuestionFirstKind/save.do">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--客户化设置--题库管理设置--试题一级分类设置
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="提交"
					class="BUTTON_STYLE1">
					<input type="button" value="返回" class="BUTTON_STYLE1"
					onclick="javascript:back();"></td>
			</tr>
		</table>

		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="19%" class="TD_STYLE1">I级种类试题编号</td>
				<td width="81%" class="TD_STYLE2"></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">I级种类试题名称</td>
				<td class="TD_STYLE2"><input type="text"
					name="first_kind_name" class="INPUT_STYLE1"></td>
			</tr>
		</table>
	</form>
</body>


</html>