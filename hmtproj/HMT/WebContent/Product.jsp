<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- for dropdown -->
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- for dropdown end -->

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

body {
    font-family: Arial, Helvetica, sans-serif;
    background-color: black;
}

* {
    box-sizing: border-box;
}

/* Add padding to containers */
.container {
    padding: 16px;
    background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=number] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

/* Overwrite default styles of hr */
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

.registerbtn:hover {
    opacity: 1;
}

/* Add a blue text color to links */
a {
    color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
    background-color: #f1f1f1;
    text-align: center;
}
</style>
</head>
<body>
<form action="ProductServlet" method="post">
  <div class="container">
    <h1>Add Product</h1>
    <p>Please fill in this form to add new product.</p>
    <hr>
    <label for="itemId"><b>itemId</b></label>
    <input type="text" placeholder="Enter ItemId" name="itemId" required>
    
    <label for="itemName"><b>itemName</b></label>
    <input type="text" placeholder="Enter Item Name" name="itemName" required>
    
    
                               
 <!-- -- <div class="dropdown">
   <!--  <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">ROLE
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li ><a href="#">Employee</a></li>
      <li><a href="#">manager</a></li>
      <li><a href="#">Managing Director</a></li>
    </ul> 
 <strong> Role</strong>&nbsp;&nbsp;
 <select name="role" class="btn btn-primary dropdown-toggle">
  
  <option value="Employee">Employee</option>
  <option value="Manager">Manager</option>
  <option value="ManagingDirector">ManagingDirector</option>
  <option value="BusinessManager">BusinessManager</option>
</select>
  </div>-->
   
	<br>


    <label for="price"><b>price</b></label>
    <input type="number" placeholder="Enter Price" name="price" required>
    
     <label for="quantity"><b>quantity</b></label>
    <input type="number" placeholder="Enter quantity" name="quantity" required>

    <label for="link"><b>link</b></label>
    <input type="text" placeholder="Enter link" name="link" required>
<!--     <hr>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

  
  </div>
  
  <div class="container signin">
    <p>Already have an account? <a href="Login.jsp">Sign in</a>.</p>
  </div>-->
    <button type="submit" class="registerbtn">Add Product</button>
</form>

</body>
</html>