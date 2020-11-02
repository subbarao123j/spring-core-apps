package com.spring;

public class FileSystemDataDAO extends DataDAO{

	@Override
	public String save(String data) {
		return data+" saved in File system";
	}


}
 