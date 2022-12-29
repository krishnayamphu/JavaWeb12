<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="users/style.css">
    <title>User Registration</title>
</head>
<body>
<nav>
    <a href="users">Users</a>
    <a href="user-create">New User</a>
</nav>
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
