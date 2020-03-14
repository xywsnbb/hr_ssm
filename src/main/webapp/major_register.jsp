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
	<form name="configMajorControllerForm" method="post"
		action="configMajorController/save.do">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--职位设置
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="提交"
					class="BUTTON_STYLE1">
					<input type="button" value="返回" class="BUTTON_STYLE1"
					onclick="window.location.href='configMajorController/query.do'"></td>
			</tr>
		</table>
		<input type="hidden" value="${mak_id }" name="mak_id">
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="19%" class="TD_STYLE1">职位分类编号</td>
				<td width="81%" class="TD_STYLE2">
					<select name="major_kind_id" class="selectid">
						<c:forEach items="${list}" var="mojorkind" varStatus="i">
								<option id="id${i.count }" value="${mojorkind.major_kind_id }">${mojorkind.major_kind_id }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">职位分类名称</td>
				<td class="TD_STYLE2">
					<select name="major_kind_name" class="selectname">
						<c:forEach items="${list}" var="mojorkind" varStatus="i">
								<option id=${i.count } value="${mojorkind.major_kind_name }">${mojorkind.major_kind_name }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td width="19%" class="TD_STYLE1">职位编号</td>
				<td width="81%" class="TD_STYLE2"><input type="text" value="" name="major_id"></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">职位名称</td>
				<td class="TD_STYLE2"><input type="text"
					name="major_name" value="" class="INPUT_STYLE1"></td>
			</tr>
		</table>
	</form>
</body>
</html>