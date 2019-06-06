package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBOperations {
	Connection con=null;
	boolean test=false;
	Art s;
	public DBOperations() {
		test=connection();
	}
	
	public boolean connection() {
		try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection
               ("jdbc:mysql://localhost:3307/artanddrawinginfo?useSSL=false",
                        "root", "root");
 
        } catch (Exception e2) {
            System.out.println(e2);
            return false;
        }
		
		return true;
	}
	
	public boolean insertion(Art s) {
	   try {
	     if (test) {
            String exp="insert into artanddrawing (idstudent,studentname,dateofbirth,address,age) values(?,?,?,?,?)";

 	         PreparedStatement ps = con.prepareStatement(exp);
	         ps.setInt(1, s.getidNo());
	         ps.setString(2, s.getName());
	         ps.setString(3, s.getdateofbirth());
	         ps.setString(4, s.getAddress());
	         ps.setInt(5, s.getAge());
	 
	         int i = ps.executeUpdate();
	         if (i > 0)   
	               return true;
	         else   	return false;
            }
            return false;
         } catch (Exception e2) {
                return false;
        }
	}
	public boolean update(Art s) {
        try {
          if (test) {
            String exp=
             "UPDATE artanddrawing SET studentname = ? WHERE idstudent = ?";
              PreparedStatement ps = con.prepareStatement(exp);
              ps.setString(1, s.getName());
              ps.setInt(2, s.getidNo());
              int i = ps.executeUpdate();
	         if (i > 0)   
	           return true;
	         else
	          	return false;
            }
            return false;
         } catch (Exception e2) {
        	System.out.println(e2.getMessage());
                return false;
       }
	}
	public boolean delete(Art s) {
        try {
	     if (test) {
              String exp="DELETE FROM artanddrawing WHERE idstudent = ?";
              PreparedStatement ps = con.prepareStatement(exp);
              ps.setInt(1, s.getidNo());
              int i = ps.executeUpdate();
	         if (i > 0)   
	           return true;
	         else
	         	return false;
           }
              return false;
         } catch (Exception e2) {
        	System.out.println(e2.getMessage());
                return false;
       }
     }
	public Art find(int rollNo) {
		
        Statement stmt = null;
        String result="";
        try {
	     if (test) {
              s= new Art();
              stmt = (Statement) con.createStatement();
              String exp="select idstudent, studentname from artanddrawing WHERE idstudent ="+rollNo;
              ResultSet rs = stmt.executeQuery(exp);
              while (rs.next()) {
            	  s.setidNo(rs.getInt("idstudent"));
             	 s.setName(rs.getString("studentname"));

              }
              return s;
            }
            return null;
        } catch (Exception e2) {
        	System.out.println(e2.getMessage());
           return null;
       }
	}
	public String display() {
		Statement stmt = null;
        String result="";
        try {
	     if (test) {
              s= new Art();
              stmt = (Statement) con.createStatement();
              String exp="select idstudent, studentname,age,address,dateofbirth from artanddrawing";
              ResultSet rs = stmt.executeQuery(exp);

              while (rs.next()) {
            	 result+=rs.getInt("idstudent")+" ";
            	 result+=rs.getString("studentname")+" ";
            	 result+=rs.getString("age")+" ";
            	 result+=rs.getString("address")+" ";
            	 result+=rs.getString("dateofbirth")+
                            "<html><br></html>";
            	         
              }
              return result;
            }
            return null;
         } catch (Exception e2) {
        	System.out.println(e2.getMessage());
                return null;
      }
	}

}

