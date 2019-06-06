package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface FrontControllerInterface {
	//display info about the operation we perform,string we return is the name of the jsp
   public String execute(
        HttpServletRequest request, HttpServletResponse response) 
            throws Exception;
   // page is the string that is returned from execute
   public void dispatch(HttpServletRequest request,
        HttpServletResponse response,String page) throws Exception;
}
