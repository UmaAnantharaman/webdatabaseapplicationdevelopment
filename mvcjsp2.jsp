<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
  <body background="6.jpg"> 
<h2><b>MACCALADES DRAWING AND PAINTING CLASS REGISTRATION</b></h2>
<%String idNovalue="";
   String namevalue="";
   String agevalue="";
   String addressvalue="";
   String dateofbirthvalue="";
   String username="";
   String password="";
   
   if(request.getAttribute("idNo")!=null)
	   idNovalue=(String)request.getAttribute("idNo");
   if(request.getAttribute("name")!=null)
	   namevalue=(String)request.getAttribute("name");
   if(request.getAttribute("age")!=null)
	   agevalue=(String)request.getAttribute("age");
   if(request.getAttribute("address")!=null)
	   addressvalue=(String)request.getAttribute("address");
   if(request.getAttribute("dateofbirth")!=null)
	   dateofbirthvalue=(String)request.getAttribute("dateofbirth");
   if(request.getAttribute("username")!=null)
	   username=(String)request.getAttribute("username");
   if(request.getAttribute("password")!=null)
	   password=(String)request.getAttribute("password");
	  %>
	   
	   
	   
<form  method="Post" action="command"?name=action>
    ID number:<br>
     <input type="text" name="idNo" value=<%=idNovalue%>><br>
    Name:<br>
    <input type="text" name="name" value=<%=namevalue%>><br>
    Age:<br>
    <input type="text" name="age" value=<%=agevalue%>><br>
    Address:<br>
    <input type="text" name="address" value=<%=addressvalue%>><br>
    Date of Birth:<br>
    <input type="text" name="dateofbirth" value=<%=dateofbirthvalue%>><br>
    <br><br>
    <input type="submit" name="action" value="insert">
    <input type="submit" name="action" value="find">
    <input type="submit" name="action" value="update">
    <input type="submit" name="action" value="delete">
    <input type="submit" name="action" value="display">
</form>
</body>
</html>
