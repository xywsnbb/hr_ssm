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
<script type="text/javascript" src="js/jquery-1.6.1.min.js"></script>
<script type="text/javascript">
	window.onload = function(){
		$('.selectid').change(function(){
			var id = $(this).val();
	        if (id.substring(0,1) == 0){
	            id = id.substring(1,2);
	        }
	        $("#"+id).attr("selected",true);
	    });
	    $('.selectname').change(function(){
			var id = $(this).val();
			$(this).find("option").each(function (i){
				if(id == $(this).val()){
					id = i+1;
				}
			});
	        $("#id"+id).attr("selected",true);
	    });
	}
</script>
</head>
<body>
	<form name="configfilesecondkindForm" method="post"
		action="configfilesecondkind/save.do">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--Ⅱ级机构设置
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="提交"
					class="BUTTON_STYLE1">
					<input type="button" value="返回" class="BUTTON_STYLE1"
					onclick="window.location.href='configfilesecondkind/query.do'"></td>
			</tr>
		</table>
		<input type="hidden" value="${fsk_id }" name="fsk_id">
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="19%" class="TD_STYLE1">I级机构编号</td>
				<td width="81%" class="TD_STYLE2">
					<select name="first_kind_id" class="selectid">
						<c:forEach items="${flist}" var="firstkind" varStatus="i">
							<option id="id${i.count }" value="${firstkind.first_kind_id }">${firstkind.first_kind_id }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">I级机构名称</td>
				<td class="TD_STYLE2">
					<select name="first_kind_name" class="selectname">
						<c:forEach items="${flist}" var="firstkind" varStatus="i">
							<option id=${i.count } value="${firstkind.first_kind_name }">${firstkind.first_kind_name }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td width="19%" class="TD_STYLE1">Ⅱ级机构编号</td>
				<td width="81%" class="TD_STYLE2">
				<input type="text" name="second_kind_id" value="${cfsk.second_kind_id }" class="INPUT_STYLE1">
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">Ⅱ级机构名称</td>
				<td class="TD_STYLE2"><input type="text"
					name="second_kind_name" value="${cfsk.second_kind_name }"
					class="INPUT_STYLE1"></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">薪酬发放责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）</td>
				<td class="TD_STYLE2"><textarea name="second_salary_id"
						rows="4" class="TEXTAREA_STYLE1">${cfsk.second_salary_id }</textarea></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）</td>
				<td class="TD_STYLE2"><textarea name="second_sale_id"
						rows="4" class="TEXTAREA_STYLE1">${cfsk.second_sale_id }</textarea></td>
			</tr>
		</table>
	</form>
</body>
</html>