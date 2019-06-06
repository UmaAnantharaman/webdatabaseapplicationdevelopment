package com.example;

public class Art {
	   private int idNo;
	   private int age;
	   private String name;
	   private String address;
	   private String dateofbirth;
	   
	   public int getidNo() {
	          return idNo;
	   }
	   
	   public int getAge() {
		      return age;
		   }
	   
	   public String getName() {
		      return name;
		   }
	   
	   public String getAddress() {
		      return address;
		   }
	   
	   public String getdateofbirth() {
		      return dateofbirth;
		   }
	   
	   public int setidNo(int idNo) {
	      return this.idNo = idNo;
	   }
	   
	   public int setAge(int age) {
		      return this.age =  age;
		   }
	  
	   
	   public void setName(String name) {
	      this.name = name;
	   }
	   
	   public void setAddress(String address) {
		      this.address = address;
		   }
	   
	   public void setdateofbirth(String dateofbirth) {
		      this.dateofbirth = dateofbirth;
		   }
	   
}
