<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="co.library.servlet.LoginMember" %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <%@ include file="navbar.html" %>

  <div class="cards">

    <%@ include file="announcements.html" %>
     

    <div class="card-1">
       Welcome ,${username}
      <br/>
       <br/>
      <a href="./book-details-member">Click to see book details</a>
      <br/>
      <br/>
      <a href="./issue-book">Click to issue new book</a>
     </div>

  </div>
</body>
</html>