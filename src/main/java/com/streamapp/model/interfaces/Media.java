package com.streamapp.model.interfaces;
import com.streamapp.model.enums.TypeOfMediaEnum;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public abstract class Media extends MediaFile {

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
	public abstract void addMediaFile(MediaFile file);

	/**
	 * 
	 * @param id
	 */
	public abstract void deleteFile(int id);

	/**
	 * 
	 * @param file
	 */
	public abstract void updateFile(MediaFile file);

}