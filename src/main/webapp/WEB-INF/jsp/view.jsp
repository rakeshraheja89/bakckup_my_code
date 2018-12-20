<%--Iterator.jsp --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ninja Dashboard</title>
</head>
<body>


<table cellspacing="4" cellpadding="4" border="3">

<h3>       Data1
</h3>
 
<tr><th>Stock</th><th>NoOfShare</th><th>Bought</th><th>High</th><th>low</th><th>CurrentPrice</th><th>Gain</th></tr>

<c:forEach items="${ExchangeData1}" var="notices">
    <tr>
        <td>${notices.stock}</td>
        <td>${notices.noOfShare}</td>
        <td>${notices.bought}</td>
        <td>${notices.high}</td>
        <td>${notices.low}</td>
        <td>${notices.currentPrice}</td>
        <td>${notices.gain}</td>
    </tr>
</c:forEach>

/*
<table cellspacing="4" cellpadding="4" border="3">

<h3>       Data2
</h3>
 
<tr><th>Stock</th><th>NoOfShare</th><th>Bought</th><th>High</th><th>low</th><th>CurrentPrice</th><th>Gain</th></tr>

<c:forEach items="${ExchangeData2}" var="notices">
    <tr>
        <td>${notices.stock}</td>
        <td>${notices.noOfShare}</td>
        <td>${notices.bought}</td>
        <td>${notices.high}</td>
        <td>${notices.low}</td>
        <td>${notices.currentPrice}</td>
        <td>${notices.gain}</td>
    </tr>
</c:forEach>




<table cellspacing="4" cellpadding="4" border="3">

<h3>       Data3
</h3>
 
<tr><th>Stock</th><th>NoOfShare</th><th>Bought</th><th>High</th><th>low</th><th>CurrentPrice</th><th>Gain</th></tr>

<c:forEach items="${ExchangeData3}" var="notices">
    <tr>
        <td>${notices.stock}</td>
        <td>${notices.noOfShare}</td>
        <td>${notices.bought}</td>
        <td>${notices.high}</td>
        <td>${notices.low}</td>
        <td>${notices.currentPrice}</td>
        <td>${notices.gain}</td>
    </tr>
</c:forEach>

*/

</body>
</html>
