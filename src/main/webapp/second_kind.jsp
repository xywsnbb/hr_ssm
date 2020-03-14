<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<link rel="stylesheet" href="table.css" type="text/css">
		<script type="text/javascript" src="javascript/comm/comm.js"></script>
	</head>

	<body>
		<form method="post" action="configfilesecondkind.do">
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--Ⅱ级机构设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="添加" class="BUTTON_STYLE1"
							onclick="window.location.href='configfilesecondkind/add.do'" />
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="15%" class="TD_STYLE1">
						I级机构编号
					</td>
					<td width="15%" class="TD_STYLE1">
						I级机构名称
					</td>
					<td width="15%" class="TD_STYLE1">
						Ⅱ级机构编号
					</td>
					<td width="15%" class="TD_STYLE1">
						Ⅱ级机构名称
					</td>
					<td width="15%" class="TD_STYLE1">
						薪酬发放责任人编号
					</td>
					<td width="15%" class="TD_STYLE1">
						销售责任人编号
					</td>
					<td width="5%" class="TD_STYLE1">
						变更
					</td>
					<td width="5%" class="TD_STYLE1">
						删除
					</td>
				</tr>
				
				<c:forEach items="${list}" var="secondkind" varStatus="i">
					<tr>
						<td class="TD_STYLE2">
							${secondkind.first_kind_id }
						</td>
						<td class="TD_STYLE2">
							${secondkind.first_kind_name }
						</td>
						<td class="TD_STYLE2">
							${secondkind.second_kind_id }
						</td>
						<td class="TD_STYLE2">
							${secondkind.second_kind_name }
						</td>
						<td class="TD_STYLE2">
							${secondkind.second_salary_id }
						</td>
						<td class="TD_STYLE2">
							${secondkind.second_sale_id }
						</td>
						<td class="TD_STYLE2">
							<a href="configfilesecondkind/change.do?fsk_id=${secondkind.fsk_id}">变更</a>
						</td>
						<td class="TD_STYLE2">
							<a href="configfilesecondkind/delete.do?fsk_id=${secondkind.fsk_id}">删除</a>
						</td>
					</tr>
				</c:forEach>
				
			</table>
			<p>&nbsp;&nbsp;总数：${max }例 &nbsp;&nbsp;&nbsp;当前第 1 页  &nbsp;&nbsp;&nbsp;共 1 页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0>
		</form>
	</body>
</html>