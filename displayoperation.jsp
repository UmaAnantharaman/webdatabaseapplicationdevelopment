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
   
      Display Operation :
     <I><%= session.getAttribute("idNo") %><br></I>
     <I><%= (String)session.getAttribute("name") %></I><br>     
    <A HREF="mvcjsp2.jsp " >Go Back</a> 
</OL>         
</BODY>
</html>