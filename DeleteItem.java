package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeleteItem implements FrontControllerInterface{
	Art aArt=null;
	DBOperations dbo;
	
	public DeleteItem() {
		   aArt=new Art();
	       dbo=new DBOperations();
	}
	public String execute(HttpServletRequest request,
         HttpServletResponse response) throws Exception {
		int idNo=0,age;
		   String name=null;
		   String address=null;
		   String dateofbirth = null;
		   
		   idNo=Integer.parseInt(request.getParameter("idNo"));
		   age=Integer.parseInt(request.getParameter("age"));
		   name=request.getParameter("name");
		   address=request.getParameter("address");
		   dateofbirth=request.getParameter("dateofbirth");
		   
		   aArt.setidNo(idNo);
		   aArt.setName(name);
		   aArt.setAge(age);
		   aArt.setAddress(address);
		   aArt.setdateofbirth(dateofbirth);
		
	   if(dbo.delete(aArt)) { // returns true or false as a result
		 HttpSession session = request.getSession();
            session.setAttribute("operation", "deleted");
            session.setAttribute
                 ("idNo", request.getParameter("idNo"));
            session.setAttribute
                 ("name", request.getParameter("name"));
            session.setAttribute
            	 ("age", request.getParameter("age"));
            session.setAttribute
       	 		 ("address", request.getParameter("address"));
            session.setAttribute
       	 		 ("dateofbirth", request.getParameter("dateofbirth"));
		
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
