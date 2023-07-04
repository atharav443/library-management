<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="Navbar.css" rel="stylesheet" type="text/css" />
<link href="announcements.css" rel="stylesheet" type="text/css" />
<title>Administrator page</title>
</head>
<body>
   <%@ include file="navbar.html" %>

  <div class="cards">

    <%@ include file="announcements.html" %>


    <div class="card-1">
        <b>Welcome to Administration Login</b>
        <br/>
        <br/>
            <form >
        <label for="username">Username:</label>
        <input type="text" id="username" name="username"><br><br>
       
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br><br>

        <button type="button" onclick="checkLogin()">Login</button>
      </form>
    </div>
  </div>
  </div>
  <script>
function checkLogin() {
  var username = document.getElementById("username").value;
  var password = document.getElementById("password").value;
  
  if (username === "admin" && password === "admin") {
    window.location.href = "Adminpage.jsp";
  } else {
    alert("Invalid username or password.");
  }
}
</script>
</body>
</html>