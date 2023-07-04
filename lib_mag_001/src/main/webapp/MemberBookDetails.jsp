<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>
     <%@ include file="navbar.html" %>

  <div class="cards">

    <%@ include file="announcements.html" %>
     

    <div class="card-1">
       Book Details are below
       <br>
       <br>
       
        <table>
        <tr>
            
            
            <th>Book Name</th>
            <th>Author Name</th> 
            <th>Status</th>
            
        </tr>
        <c:forEach var="s" items="${requestScope.books}">
            <tr>
            
                
                
                <td>${s.book_name}</td>
                <td>${s.author_name}</td>
                <td>${s.status }</td>
               
            </tr>
        </c:forEach>
    </table>
     </div>

  </div>
</body>
</html>