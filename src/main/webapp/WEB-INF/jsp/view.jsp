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
 
<tr><th>Source</th><th>Stock</th><th>HighPrice</th><th>LowPrice</th><th>
NoOfShare</th><th>CurrentPrice</th><th>CostOfPurchase</th><ThcurrentPortfolio</th><th>PercentageGain</th></tr>

<c:forEach items="${ExchangeData}" var="notices">
    <tr>
        <td>${notices.source}</td>
        <td>${notices.stock}</td>
        <td>${notices.highPrice}</td>
        <td>${notices.lowPrice}</td>
        <td>${notices.noOfShare}</td>
        <td>${notices.currentPrice}</td>
        <td>${notices.currentPortfolio}</td>
        <td>${notices.percentageGain}</td>
    </tr>
</c:forEach>





</body>
</html>
