<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page isELIgnored="false"%> <!-- 开启el表达式 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!-- 开启C标签，需要引入jstl包 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello world</h1>
	<table>
		<tr>
			<th>userName</th>
			<th>userNumber</th>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.userName}</td>
				<td>${user.userNumber}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>