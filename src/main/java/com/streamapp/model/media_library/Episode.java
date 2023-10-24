package com.streamapp.model.media_library;
import com.streamapp.model.interfaces.MediaFile;
import com.streamapp.model.interfaces.Media;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public class Episode extends Media {

	private int episodeNumber;
	private String title;
	private int duration;

	public Episode(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param number
	 */
	public Episode Episode(int number){
		return null;
	}

	/**
	 * 
	 * @param file
	 */
	public void addMediaFile(MediaFile file){

	}

	/**
	 * 
	 * @param id
	 */
	public void deleteFile(int id){

	}

	/**
	 * 
	 * @param file
	 */
	public void updateFile(MediaFile file){

	}

}