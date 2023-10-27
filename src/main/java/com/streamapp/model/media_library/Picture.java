package com.streamapp.model.media_library;
import com.streamapp.model.interfaces.MediaIFile;
import com.streamapp.model.interfaces.Person;
import com.streamapp.model.media_info.Collection;
import com.streamapp.model.media_info.ProductionCompagny;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public class Picture extends MediaIFile {

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
	public void addMediaFile(MediaIFile file){

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
	public void updateFile(MediaIFile file){

	}

}