<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String base = request.getContextPath();
	request.setAttribute("base", base+"/task");
	System.out.println("[basePath="+base+"]");
%>