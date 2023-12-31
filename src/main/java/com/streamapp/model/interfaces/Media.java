package com.streamapp.model.interfaces;
import com.streamapp.model.enums.TypeOfMediaEnum;

import java.time.LocalDate;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public abstract class Media extends MediaIFile {

	protected String title;
	protected LocalDate release_date;
	protected String overview;
	protected String country;
	private TypeOfMediaEnum types;

	public Media(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param file
	 */
	public abstract void addMediaFile(MediaIFile file);

	/**
	 * 
	 * @param id
	 */
	public abstract void deleteFile(int id);

	/**
	 * 
	 * @param file
	 */
	public abstract void updateFile(MediaIFile file);

}