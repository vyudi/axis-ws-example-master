/**
 * AdditionServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * 
 */

package com.mkrupa.webservices.call;

public class AdditionServiceServiceLocator extends org.apache.axis.client.Service implements com.mkrupa.webservices.call.AdditionServiceService {

    public AdditionServiceServiceLocator() {
    }


    public AdditionServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdditionServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AdditionService
    private java.lang.String AdditionService_address = "http://localhost:9090/axiswstest/AdditionService";

    public java.lang.String getAdditionServiceAddress() {
        return AdditionService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AdditionServiceWSDDServiceName = "AdditionService";

    public java.lang.String getAdditionServiceWSDDServiceName() {
        return AdditionServiceWSDDServiceName;
    }

    public void setAdditionServiceWSDDServiceName(java.lang.String name) {
        AdditionServiceWSDDServiceName = name;
    }

    public com.mkrupa.webservices.call.AdditionService_PortType getAdditionService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AdditionService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdditionService(endpoint);
    }

    public com.mkrupa.webservices.call.AdditionService_PortType getAdditionService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.mkrupa.webservices.call.AdditionServiceSoapBindingStub _stub = new com.mkrupa.webservices.call.AdditionServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAdditionServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdditionServiceEndpointAddress(java.lang.String address) {
        AdditionService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.mkrupa.webservices.call.AdditionService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.mkrupa.webservices.call.AdditionServiceSoapBindingStub _stub = new com.mkrupa.webservices.call.AdditionServiceSoapBindingStub(new java.net.URL(AdditionService_address), this);
                _stub.setPortName(getAdditionServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AdditionService".equals(inputPortName)) {
            return getAdditionService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:9090/axiswstest/AdditionService", "AdditionServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:9090/axiswstest/AdditionService", "AdditionService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AdditionService".equals(portName)) {
            setAdditionServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
