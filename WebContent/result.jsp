<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>${userWaterResult.getCoffee()} grams of coffee requires <br />
${userWaterResult.getWater()} grams of Water <br />
</p>
<a href="index.jsp">Select another amount of Coffee</a>
</body>
</html>