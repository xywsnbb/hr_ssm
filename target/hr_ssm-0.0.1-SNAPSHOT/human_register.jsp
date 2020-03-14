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
		<script type="text/javascript" src="javascript/comm/comm.js"></script>
		<script type="text/javascript" src="javascript/comm/select.js"></script>
		<script type="text/javascript">
		var subcat = new Array(2);
subcat[0] = ["1", "01/软件公司","01/集团","01/集团/01/软件公司"];
subcat[1] = ["2", "02/生物科技有限公司","01/集团","01/集团/02/生物科技有限公司"];
var subcat1 = new Array(2);
subcat1[0] = ["1", "01/外包组","01/集团/01/软件公司"];
subcat1[1] = ["2", "01/药店","01/集团/02/生物科技有限公司"];
var subcat2 = new Array(8);
subcat2[0] = ["1", "01/区域经理", "01/销售"];
subcat2[1] = ["2", "02/总经理", "01/销售"];
subcat2[2] = ["3", "01/项目经理", "02/软件开发"];
subcat2[3] = ["4", "02/程序员", "02/软件开发"];
subcat2[4] = ["5", "01/人事经理", "03/人力资源"];
subcat2[5] = ["6", "02/专员", "03/人力资源"];
subcat2[6] = ["7", "01/主任", "04/生产部"];
subcat2[7] = ["8", "02/技术工人", "04/生产部"];

 		</script>
	</head>

	<body>
		<form name="humanfileForm" method="post" action="/hr/humanfile.do">
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="提交" class="BUTTON_STYLE1"
							onclick="window.location.href='register_choose_picture.jsp'">
						<input type="reset" value="清除" class="BUTTON_STYLE1">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="11%">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						<select name="item.firstKindName" onchange="changelocation(document.forms[0].elements['item.secondKindName'],document.forms[0].elements['item.firstKindName'].options[document.forms[0].elements['item.firstKindName'].selectedIndex].value)" class="SELECT_STYLE1"><option value="">&nbsp;</option>
							
								<option value="01/集团">01/集团</option>
							
								<option value="03/02">03/02</option></select>
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						<select name="item.secondKindName" onchange="changelocation1(document.forms[0].elements['item.thirdKindName'],document.forms[0].elements['item.secondKindName'].options[document.forms[0].elements['item.secondKindName'].selectedIndex].value)" class="SELECT_STYLE1"><script language="javascript">
								changelocation(document.forms[0].elements["item.secondKindName"],document.forms[0].elements["item.firstKindName"].value)
    						</script></select>
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2">
						<select name="item.thirdKindName" class="SELECT_STYLE1"><script language="javascript">
							changelocation1(document.forms[0].elements["item.thirdKindName"],document.forms[0].elements["item.secondKindName"].value)
							</script></select>
					</td>
					<td rowspan="5">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						<select name="item.humanMajorKindName" onchange="changelocation2(document.forms[0].elements['item.hunmaMajorName'],document.forms[0].elements['item.humanMajorKindName'].options[document.forms[0].elements['item.humanMajorKindName'].selectedIndex].value)" class="SELECT_STYLE1"><option value="">&nbsp;</option>
							
								<option value="01/销售">01/销售</option>
							
								<option value="02/软件开发">02/软件开发</option>
							
								<option value="03/人力资源">03/人力资源</option>
							
								<option value="04/生产部">04/生产部</option></select>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<select name="item.hunmaMajorName" class="SELECT_STYLE1"><script language="javascript">
							changelocation2(document.forms[0].elements["item.hunmaMajorName"],document.forms[0].elements["item.humanMajorKindName"].value)
							</script></select>
					</td>
					<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<select name="item.humanProDesignation" class="SELECT_STYLE1"><option value="工程师">工程师</option>
							
								<option value="经理">经理</option>
							
								<option value="助理">助理</option>
							
								<option value="教授">教授</option>
							
								<option value="讲师">讲师</option>
							
								<option value="技术支持">技术支持</option></select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="item.humanName" value="" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select name="item.humanSex" class="SELECT_STYLE1"><option value="男">男</option>
							<option value="女">女</option></select>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="item.humanEmail" value="" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="item.humanTelephone" value="" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="item.humanQq" value="" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="item.humanMobilephone" value="" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="item.humanAddress" value="" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="item.humanPostcode" value="" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<select name="item.humanNationality" class="SELECT_STYLE1"><option value="中国">中国</option>
							
								<option value="美国">美国</option></select>
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="item.humanBirthplace" value="" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<input type="text" name="item.str_humanBirthday" value="" class="INPUT_STYLE2" id="date_start">
					</td>
					<td width="11%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2" width="14%">
						<select name="item.humanRace" class="SELECT_STYLE1"><option value="汉族">汉族</option>
							
								<option value="回族">回族</option></select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<select name="item.humanReligion" class="SELECT_STYLE1"><option value="无">无</option>
							
								<option value="佛教">佛教</option></select>
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2">
						<select name="item.humanParty" class="SELECT_STYLE1"><option value="党员">党员</option>
							
								<option value="群众">群众</option></select>
					</td>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="item.humanIdCard" value="" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="item.humanSocietySecurityId" value="" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="item.humanAge" value="" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<select name="item.humanEducatedDegree" class="SELECT_STYLE1"><option value="本科">本科</option>
							
								<option value="大专">大专</option></select>
					</td>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<select name="item.humanEducatedYears" class="SELECT_STYLE1"><option value="12">12</option>
							
								<option value="16">16</option></select>
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<select name="item.humanEducatedMajor" class="SELECT_STYLE1"><option value="生物工程">生物工程</option>
							
								<option value="计算机">计算机</option></select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬标准
					</td>
					<td class="TD_STYLE2">
						<select name="item.salaryStandardName" class="SELECT_STYLE1"><option value="0/未定义">0/未定义</option></select>
					</td>
					<td class="TD_STYLE1">
						开户行
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="item.humanBank" value="" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="item.humanAccount" value="" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						登记人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="item.register" value="better_wanghao" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						建档时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="item.str_registTime" value="2010-05-29 01:51:55" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<select name="item.humanSpeciality" class="SELECT_STYLE1"><option value="数据库">数据库</option>
							
								<option value="java">java</option></select>
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<select name="item.humanHobby" class="SELECT_STYLE1"><option value="篮球">篮球</option>
							
								<option value="舞蹈">舞蹈</option></select>
					</td>
					<td class="TD_STYLE1">
						&nbsp;
					</td>
					<td class="TD_STYLE2">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="item.humanHistroyRecords" rows="4" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						家庭关系信息
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="item.humanFamilyMembership" rows="4" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="item.remark" rows="4" class="TEXTAREA_STYLE1"></textarea>
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
