<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="login" method="post">
    <%
        String err= (String) request.getAttribute("err");
      if(err!=null){
          out.print("<p>"+err+"</p>");
      }
    %>
    <input type="text" name="username" placeholder="Username" required>
    <br><br>
    <input type="password" name="password" placeholder="Password" required>
    <br><br>
    <button>Login</button>
</form>
</body>
</html>
