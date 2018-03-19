package com.metacube;

public class TempratureConverterProxy implements com.metacube.TempratureConverter {
  private String _endpoint = null;
  private com.metacube.TempratureConverter tempratureConverter = null;
  
  public TempratureConverterProxy() {
    _initTempratureConverterProxy();
  }
  
  public TempratureConverterProxy(String endpoint) {
    _endpoint = endpoint;
    _initTempratureConverterProxy();
  }
  
  private void _initTempratureConverterProxy() {
    try {
      tempratureConverter = (new com.metacube.TempratureConverterServiceLocator()).getTempratureConverter();
      if (tempratureConverter != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tempratureConverter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tempratureConverter)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tempratureConverter != null)
      ((javax.xml.rpc.Stub)tempratureConverter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.metacube.TempratureConverter getTempratureConverter() {
    if (tempratureConverter == null)
      _initTempratureConverterProxy();
    return tempratureConverter;
  }
  
  public double fahrenheitToCelsiusConverter(double temprature) throws java.rmi.RemoteException{
    if (tempratureConverter == null)
      _initTempratureConverterProxy();
    return tempratureConverter.fahrenheitToCelsiusConverter(temprature);
  }
  
  
}