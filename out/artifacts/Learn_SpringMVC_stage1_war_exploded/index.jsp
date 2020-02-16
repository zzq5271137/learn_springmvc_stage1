<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/15
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Learn SpringMVC stage1</title>
</head>
<body>
<h1>Learn SpringMVC stage1</h1>

<a href="${pageContext.request.contextPath}/first.action">
    first request, 请求转发 -> results1.jsp
</a>

<br>

<a href="${pageContext.request.contextPath}/second.action">
    second request, 请求转发 -> results1.jsp
</a>

<br>

<a href="${pageContext.request.contextPath}/third.action">
    third request, 重定向 -> results1.jsp
</a>

</body>
</html>
