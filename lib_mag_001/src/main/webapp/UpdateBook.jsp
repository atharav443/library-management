<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
      <form  method="post" >
        <label for="bookId">Book ID:</label>
        <input type="number" id="bookId" name="bookId"><br><br>
        <label for="bookname">Book Name:</label>
        <input type="text" id="bookname" name="bookname"><br><br>
        <label for="authorname">Author Name:</label>
        <input type="text" id="authorname" name="authorname"><br><br>
        <input type="submit" value="Submit">
        <input type="reset" value="Clear">
        </form>
        
         

  </div>

  </div>
</body>
</html>