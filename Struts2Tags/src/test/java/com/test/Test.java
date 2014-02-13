package com.test;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		
		Random random=new Random();
		System.out.println(random.nextInt(10));
		
		
		
		/*Parent parent=new Child();
		
		
		System.out.println(parent.var);*/
		
		 
	}

}

class Parent {
	String var = "parent var";
	String pvar;

	public Parent() {
		System.out.println("parent obj");
		// TODO Auto-generated constructor stub
	}

	public void callParent() {
		System.out.println("this is parent callParent method ");
	}
}

class Child extends Parent {
	String var="child var";
	String cvar;
	public Child() {
		super();
		System.out.println("child obj");
		// TODO Auto-generated constructor stub
	}
	public void callChild(){
		
		System.out.println("this is child callChild Method" + super.var);
	}
	/*@Override
	public void callParent() {
		System.out.println("this is parent callParent method overridden ");
	}*/
}


