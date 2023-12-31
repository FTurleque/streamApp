package com.streamapp.model.media_info;
import com.streamapp.model.enums.WorkEnum;
import com.streamapp.model.interfaces.Media;
import com.streamapp.model.interfaces.Person;

import java.util.Dictionary;
import java.util.List;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public class Staff extends Person {

	private Dictionary<Media, List<WorkEnum>> workList;

	public Staff(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param lastName
	 * @param firstName
	 */
	public Staff Staff(String lastName, String firstName){
		return null;
	}

}