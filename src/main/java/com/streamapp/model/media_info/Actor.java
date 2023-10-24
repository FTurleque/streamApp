package com.streamapp.model.media_info;
import com.streamapp.model.interfaces.Media;
import com.streamapp.model.interfaces.Person;

import java.util.Dictionary;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public class Actor extends Person {

	/**
	 * Film ou série avec le rôle
	 */
	private Dictionary<Media, String> filmography;
	private String pseudo;
	private String biography;
	private String placeOfBirth;



	public void finalize() throws Throwable {
		super.finalize();
	}

	public Actor(){

	}

}