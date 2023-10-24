package com.streamapp.model.interfaces;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public abstract class Person {

	protected String firstName;
	protected String lastName;
	protected LocalDate birthDay;
	private char gender;

	public Person(){

	}

	public void finalize() throws Throwable {

	}

	public String getFirstName(){
		return "";
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName){

	}

	public String getLastName(){
		return "";
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName){

	}

	public LocalDate getBirthDay(){
		return null;
	}

	/**
	 * 
	 * @param birthDay
	 */
	public void setBirthDay(LocalDate birthDay){

	}

}