<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:useBean class="lee.CopyRight" id="copyRight"/>
<%@ page language="java" import="lee.Note" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>留言版-首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="styles.css">
  </head>
  
  <body>
        <div id="main">
        	<div id="top">
        		<%@include file="head.jsp"%>
        	</div>
        	<div id="content">
        		<font>最新留言</font>
        		<%
        			Note noteObj = new Note();
        			//List it = noteObj.fetchNoteList("select * from comments");
        			noteObj.test();
        		 %>
        		
        	</div>
        	<div id="bottom">
        			<%@include file="bottom.jsp"%> 
        			<br />
                 <%=copyRight.getInfo() %>
        	</div>
        </div>
  </body>
</html>
