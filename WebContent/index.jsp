<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to the Golden Ratio of COffee Program</title>
</head>
<body>
<h1>This program helps you make a great cup of coffee.</h1>
<form action="getWaterServlet" method="post">
Enter the weight of coffee you are going to use in a whole number:
<input type="text" name="userCoffee" size="10">
<input type="submit" value="Calculate Coffee Ratio" />
</form>
</body>
</html>