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
<form action="user-create" method="post">
    <label>Username</label>
    <input type="text" name="username" required>
    <label>Password</label>
    <input type="password" name="password" required>
    <button>Create</button>
</form>

</body>
</html>
