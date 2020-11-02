package com.spring;

public class DatabaseDataDAO extends DataDAO{

	@Override
	public String save(String data) {

		
		return data+"Saved in Database";
	}

}
