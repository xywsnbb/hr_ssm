<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		<script type="text/javascript" src="javascript/jquery-1.6.1.min.js"></script>
		<script type="text/javascript">
			$(window).load(function(){
				var str = ``;
				$.ajax({
					type:"POST",
					url:"configQuestionSecondKind/selectAll.do",
					dataType:"json",
					success:function(result){
						/* alert(result[0].first_kind_name);
						alert(result[0].first_kind_id); */
						var list = result;
						
						/* alert("length==="+list.length);
						alert(list[1].first_kind_id);
						alert(list[1].first_kind_name); */
						 for(var i =0 ;i<list.length;i++){
						str += `
						<tr>
						<td class="TD_STYLE2">`+
							list[i].first_kind_id +`
						</td>
						<td class="TD_STYLE2">`+
							list[i].first_kind_name +`
						</td>
						<td class="TD_STYLE2">`+
							list[i].second_kind_id +`
						</td>
						<td class="TD_STYLE2">`+
							list[i].second_kind_name +`
						</td>
						<td class="TD_STYLE2">
							<a href="configQuestionSecondKind/updateModel.do?first_kind_id=`+list[i].first_kind_id+
																	`&first_kind_name=`+list[i].first_kind_name+
																	`&qsk_id=`+list[i].qsk_id+
																	`&second_kind_id=`+list[i].second_kind_id+
																	`&second_kind_name=`+list[i].second_kind_name+
																	`" >变更</a>
						</td>
						<td class="TD_STYLE2">
							<a href="question_second_kind_delete.jsp?first_kind_id=`+list[i].first_kind_id+
																	`&first_kind_name=`+list[i].first_kind_name+
																	`&qsk_id=`+list[i].qsk_id+
																	`&second_kind_id=`+list[i].second_kind_id+
																	`&second_kind_name=`+list[i].second_kind_name+
																	`">删除</a>
						</td>
					</tr>`;
					}
					$('#tab').append(str);
					}
				});
			});
			
			function add(){
				location.href="configQuestionSecondKind/selectFirstKind.do";
			}
		</script>
	</head>

	<body>
		<form method="post" action="">
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是：人力资源--客户化设置--题库管理设置--试题二级分类设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="添加" class="BUTTON_STYLE1"
							onclick="javascript:add()" />
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1" id="tab">
				<tr>
					<td width="20%" class="TD_STYLE1">
						试题I级分类编号
					</td>
					<td width="20%" class="TD_STYLE1">
						试题I级分类名称
					</td>
					<td width="20%" class="TD_STYLE1">
						试题II级分类编号
					</td>
					<td width="20%" class="TD_STYLE1">
						试题II级分类名称
					</td>
					<td width="5%" class="TD_STYLE1">
						变更
					</td>
					<td width="5%" class="TD_STYLE1">
						删除
					</td>
				</tr>
					
				
			</table>
			<p>&nbsp;&nbsp;总数：1例 &nbsp;&nbsp;&nbsp;当前第 1 页  &nbsp;&nbsp;&nbsp;共 1 页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1> 页&nbsp;&nbsp;<input type=image src="images/go.bmp" width=18 height=18 border=0>
		</form>
		<a href = "configQuestionSecondKind/selectAll.do"></a>
		<form action="configQuestionSecondKind/selectAll.do" method="post">
			<input type = "submit" value = "test">
		</form>
	</body>
</html>