<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link rel="stylesheet" href="table.css" type="text/css">
		<link rel="stylesheet" type="text/css" media="all"
			href="javascript/calendar/calendar-win2k-cold-1.css">
		<script type="text/javascript" src="javascript/calendar/cal.js"></script>
		<script type="text/javascript" src="javascript/comm/list.js"></script>
		<script type="text/javascript">
		var subcat = new Array(2);
subcat[0] = ["1", "集团/软件公司","集团","集团/软件公司"];
subcat[1] = ["2", "集团/生物科技有限公司","集团","集团/生物科技有限公司"];
var subcat1 = new Array(2);
subcat1[0] = ["1", "外包组", "集团/软件公司/外包组","集团/软件公司"];
subcat1[1] = ["2", "药店", "集团/生物科技有限公司/药店","集团/生物科技有限公司"];

		 	function selAll(obj)
		 	{
		 		var cho = document.all.choice.value;
		 		if(cho == "全选")
		 			document.all.choice.value = "取消";
		 		else
		 			document.all.choice.value = "全选";
		 			
		 		 for(var i=0;i<obj.elements.length;i++){
		 			if(obj.elements[i].tagName.toLowerCase()=="input" &&　obj.elements[i].type=="checkbox"){
		 				if(cho == "全选")
		 					obj.elements[i].checked=true;
		 				else
		 					obj.elements[i].checked=false;
		 			}
		 		}
		 	}
		 	function downExport()
		 	{
		 		//document.forms[0].action = document.forms[0].action + "?operate=downExport&method=excel";
				document.forms[0].action = "excel_success.jsp";
				document.forms[0].submit();
		 	}
