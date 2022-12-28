<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<a href="user-create">Create User</a>
<table>
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Password</th>
        <th>Action</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>
                <a href="user-edit?id=${user.id}">Edit</a>
                <form action="users" method="post">
                    <input type="hidden" name="id" value="${user.id}">
                    <button>Delete</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
