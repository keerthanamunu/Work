package org.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductCatalog {
	
	/*@WebMethod
	public List<String> getProducts()
	{
		List<String> l = new ArrayList<String>();
		l.add("Books");
		l.add("Music");
		l.add("Movies");
		return l;
		
	}*/
	
	@WebMethod
	public String getProducts()
	{
		
		return "Movies";
		
	}
}
