<%--
  Created by IntelliJ IDEA.
  User: phamthanh
  Date: 09/12/2022
  Time: 09:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/HomeController/validate" method="post">
    <input type="email" placeholder="Enter your email" name="email">
    <input type="submit">
</form>
<p>Result:${result}</p>
</body>
</html>
