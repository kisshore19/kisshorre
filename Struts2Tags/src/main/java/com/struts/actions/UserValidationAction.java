package com.struts.actions;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserValidationAction{// extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String address;
	private String sex;
	private List<String>  profession ;
	private List<String> languagesKnown;
	private Map<Object, Object> map=new HashMap<Object, Object>();  
	
	
	public Map<Object, Object> getMap() {
		return map;
	}



	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}



	public UserValidationAction() {
		// TODO Auto-generated constructor stub
	}

	
	
	public UserValidationAction(String userName, String password,
			String address, String sex, List<String> profession,
			List<String> languagesKnown) {
		super();
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.sex = sex;
		this.profession = profession;
		this.languagesKnown = languagesKnown;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public List<String> getProfession() {
		return profession;
	}



	public void setProfession(List<String> profession) {
		this.profession = profession;
	}



	public List<String> getLanguagesKnown() {
		return languagesKnown;
	}



	public void setLanguagesKnown(List<String> languagesKnown) {
		this.languagesKnown = languagesKnown;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String execute(){
		
		
		map.put("one", "okati");
		map.put("two", "rendu");
		map.put("three", "moodu");
		map.put("four", "naalugu");
		map.put("five", "idu");
		map.put("six", "aaru");
		map.put("seven", "edu");
		map.put("eight", "enimidi");
		System.out.println("USER NAME : "+ userName +"  PASSWORD : " + password);
		System.out.println("ADDRESS : " + address +"  SEX : " + sex);
		
		for (String languages : languagesKnown) {
			System.out.println("LANGUAGES KNOWN : " +languages);
		}
		
		for (String prof : profession){
			System.out.println("PROFESSION : " + prof);
		}
		return "success";
	}
	

}
