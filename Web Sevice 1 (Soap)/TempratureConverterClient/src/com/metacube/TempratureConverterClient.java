package com.metacube;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class TempratureConverterClient {

	public static void main(String[] args) throws RemoteException, ServiceException {
		TempratureConverterServiceLocator obj = new TempratureConverterServiceLocator();
		System.out.println(obj.getTempratureConverter().fahrenheitToCelsiusConverter(-12));

	}

}
