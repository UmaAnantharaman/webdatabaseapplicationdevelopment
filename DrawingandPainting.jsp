<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<BODY>
<TR><TH CLASS="TITLE">
      Maccalades Art and drawing class Registration</TABLE>
<OL>
   
    the student with the following data is <%=(String)session.getAttribute("operation")%>: 
    <I><%= (String)session.getAttribute("idNo") %></I>
    <I><%= (String)session.getAttribute("name") %></I><br>
    <I><%= (String)session.getAttribute("age") %></I>
    <I><%= (String)session.getAttribute("address") %></I><br>
    <I><%= (String)session.getAttribute("dateofbirth") %></I><br>
     
    <A HREF="mvcjsp2.jsp " >Go Back</a> 
</OL>         
</BODY>
</html>
