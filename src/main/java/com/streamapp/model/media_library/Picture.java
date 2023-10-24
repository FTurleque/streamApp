package com.streamapp.model.media_info;
import com.streamapp.model.interfaces.MediaFile;
import com.streamapp.model.interfaces.Person;
import com.streamapp.model.media_library.Season;
import com.streamapp.model.media_library.Serie;
import com.streamapp.model.media_library.Movie;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public class Picture extends MediaFile {

	public Person m_Person;
	private Season m_Season;
	private Serie m_Serie;
	private Movie m_Movie;
	private Collection m_Collection;
	private ProductionCompagny m_ProductionCompagny;

	public Picture(){

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