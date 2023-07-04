<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<style>
  input[type="text"],
  input[type="password"],
  textarea {
    width: 30%;
    box-sizing: border-box;
    padding: 5px;
    border-radius: 5px;
    border: 1px solid #ccc;
    font-size: 16px;
    
  }

  input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
  }

  input[type="submit"]:hover {
    background-color: #3e8e41;
  }
</style>
</head>
<body>

 <%@ include file="navbar.html" %>

  <div class="cards">

    <%@ include file="announcements.html" %>



    <div class="card-1">
    Add New member
    <br>
    <br>
    <br>
  <form method="POST" >
  
  <div>
  <label for="id" style="margin-left:73px">Member ID:</label>
  <input type="number" id="id" name="id"><br><br>
  <div>${errors.id}</div>
   </div>
  
  
  
  
  <div>
  <label for="username" style="margin-left:73px">User name:</label>
  <input type="text" id="username" name="username"><br><br>
  <div>${errors.username}</div>
   </div>
   
   <div>
  <label for="password" style="margin-left:78px">Password:</label>
  <input type="password" id="password" name="password"><br><br>
  <div>${errors.password}</div>
  </div>
  
  
  
  <div>
  <label for="phone" style="margin-left:100px">Phone:</label>
  <input type="text" id="phone" name="phone"><br><br>
   <div>${errors.phone }</div>
   </div>
   
   <div>
  <label for="address" style="margin-left:80px">Address:</label>
 <textarea id="address" name="address"></textarea><br>
 <br>
 <div>${errors.address }</div>
 </div>
 
 
 
  <input type="submit" style="margin-left:150px" value="Submit">
</form>
  </div>

  </div>
   
  
  
</body>
</html>