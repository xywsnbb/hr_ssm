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
<script type="text/javascript" src="javascript/jquery-1.6.1.min.js"></script>
<script type="text/javascript">
		function doDelete(qsk_id){
			location.href="configQuestionSecondKind/"+qsk_id+"/delete.do";
				/*  alert(qfk_id);
				$.post({
					url:"configQuestionFirstKind/"+qfk_id+"/delete.do",
					success:function(result){
					}
				});  */
			}
</script>
</head>
<body>
	<form method="post" action="configfilefirstkind.do">
		<table width="100%">
			<tr>
				<td colspan="2"><font color="#0000CC">您正在做的业务是：人力资源--客户化设置--题库管理设置--试题一级分类设置
				</font></td>
			</tr>
			<tr>
				<td width="49%">您确认删除<%=request.getParameter("first_kind_id") %> / 
				 <%=request.getParameter("first_kind_name") %> /
				 <%=request.getParameter("second_kind_id") %> / 
				 <%=request.getParameter("second_kind_name") %>这条记录吗?</td>
				<td width="51%" align="right"><input type="button" value="删除"
					class="BUTTON_STYLE1" onclick="javascript:doDelete(<%=request.getParameter("qsk_id") %>)"> <input
					type="button" value="返回" class="BUTTON_STYLE1"
					onclick="history.back();"></td>
			</tr>
		</table>

	</form>
</body>
</html>