package com.mkrupa.webservices.call;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class CallWS {

	public static void main(String... pArgs) {

		try {
			//initiate the locator
		    final AdditionServiceServiceLocator vWebService = new AdditionServiceServiceLocator();
		    //retrieve a port to call a method on
		    final AdditionService_PortType vPort = vWebService.getAdditionService();
		    		    
		    System.out.println("Result of 10 + 2 = " + vPort.addition(10, 2));
		    
		} catch (RemoteException vRe) {
			System.out.println("RemoteException : " + vRe.getMessage());
		} catch (ServiceException vSe) {
			System.out.println("ServiceException : " + vSe.getMessage());
		}
	}
}
