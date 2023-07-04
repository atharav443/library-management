<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="Navbar.css" rel="stylesheet" type="text/css" />
<link href="announcements.css" rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>

 <%@ include file="navbar.html" %>

  <div class="cards">

    <%@ include file="announcements.html" %>



    <div class="card-1">
          <b>Welcome Admin</b>
  <br/>
  <br/>
  <a href="./staff-form">Create a new Staff</a>
  <br/>
  <br/>
  <a href="./view-all-staff">Show staff Details</a>
  <br/>
  <br/>
  <a href="./book-details">Show Book Details</a>
  </div>

  </div>
   
  
  
</body>
</html>