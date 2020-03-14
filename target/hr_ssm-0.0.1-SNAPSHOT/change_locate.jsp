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
<link rel="stylesheet" type="text/css" media="all"
	href="javascript/calendar/calendar-win2k-cold-1.css">
<script type="text/javascript" src="javascript/calendar/cal.js"></script>
<script type="text/javascript" src="javascript/comm/comm.js"></script>
<script type="text/javascript" src="javascript/comm/list.js"></script>
<script type="text/javascript">
	var subcat = new Array(2);
	subcat[0] = [ "1", "集团/软件公司", "集团", "集团/软件公司" ];
	subcat[1] = [ "2", "集团/生物科技有限公司", "集团", "集团/生物科技有限公司" ];
	var subcat1 = new Array(2);
	subcat1[0] = [ "1", "外包组", "集团/软件公司/外包组", "集团/软件公司" ];
	subcat1[1] = [ "2", "药店", "集团/生物科技有限公司/药店", "集团/生物科技有限公司" ];
	var subcat2 = new Array(8);
	subcat2[0] = [ "1", "区域经理", "销售/区域经理", "销售" ];
	subcat2[1] = [ "2", "总经理", "销售/总经理", "销售" ];
	subcat2[2] = [ "3", "项目经理", "软件开发/项目经理", "软件开发" ];
	subcat2[3] = [ "4", "程序员", "软件开发/程序员", "软件开发" ];
	subcat2[4] = [ "5", "人事经理", "人力资源/人事经理", "人力资源" ];
	subcat2[5] = [ "6", "专员", "人力资源/专员", "人力资源" ];
	subcat2[6] = [ "7", "主任", "生产部/主任", "生产部" ];
	subcat2[7] = [ "8", "技术工人", "生产部/技术工人", "生产部" ];

	function list() {
		//document.forms[0].action = document.forms[0].action + "?operate=list&method=change&delete_status=1";
		document.forms[0].action = "query_list.jsp";
		document.forms[0].submit();
	}
	function search() {
		//document.forms[0].action = document.forms[0].action + "?operate=toSearch&method=change";
		document.forms[0].action = "query_keywords.jsp";
		document.forms[0].submit();
	}
</script>
</head>

<body>
	<form name="humanfileForm" method="post" action="/hr/humanfile.do">
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案变更</font>
				</td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="开始"
					class="BUTTON_STYLE1" onclick="javascript:list();"> <input
					type="button" value="搜索" class="BUTTON_STYLE1" onclick="search();">
				</td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td width="16%" class="TD_STYLE1">请选择员工所在I级机构</td>
				<td width="84%" class="TD_STYLE2"><select
					name="item.firstKindName" size="5"
					onchange="changelocation(document.forms[0].elements['item.secondKindName'],document.forms[0].elements['item.firstKindName'].options[document.forms[0].elements['item.firstKindName'].selectedIndex].value)"
					class="SELECT_STYLE2"><option value="">&nbsp;</option>

						<option value="集团">集团</option>

						<option value="02">02</option></select></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">请选择员工所在II级机构</td>
				<td width="84%" class="TD_STYLE2"><select
					name="item.secondKindName" size="5"
					onchange="changelocation1(document.forms[0].elements['item.thirdKindName'],document.forms[0].elements['item.secondKindName'].options[document.forms[0].elements['item.secondKindName'].selectedIndex].value)"
					class="SELECT_STYLE2"><script language="javascript">
						changelocation(document.forms[0].elements["item.secondKindName"], document.forms[0].elements["item.firstKindName"].value)
					</script></select></td>
			</tr>
			<tr class="TR_STYLE1">
				<td width="16%" class="TD_STYLE1">请选择员工所在III级机构</td>
				<td width="84%" class="TD_STYLE2"><select
					name="item.thirdKindName" size="5" class="SELECT_STYLE2"><script
							language="javascript">
						changelocation1(document.forms[0].elements["item.thirdKindName"], document.forms[0].elements["item.secondKindName"].value)
					</script></select></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">请选择职位分类</td>
				<td width="84%" class="TD_STYLE2"><select
					name="item.humanMajorKindName" size="5"
					onchange="changelocation2(document.forms[0].elements['item.hunmaMajorName'],document.forms[0].elements['item.humanMajorKindName'].options[document.forms[0].elements['item.humanMajorKindName'].selectedIndex].value)"
					class="SELECT_STYLE2"><option value="">&nbsp;</option>

						<option value="销售">销售</option>

						<option value="软件开发">软件开发</option>

						<option value="人力资源">人力资源</option>

						<option value="生产部">生产部</option></select></td>
			</tr>
			<tr class="TR_STYLE1">
				<td width="16%" class="TD_STYLE1">请选择职位名称</td>
				<td width="84%" class="TD_STYLE2"><select
					name="item.hunmaMajorName" size="5" class="SELECT_STYLE2"><script
							language="javascript">
						changelocation2(document.forms[0].elements["item.hunmaMajorName"], document.forms[0].elements["item.humanMajorKindName"].value)
					</script></select></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">请输入建档时间</td>
				<td width="84%" class="TD_STYLE2"><input type="text"
					name="item.str_startTime" value="" style="width:14% "
					class="INPUT_STYLE2" id="date_start">至<input type="text"
					name="item.str_endTime" value="" style="width:14% "
					class="INPUT_STYLE2" id="date_end"> （YYYY-MM-DD）</td>
			</tr>
		</table>
	</form>
</body>
<script type="text/javascript">
	Calendar.setup({
		inputField : "date_start",
		ifFormat : "%Y-%m-%d",
		showsTime : false,
		button : "date_start",
		singleClick : true,
		step : 1
	});
	Calendar.setup({
		inputField : "date_end",
		ifFormat : "%Y-%m-%d",
		showsTime : false,
		button : "date_end",
		singleClick : true,
		step : 1
	});
</script>
</html>