
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BddoService", targetNamespace = "http://tempuri.org/", wsdlLocation = "https://bddodemo.encodesa.com.ar/Services/BddoService.asmx?WSDL")
public class BddoService extends Service {

	private final static URL BDDOSERVICE_WSDL_LOCATION;
	private final static WebServiceException BDDOSERVICE_EXCEPTION;
	private final static QName BDDOSERVICE_QNAME = new QName("http://tempuri.org/", "BddoService");

	static {
		URL url = null;
		WebServiceException e = null;
		try {
			url = new URL("https://bddodemo.encodesa.com.ar/Services/BddoService.asmx?WSDL");
		} catch (MalformedURLException ex) {
			e = new WebServiceException(ex);
		}
		BDDOSERVICE_WSDL_LOCATION = url;
		BDDOSERVICE_EXCEPTION = e;
	}

	public BddoService() {
		super(__getWsdlLocation(), BDDOSERVICE_QNAME);
	}

	public BddoService(WebServiceFeature... features) {
		super(__getWsdlLocation(), BDDOSERVICE_QNAME, features);
	}

	public BddoService(URL wsdlLocation) {
		super(wsdlLocation, BDDOSERVICE_QNAME);
	}

	public BddoService(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, BDDOSERVICE_QNAME, features);
	}

	public BddoService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public BddoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	/**
	 * 
	 * @return returns BddoServiceSoap
	 */
	@WebEndpoint(name = "BddoServiceSoap")
	public BddoServiceSoap getBddoServiceSoap() {
		return super.getPort(new QName("http://tempuri.org/", "BddoServiceSoap"), BddoServiceSoap.class);
	}

	/**
	 * 
	 * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *                 on the proxy. Supported features not in the
	 *                 <code>features</code> parameter will have their default
	 *                 values.
	 * @return returns BddoServiceSoap
	 */
	@WebEndpoint(name = "BddoServiceSoap")
	public BddoServiceSoap getBddoServiceSoap(WebServiceFeature... features) {
		return super.getPort(new QName("http://tempuri.org/", "BddoServiceSoap"), BddoServiceSoap.class, features);
	}

	/**
	 * 
	 * @return returns BddoServiceSoap
	 */
	@WebEndpoint(name = "BddoServiceSoap12")
	public BddoServiceSoap getBddoServiceSoap12() {
		return super.getPort(new QName("http://tempuri.org/", "BddoServiceSoap12"), BddoServiceSoap.class);
	}

	/**
	 * 
	 * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *                 on the proxy. Supported features not in the
	 *                 <code>features</code> parameter will have their default
	 *                 values.
	 * @return returns BddoServiceSoap
	 */
	@WebEndpoint(name = "BddoServiceSoap12")
	public BddoServiceSoap getBddoServiceSoap12(WebServiceFeature... features) {
		return super.getPort(new QName("http://tempuri.org/", "BddoServiceSoap12"), BddoServiceSoap.class, features);
	}

	private static URL __getWsdlLocation() {
		if (BDDOSERVICE_EXCEPTION != null) {
			throw BDDOSERVICE_EXCEPTION;
		}
		return BDDOSERVICE_WSDL_LOCATION;
	}

}
