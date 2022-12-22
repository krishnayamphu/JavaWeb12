<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
<form method="POST" enctype="multipart/form-data" action="media">
    File to upload: <input type="file" name="upfile">
    <br>
    <br>
   <button>Upload</button>
</form>
<hr>
<h3>All Media Files</h3>
<%
    ArrayList<String> files= (ArrayList<String>) request.getAttribute("files");
    for(String item: files){
%>
<div class="media">
    <img src="uploads/<%= item %>" width="100px" alt="">
    <form action="media-del" method="post">
        <input type="hidden" value="<%= item %>" name="pic">
        <button>Remove</button>
    </form>
</div>


<%
    }
%>
</body>
</html>
