package com.streamapp.model.media_info;
import com.streamapp.model.interfaces.Media;
import com.streamapp.model.interfaces.Person;
import com.streamapp.model.enums.WorkEnum;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public class Crew {

	private Dictionary<Person, List<WorkEnum>> workers;
	private Media project;
	private String roleName;
	private Person personList;
	private WorkEnum work;

	public Crew(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param project
	 */
	public Crew Crew(Media project){
		return null;
	}

	/**
	 * 
	 * @param person
	 */
	public void addColaborator(Person person){

	}

}