package com.streamapp.model.interfaces;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public abstract class MediaFile implements FileManager {

	protected int id;
	protected String filePath;
	protected String fileName;
	protected String fileExtension;
	protected String resolution;

	public MediaFile(){

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