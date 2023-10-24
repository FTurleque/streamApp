package com.streamapp.model.media_library;
import com.streamapp.model.media_info.StudioProduction;
import com.streamapp.model.interfaces.MediaFile;
import com.streamapp.model.interfaces.Media;
import com.streamapp.model.media_info.TypeOfMedia;

import java.util.List;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public class Movie extends Media {

	private int duration;
	private String url_Trailer;
	private List<TypeOfMedia> types;
	private StudioProduction studio;

	public Movie(){

	}

	public void finalize() throws Throwable {
		super.finalize();
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