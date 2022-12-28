<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
<a href="users">Users</a>
<form action="user-edit" method="post">
    <input type="hidden" name="id" value="${user.id}">
    <label>Username</label>
    <input type="text" name="username" value="${user.username}" required>
    <label>Password</label>
    <input type="password" name="password" value="${user.password}" required>
    <button>Update</button>
</form>

</body>
</html>
