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
<script type="text/javascript" src="javascript/comm/comm.js"></script>
</head>
<body>
<form method="post" action="humanfile.do" enctype="multipart/form-data">
<table width="100%" >
  <tr>
    <td colspan="2"> 
    <font color="#0000CC">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记</font></td>
  </tr>
  <tr>
    <td width="59%">提交成功，如有照片，请选择上传照片(.jpg、.gif文件)
	<input type="file" class="FILE_STYLE1" name="thePhoto" width="100%"></td>
    <td width="41%" align="right">
    <input type="button" value="上传照片" class="BUTTON_STYLE1" onclick="window.location.href='register_choose_picture.jsp';">
	<input type="button" value="上传附件" class="BUTTON_STYLE1" onclick="window.location.href='register_choose_attachment.jsp';">
      <input type="button" value="完成" class="BUTTON_STYLE1" onclick="javascript:finish();"></td>
  </tr>
  </table>

</form>
</body>
</html>