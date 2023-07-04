<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="Navbar.css" rel="stylesheet" type="text/css" />
<link href="announcements.css" rel="stylesheet" type="text/css" />
<title>Staff Form-add validation</title>
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
    WELCOME TO REGISTRATION FORM
    <br>
    <br>
  <form method="POST" >
  
  <div>
  <label for="id" style="margin-left:105px">Staff ID:</label>
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
  <label for="re-password">Re-enter Password:</label>
  <input type="password" id="re-password" name="re-password"><br><br>
  <div>${errors.cpassword}</div>
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
 
 <div>
  <label for="designation" style="margin-left:60px">Designation:</label>
  <input type="text" id="designation" name="designation"><br><br>
  <div>${errors.designation }</div>
 </div>
 
  <input type="submit" style="margin-left:150px" value="Submit">
</form>
  </div>

  </div>
   
  
  
</body>
</html>
