<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<p><%--%>
<%--    String user= (String) request.getAttribute("user");--%>
<%--    out.print(user);--%>
<%--%></p>--%>

<p>${user}</p>

<hr>
<p>Name: ${person.name}</p>
<p>Age: ${person.age}</p>
<hr>
<p>Person name: ${person.getName()}</p>
<p>Person age: ${person.getAge()}</p>
</body>
</html>
