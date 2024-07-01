package com.helios.tempmgr_server.exceptions;

public class LocationNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6470334770661805286L;

	public LocationNotFoundException(Long id){
		super("Could not find Location "+id);
	}

}