</script>
	</head>

	<body>
	
		<form action="exportfile.do" method="post">
				<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是：人力资源--标准数据报表--Excel标准数据报表</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="确定" class="BUTTON_STYLE1" onclick="downExport();">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back();">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td class="TD_STYLE1" colspan="4">
						请选择要导出的字段&nbsp;
						<input type="button" name="choice" value="全选"
							class="BUTTON_STYLE1" onclick="selAll(this.form)">
					</td>
				</tr>
				
					<input type="hidden" name="list[0].columnCN" value="I级机构名称">
					<input type="hidden" name="list[0].columnEN" value="firstKindName">
					<tr>
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[0].checked" value="on">I级机构名称
						</td>
					
				
					<input type="hidden" name="list[1].columnCN" value="II级机构名称">
					<input type="hidden" name="list[1].columnEN" value="secondKindName">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[1].checked" value="on">II级机构名称
						</td>
					
				
					<input type="hidden" name="list[2].columnCN" value="III级机构名称">
					<input type="hidden" name="list[2].columnEN" value="thirdKindName">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[2].checked" value="on">III级机构名称
						</td>
					
				
					<input type="hidden" name="list[3].columnCN" value="档案编号">
					<input type="hidden" name="list[3].columnEN" value="humanId">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[3].checked" value="on">档案编号
						</td>
					</tr>
				
					<input type="hidden" name="list[4].columnCN" value="姓名">
					<input type="hidden" name="list[4].columnEN" value="humanName">
					<tr>
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[4].checked" value="on">姓名
						</td>
					
				
					<input type="hidden" name="list[5].columnCN" value="住址">
					<input type="hidden" name="list[5].columnEN" value="humanAddress">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[5].checked" value="on">住址
						</td>
					
				
					<input type="hidden" name="list[6].columnCN" value="邮编">
					<input type="hidden" name="list[6].columnEN" value="humanPostcode">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[6].checked" value="on">邮编
						</td>
					
				
					<input type="hidden" name="list[7].columnCN" value="职称">
					<input type="hidden" name="list[7].columnEN" value="humanProDesignation">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[7].checked" value="on">职称
						</td>
					</tr>
				
					<input type="hidden" name="list[8].columnCN" value="职位分类名称">
					<input type="hidden" name="list[8].columnEN" value="humanMajorKindName">
					<tr>
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[8].checked" value="on">职位分类名称
						</td>
					
				
					<input type="hidden" name="list[9].columnCN" value="职位名称">
					<input type="hidden" name="list[9].columnEN" value="hunmaMajorName">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[9].checked" value="on">职位名称
						</td>
					
				
					<input type="hidden" name="list[10].columnCN" value="开户银行">
					<input type="hidden" name="list[10].columnEN" value="humanBank">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[10].checked" value="on">开户银行
						</td>
					
				
					<input type="hidden" name="list[11].columnCN" value="银行账户">
					<input type="hidden" name="list[11].columnEN" value="humanAccount">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[11].checked" value="on">银行账户
						</td>
					</tr>
				
					<input type="hidden" name="list[12].columnCN" value="电话">
					<input type="hidden" name="list[12].columnEN" value="humanTelephone">
					<tr>
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[12].checked" value="on">电话
						</td>
					
				
					<input type="hidden" name="list[13].columnCN" value="手机">
					<input type="hidden" name="list[13].columnEN" value="humanMobilephone">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[13].checked" value="on">手机
						</td>
					
				
					<input type="hidden" name="list[14].columnCN" value="email">
					<input type="hidden" name="list[14].columnEN" value="humanEmail">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[14].checked" value="on">email
						</td>
					
				
					<input type="hidden" name="list[15].columnCN" value="爱好">
					<input type="hidden" name="list[15].columnEN" value="humanHobby">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[15].checked" value="on">爱好
						</td>
					</tr>
				
					<input type="hidden" name="list[16].columnCN" value="特长">
					<input type="hidden" name="list[16].columnEN" value="humanSpeciality">
					<tr>
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[16].checked" value="on">特长
						</td>
					
				
					<input type="hidden" name="list[17].columnCN" value="性别">
					<input type="hidden" name="list[17].columnEN" value="humanSex">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[17].checked" value="on">性别
						</td>
					
				
					<input type="hidden" name="list[18].columnCN" value="宗教信仰">
					<input type="hidden" name="list[18].columnEN" value="humanReligion">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[18].checked" value="on">宗教信仰
						</td>
					
				
					<input type="hidden" name="list[19].columnCN" value="政治面貌">
					<input type="hidden" name="list[19].columnEN" value="humanParty">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[19].checked" value="on">政治面貌
						</td>
					</tr>
				
					<input type="hidden" name="list[20].columnCN" value="国籍">
					<input type="hidden" name="list[20].columnEN" value="humanNationality">
					<tr>
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[20].checked" value="on">国籍
						</td>
					
				
					<input type="hidden" name="list[21].columnCN" value="民族">
					<input type="hidden" name="list[21].columnEN" value="humanRace">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[21].checked" value="on">民族
						</td>
					
				
					<input type="hidden" name="list[22].columnCN" value="生日">
					<input type="hidden" name="list[22].columnEN" value="humanBirthday">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[22].checked" value="on">生日
						</td>
					
				
					<input type="hidden" name="list[23].columnCN" value="出生地">
					<input type="hidden" name="list[23].columnEN" value="humanBirthplace">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[23].checked" value="on">出生地
						</td>
					</tr>
				
					<input type="hidden" name="list[24].columnCN" value="年龄">
					<input type="hidden" name="list[24].columnEN" value="humanAge">
					<tr>
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[24].checked" value="on">年龄
						</td>
					
				
					<input type="hidden" name="list[25].columnCN" value="学历">
					<input type="hidden" name="list[25].columnEN" value="humanEducatedDegree">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[25].checked" value="on">学历
						</td>
					
				
					<input type="hidden" name="list[26].columnCN" value="教育年限">
					<input type="hidden" name="list[26].columnEN" value="humanEducatedYears">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[26].checked" value="on">教育年限
						</td>
					
				
					<input type="hidden" name="list[27].columnCN" value="专业">
					<input type="hidden" name="list[27].columnEN" value="humanEducatedMajor">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[27].checked" value="on">专业
						</td>
					</tr>
				
					<input type="hidden" name="list[28].columnCN" value="社会保障号码">
					<input type="hidden" name="list[28].columnEN" value="humanSocietySecurityId">
					<tr>
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[28].checked" value="on">社会保障号码
						</td>
					
				
					<input type="hidden" name="list[29].columnCN" value="身份证号">
					<input type="hidden" name="list[29].columnEN" value="humanIdCard">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[29].checked" value="on">身份证号
						</td>
					
				
					<input type="hidden" name="list[30].columnCN" value="薪酬标准编号">
					<input type="hidden" name="list[30].columnEN" value="salaryStandardId">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[30].checked" value="on">薪酬标准编号
						</td>
					
				
					<input type="hidden" name="list[31].columnCN" value="薪酬标准">
					<input type="hidden" name="list[31].columnEN" value="salaryStandardName">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[31].checked" value="on">薪酬标准
						</td>
					</tr>
				
					<input type="hidden" name="list[32].columnCN" value="基本薪酬总额">
					<input type="hidden" name="list[32].columnEN" value="salarySum">
					<tr>
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[32].checked" value="on">基本薪酬总额
						</td>
					
				
					<input type="hidden" name="list[33].columnCN" value="实发薪酬总额">
					<input type="hidden" name="list[33].columnEN" value="paidSalarySum">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[33].checked" value="on">实发薪酬总额
						</td>
					
				
					<input type="hidden" name="list[34].columnCN" value="调动次数">
					<input type="hidden" name="list[34].columnEN" value="majorChangeAmount">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[34].checked" value="on">调动次数
						</td>
					
				
					<input type="hidden" name="list[35].columnCN" value="激励次数">
					<input type="hidden" name="list[35].columnEN" value="bonusAmount">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[35].checked" value="on">激励次数
						</td>
					</tr>
				
					<input type="hidden" name="list[36].columnCN" value="培训次数">
					<input type="hidden" name="list[36].columnEN" value="trainingAmount">
					<tr>
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[36].checked" value="on">培训次数
						</td>
					
				
					<input type="hidden" name="list[37].columnCN" value="个人履历">
					<input type="hidden" name="list[37].columnEN" value="humanHistroyRecords">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[37].checked" value="on">个人履历
						</td>
					
				
					<input type="hidden" name="list[38].columnCN" value="家庭关系信息">
					<input type="hidden" name="list[38].columnEN" value="humanFamilyMembership">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[38].checked" value="on">家庭关系信息
						</td>
					
				
					<input type="hidden" name="list[39].columnCN" value="备注">
					<input type="hidden" name="list[39].columnEN" value="remark">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[39].checked" value="on">备注
						</td>
					</tr>
				
					<input type="hidden" name="list[40].columnCN" value="档案变更累计">
					<input type="hidden" name="list[40].columnEN" value="fileChangAmount">
					<tr>
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[40].checked" value="on">档案变更累计
						</td>
					
				
					<input type="hidden" name="list[41].columnCN" value="登记人">
					<input type="hidden" name="list[41].columnEN" value="register">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[41].checked" value="on">登记人
						</td>
					
				
					<input type="hidden" name="list[42].columnCN" value="建档时间">
					<input type="hidden" name="list[42].columnEN" value="registTime">
					
						<td class="TD_STYLE2">
							<input type="checkbox" name="list[42].checked" value="on">建档时间
						</td>
					
				
				</table>
			<br>
				<table class="TABLE_STYLE1" width="100%">
						<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择员工所在I级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="item.firstKindName" size="5" onchange="changelocation(document.forms[0].elements['item.secondKindName'],document.forms[0].elements['item.firstKindName'].options[document.forms[0].elements['item.firstKindName'].selectedIndex].value)" class="SELECT_STYLE2"><option value="">&nbsp;</option>
							
								<option value="集团">集团</option>
							
								<option value="02">02</option></select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请选择员工所在II级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="item.secondKindName" size="5" onchange="changelocation1(document.forms[0].elements['item.thirdKindName'],document.forms[0].elements['item.secondKindName'].options[document.forms[0].elements['item.secondKindName'].selectedIndex].value)" class="SELECT_STYLE2"><script language="javascript">
								changelocation(document.forms[0].elements["item.secondKindName"],document.forms[0].elements["item.firstKindName"].value)
    						</script></select>
					</td>
				</tr>
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择员工所在III级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="item.thirdKindName" size="5" class="SELECT_STYLE2"><script language="javascript">
							changelocation1(document.forms[0].elements["item.thirdKindName"],document.forms[0].elements["item.secondKindName"].value)
							</script></select>
					</td>
				</tr>
				
				<tr class="TR_STYLE1">
					<td class="TD_STYLE1" width="20%">
						请输入建档时间
					</td>
					<td width="84%" class="TD_STYLE2">
						<input type="text" name="item.str_startTime" value="" style="width:14% " class="INPUT_STYLE2" id="date_start">至<input type="text" name="item.str_endTime" value="" style="width:14% " class="INPUT_STYLE2" id="date_end">
						（YYYY-MM-DD）
					</td>
				</tr>
			</table>
		</form>
	</body>
<script type="text/javascript">
Calendar.setup ({inputField : "date_start", ifFormat : "%Y-%m-%d", showsTime : false, button : "date_start", singleClick : true, step : 1});
Calendar.setup ({inputField : "date_end", ifFormat : "%Y-%m-%d", showsTime : false, button : "date_end", singleClick : true, step : 1});
</script>
</html>
