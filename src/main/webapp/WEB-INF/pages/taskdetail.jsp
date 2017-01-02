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
活动名称：${task.name }<br/>${task.id }
活动分类：${task.category }<br/>
活动海报：${task.image }<br/>
活动详情：${task.remark }<br/>
活动状态：${task.status }<br/>
报名费用：${task.registFee }<br/>
报名截止日期：${task.registEndTime }<br/>
<c:if test="${task.isLive==1 }">
	直播间地址：<a target="_blank" href="${task.liveUrl }">点击进入</a><br/>
</c:if>
活动发起日期：${task.createTime }<br/>
<form action="${base}/registration/register.html">
<input type="hidden" name="qqId" value="456456">
<input type="hidden" name="tId" value="${task.id }">
<input type="submit" value="报名">
</form>
</body>
</html>