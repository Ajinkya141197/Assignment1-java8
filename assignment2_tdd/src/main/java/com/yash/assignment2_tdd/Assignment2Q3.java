package com.yash.assignment2_tdd;

import java.util.ArrayList;
import java.util.List;

class user{
    String email;
    String password;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public user() {
        super();
        // TODO Auto-generated constructor stub
    }
    public user(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}


public class Assignment2Q3 {
	
	List<user> a=new ArrayList<>();
	public boolean checkEmailAndPass(String string, String string2) {
		
		 a.add(new user("ajinkya.shitole@yash.com","qwer"));
	        a.add(new user("ajinkya@gmail.com","1234"));
	        a.add(new user("prakash@gmail.com","1444"));
	        a.add(new user("namdev@gmail.com","1234"));

	        for(int i=0;i<=a.size()-1;i++) {
	            if(a.get(i).email.equals(string)&&a.get(i).password.equals(string2)) {
	                return true;
	            }
	        }
	        return false;
	}
	
}
