package com.streamapp.model;
import com.streamapp.model.interfaces.MediaFile;
import com.streamapp.model.enums.MediaTypeEnum;

import java.util.List;

/**
 * @author Turleque Fabrice
 * @version 1.0
 * @created 20-oct.-2023 00:01:21
 */
public class Source {

	private int id;
	private String sourcePath;
	private List<MediaFile> mediaList;
	private MediaTypeEnum type;
	private List<Source> sourceList;

	public Source(String sourcePath){
		this.sourcePath = sourcePath;
	}

	/**
	 * 
	 * @param source
	 */
	public void addSourceToList(Source source){

	}

	/**
	 * 
	 * @param id
	 */
	public void deleteSourceInList(int id){

	}

}