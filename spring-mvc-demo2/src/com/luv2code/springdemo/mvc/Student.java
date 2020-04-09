package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import com.luv2code.springdemo.mvc.validation.CourseCode;


public class Student {
	
	private String firstName;
	private String lastName;
	private String country; 
	private LinkedHashMap <String,String> countryOptions;
	private String favoriteLanguage;
	private LinkedHashMap <String,String> favoriteLanguages;
	private String[] operatingSystems; 
	
	@CourseCode(value ="LUV", message ="must start with LUV" )
	private String courseCode; 


	public Student() {
		countryOptions =new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil"); 
		countryOptions.put("FR", "France"); 
		countryOptions.put("DE", "Germany"); 
		countryOptions.put("IN", "India"); 
		countryOptions.put("US", "United States of America"); 
		
		favoriteLanguages =new LinkedHashMap<>();
		favoriteLanguages.put("Java", "Java"); 
		favoriteLanguages.put("C#", "C#"); 
		favoriteLanguages.put("Python", "Python"); 
		favoriteLanguages.put("Ruby", "Ruby"); 
		

	}
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public LinkedHashMap<String, String> getFavoriteLanguages() {
		return favoriteLanguages;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
}
