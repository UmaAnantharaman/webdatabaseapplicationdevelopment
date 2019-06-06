package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DisplayItem implements FrontControllerInterface{
	Art aArt=null;
	String name = "";
	String address = "";
	String dateofbirth = "";
	DBOperations dbo;
	
	public DisplayItem() {
		   aArt=new Art();
	       dbo=new DBOperations();
	}
	public String execute(HttpServletRequest request,
         HttpServletResponse response) throws Exception {
	   if((name=dbo.display())!= null & (address=dbo.display())!= null & (dateofbirth=dbo.display())!= null) { // returns true or false as a result
		 HttpSession session = request.getSession();
            session.setAttribute("operation", "display");
            session.setAttribute("name",name);
		 return "displayoperation.jsp";
	    }else
		 return "error2.jsp";
   }
    public void dispatch(HttpServletRequest request,
        HttpServletResponse response, String page) 
           throws  Exception {
	  response.sendRedirect(page);
	           
   }
}
