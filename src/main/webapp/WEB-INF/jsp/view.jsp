<%--Iterator.jsp --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Table</title>
</head>
<body>
<%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
   
<%@page import="java.util.Iterator"%> 
 
<% ArrayList<ExchangeData> Exchange_Data  = (ArrayList) request.getAttribute("ExchangeData"); %> <%--Assigning ArrayList object containing Employee data to the local object --%>
 
<strong><a href="<%=request.getContextPath()%>/IteratorExample?type=getDetails">Show Exchange_Data Details</a></strong>
<br></br>
 
<table cellspacing="2" cellpadding="2">
 
<tr><th>source</th><th>stock</th><th>highPrice</th><th>lowPrice</th><th>
noOfShare</th><th>currentPrice</th><th>costOfPurchase</th><thcurrentPortfolio</th><th>percentageGain</th></tr>
<%
// Iterating through subjectList
 
if(request.getAttribute("ExchangeData") != null)  // Null check for the object
{
 Iterator<ExchangeData> iterator = Exchange_Data.iterator();  // Iterator interface
 
 while(iterator.hasNext())  // iterate through all the data until the last record
 {
 ExchangeData Exchange_Data = iterator.next(); //assign individual employee record to the employee class object
 %>
 <tr><td><%=Exchange_Data.getSource()%></td>
 <tr><td><%=Exchange_Data.getStock()%></td>
 <tr><td><%=Exchange_Data.getHighPrice()%></td>
 <tr><td><%=Exchange_Data.getLowPrice()%></td>
 <tr><td><%=Exchange_Data.getNoOfShare()%></td>
 <tr><td><%=Exchange_Data.getCurrentPrice()%></td>
 <tr><td><%=Exchange_Data.getCostOfPurchase()%></td>
 <tr><td><%=Exchange_Data.getCurrentPortfolio()%></td>
 <tr><td><%=Exchange_Data.getPercentageGain()%></td>
 </tr>
 <%
 }
}
%>
</table>
 
</body>
</html>
