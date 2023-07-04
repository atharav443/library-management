<%@page import="co.library.entity.Staff"%>
<%@page import="java.util.List"%>
<%@page import="co.library.servlet.DisplayStaffServelet"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<link href="Navbar.css" rel="stylesheet" type="text/css" />
<link href="announcements.css" rel="stylesheet" type="text/css" />
</head>
<body>
  
   <%@ include file="navbar.html" %>

  <div class="cards">

    <%@ include file="announcements.html" %>



    <div class="card-1">
        <h1>Staff List</h1>
        <a href="./delete-staff">Delete</a>
    
       <h3>List of all Staff</h3>
       
       
       
       
       
       <table>
        <tr>
            
            <th>UserName</th>
            <th>Password</th>
            <th>Phone</th>
            <th>Address</th>
            <th>Designation</th>
        </tr>
        <c:forEach var="s" items="${requestScope.staffs}">
            <tr>
            
               
                <td>${s.name}</td>
                <td>${s.password}</td>
                <td>${s.phone}</td>
                <td>${s.address }</td>
                <td>${s.designation}</td>
            </tr>
        </c:forEach>
    </table>

  </div>

  </div>
  
</body>
</html>


