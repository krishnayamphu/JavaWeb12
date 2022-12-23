<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>

<c:out value="Hello World"/>
<c:set var="phone" value="1234567" scope="request"/>
<p>Contact No.: ${phone}</p>

<c:set var="temp" value="50"/>
<c:if test="${temp>=40}">
    <p>Weather is too Hot</p>
</c:if>
<hr>
<c:set var="marks" value="30" scope="session"/>
<c:choose>
    <c:when test="${marks>=35}">
        <p>Result: Pass</p>
    </c:when>
    <c:otherwise>
        <p>Result: Fail</p>
    </c:otherwise>
</c:choose>

<hr>

<c:forEach var="i" begin="1" end="5">
    <p>Hello World ${i}</p>
</c:forEach>
<hr>

<c:forEach var="car" items="${cars}">
    <p>Car: ${car}</p>
</c:forEach>



</body>
</html>
