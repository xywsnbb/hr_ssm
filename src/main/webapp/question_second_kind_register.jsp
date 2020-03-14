<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		location.href="question_second_kind.jsp";
	}
	
	$(function(){
		$('#select_1').change(function(){
			var val = $('#select_1').val();
			/* alert("===="+val+"=====");
			alert("${mapFirstKind}"); */
			var str = "${mapFirstKind}";
			str = str.substring(1, str.length-1);
			//alert(str);
			var html = "";
			/* var para = map[1]; */
			var arr = str.split(',')
			//alert("arr[1]"+"-----------"+arr[1]);
			for(var num = 0;num<arr.length;num++){
               var arr1 = arr[num].split('=');
             /*   alert(arr1+"======"+arr1[0]+"========="+arr1[1]); */
               if(arr1[0].trim() == val){
               		/* alert("arr1[1]===="+arr1[1]); */
               		html = arr1[1];
               		$('#first_kind_id').val(arr1[0].trim());
               		$('#first_kind_name').val(arr1[1]);
               		break;
               }
             }
			
			/* alert(arr[1]);
			alert(arr[val].substring(4));
			alert(arr[val]); */
			$('#select_2').html(html);
		})
	});
</script>
</head>
<body>
	<form name="configfilefirstkindForm" method="post"
		action="configQuestionSecondKind/save.do">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--客户化设置--题库管理设置--试题二级分类设置
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="提交"
					class="BUTTON_STYLE1">
					<input type="button" value="返回" class="BUTTON_STYLE1"
					onclick="back()"></td>
			</tr>
		</table>

		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="19%" class="TD_STYLE1">I级种类试题编号</td>
				<input type="hidden"  name="first_kind_id" id="first_kind_id"/>
				<td width="81%" class="TD_STYLE2"><!-- <input type="text"
					name="first_kind_id" class="INPUT_STYLE1"> -->
					<select id="select_1">
						 <option>请选择种类编号</option>
						<c:forEach var="key" items="${mapFirstKind.keySet() }">
							<option>${key }</option>
						</c:forEach>
					</select>
					</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">I级种类试题名称</td>
				<input type="hidden" name="first_kind_name" id="first_kind_name"/>
				<td class="TD_STYLE2" id="select_2">
				<!-- <select >
					
					<input type="text"
						name="first_kind_name" class="INPUT_STYLE1"></td>
				</select> -->
			</tr>
			<tr>
				<td width="19%" class="TD_STYLE1">II级种类试题编号</td>
				<td width="81%" class="TD_STYLE2"></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">II级种类试题名称</td>
				<td class="TD_STYLE2"><input type="text"
					name="second_kind_name" class="INPUT_STYLE1"></td>
			</tr>
		</table>
	</form>
</body>


</html>