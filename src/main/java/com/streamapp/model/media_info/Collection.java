package com.streamapp.model.media_info;
import com.streamapp.model.media_library.Movie;

import java.util.List;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public class Collection {

	private int id;
	private String title;
	private int moviesNumber;
	private List<Movie> movieList;

	public Collection(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param movie
	 */
	public void addMovie(Movie movie){

	}

	/**
	 * 
	 * @param movie
	 */
	public void deleteMovie(Movie movie){

	}

}