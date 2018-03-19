package com.metacube;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TempratureConverter {
	@WebMethod
	public double fahrenheitToCelsiusConverter(double temprature){	
			return ((temprature-32)*5)/9;
	}
}
