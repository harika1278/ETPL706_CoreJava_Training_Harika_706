package com.evergent.Corejava.OOPS;

public class UserLogin {
	
	public void loginData() {
		System.out.println("Login Info");
	}
	public void loginData(String uname,String pass) {
		System.out.println("Uname : "+uname);
		System.out.println("Pass : "+pass);
	}
	public void loginData(String uname,String pass,String capcha) {
		System.out.println("Uname : "+uname);
		System.out.println("Pass : "+pass);
	}
	public void loginData(int mobile, String pass) {
		System.out.println("Mobile : "+mobile);
		System.out.println("Pass : "+pass);
	}
	public void show() {
		System.out.println("show Method");
	}
	public static void main(String[] args) {
		UserLogin login = new UserLogin();
		login.loginData();
		login.loginData("Raj","Raj123");
		login.loginData("Ravi","Ravi123","ABC");
		login.loginData(123456,"welcome");
	}

}
