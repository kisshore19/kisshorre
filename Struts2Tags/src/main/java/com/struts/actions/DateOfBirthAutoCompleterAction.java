package com.struts.actions;

import java.util.ArrayList;
import java.util.List;

public class DateOfBirthAutoCompleterAction {
	private List<String> yearsList=new ArrayList<String>();
	private String yourDateOfYear;
	public List<String> getYearsList() {
		return yearsList;
	}
	public void setYearsList(List<String> yearsList) {
		this.yearsList = yearsList;
	}
	public String getYourDateOfYear() {
		return yourDateOfYear;
	}
	public void setYourDateOfYear(String yourDateOfYear) {
		this.yourDateOfYear = yourDateOfYear;
	}
	public DateOfBirthAutoCompleterAction(List<String> yearsList,
			String yourDateOfYear) {
		super();
		this.yearsList = yearsList;
		this.yourDateOfYear = yourDateOfYear;
	}
	
	public DateOfBirthAutoCompleterAction() {
		yearsList.add("1980");
		yearsList.add("2980");
		yearsList.add("3980");
		yearsList.add("4980");
		yearsList.add("1790");
		yearsList.add("970");
		yearsList.add("17910");
		yearsList.add("1752");
		yearsList.add("1771");
		yearsList.add("1674");
		yearsList.add("2345");
		yearsList.add("2200");
		yearsList.add("2000");
		yearsList.add("3000");
		yearsList.add("3500");
		
		
	
	}
	
	public String execute(){
		return "NONE";
	}

}
