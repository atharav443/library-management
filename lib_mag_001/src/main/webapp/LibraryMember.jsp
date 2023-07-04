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
        <b> WELCOME TO MEMBER LOGIN </b>
         
         <br/>
        <br/>
            <form method="post">
        <label for="username">LOGIN NAME:</label>
        <input type="text" id="username" name="username"><br><br>
        <div>${errors.username }</div>
       
        <label for="password">PASSWORD:</label>
        <input type="password" id="password" name="password"><br><br>
        <div>${errors.password }</div>

        <input type="submit" value="Submit">
        <input type="reset" value="Clear">
      </form>
      <br/>
      <br/>
      <a href="./add-new-member">New User</a>
    </div>

  </div>
   
</body>
</html>