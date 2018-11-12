<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show Emp</title>
</head>
<body>
<h1>${res.code}</h1>
<h1>${res.msg}</h1>
<c:forEach items="${res.data}" var="emp">
    <td>${emp.empno}</td>
    <td>${emp.ename}</td>
    <td>${emp.job}</td>
    <td>${emp.mgr}</td>
    <td>${emp.sal}</td>
    <td>${emp.comm}</td>
    <td>${emp.deptno}</td>
    <td>${emp.hiredate}</td>
</c:forEach>
    </body>
</html>
