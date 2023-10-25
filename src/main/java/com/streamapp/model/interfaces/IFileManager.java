package com.streamapp.model.interfaces;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public interface IFileManager {

	/**
	 * 
	 * @param file
	 */
	public void addMediaFile(MediaIFile file);

	/**
	 * 
	 * @param id
	 */
	public void deleteFile(int id);

	/**
	 * 
	 * @param file
	 */
	public void updateFile(MediaIFile file);

}