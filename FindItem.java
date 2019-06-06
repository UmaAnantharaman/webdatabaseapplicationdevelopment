package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FindItem implements FrontControllerInterface{
	Art aArt=null;
	DBOperations dbo;
	
	public FindItem() {
		   aArt=new Art();
	       dbo=new DBOperations();
	       
	}
	public String execute(HttpServletRequest request,
         HttpServletResponse response) throws Exception {
		int idNo=0,age;
		idNo=Integer.parseInt(request.getParameter("idNo"));
		age=Integer.parseInt(request.getParameter("age"));
	   
	   if((aArt = dbo.find(idNo))!=null) { // returns true or false as a result
		 HttpSession session = request.getSession();
            session.setAttribute("operation", "find");
            session.setAttribute("idNo", (String)request.getParameter("idNo"));
            session.setAttribute("name", aArt.getName());
            session.setAttribute("age", (String)request.getParameter("age"));
            session.setAttribute("address", (String)request.getParameter("address"));
            session.setAttribute("dateofbirth", (String)request.getParameter("dateofbirth"));
     
		
		 return "DrawingandPainting.jsp";
	    }else
		 return "error2.jsp";
   }
    public void dispatch(HttpServletRequest request,
        HttpServletResponse response, String page) 
           throws  Exception {
	  response.sendRedirect(page);
	           
   }
}
