/**
 * AdditionServiceService.java
 *
 * This file was auto-generated from WSDL
 * 
 */

package com.mkrupa.webservices.call;

public interface AdditionServiceService extends javax.xml.rpc.Service {
    public java.lang.String getAdditionServiceAddress();

    public com.mkrupa.webservices.call.AdditionService_PortType getAdditionService() throws javax.xml.rpc.ServiceException;

    public com.mkrupa.webservices.call.AdditionService_PortType getAdditionService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
