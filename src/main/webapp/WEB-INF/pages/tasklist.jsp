<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="base.jsp"%>
<link href="${base}/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<table>
	<tr>
	<td>活动名称</td>
	<td>活动图片</td>
	<td>报名费用</td>
	<td>操作</td>
	</tr>
<c:forEach var="bean" items="${list }" varStatus="s">
	<tr>
		<td>${bean.name}</td>
		<td>${bean.image}</td>
		<td>${bean.registFee }</td>
		<td><a href="${base}/getTaskDetail.html?id=${bean.id}" target="_blank">查看</a></td>
	</tr>
</c:forEach>  
</table>

</body>
</html>