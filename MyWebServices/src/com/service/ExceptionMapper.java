package com.service;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<Exception> {

	@Override
	public Response toResponse(Exception e) {
		// TODO Auto-generated method stub
		System.out.println(e.getMessage());
		return Response.status(500).entity(e.getMessage()).type("text/plain").build();
	}

}
