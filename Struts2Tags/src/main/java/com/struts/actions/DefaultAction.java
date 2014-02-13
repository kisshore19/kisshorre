package com.struts.actions;

public class DefaultAction{
	public String execute() throws Exception{
		System.out.println("action class called");
		return "success";
	}

}
