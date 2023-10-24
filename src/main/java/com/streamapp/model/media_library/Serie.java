package com.streamapp.model.media_library;
import com.streamapp.model.interfaces.MediaFile;
import com.streamapp.model.interfaces.Media;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public class Serie extends Media {

	private String title;
	private LocalDate release_date;
	private List<Season> seasonList;
	private int seasonNumder;
	private String url_Trailer;
	private Season seasons;

	public Serie(){

	}

	/**
	 * 
	 * @param title
	 */
	public Serie Serie(String title){
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