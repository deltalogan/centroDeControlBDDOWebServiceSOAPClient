
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobileInvokerResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "mobileInvokerResult" })
@XmlRootElement(name = "MobileInvokerResponse")
public class MobileInvokerResponse {

	@XmlElement(name = "MobileInvokerResult")
	protected String mobileInvokerResult;

	/**
	 * Obtiene el valor de la propiedad mobileInvokerResult.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMobileInvokerResult() {
		return mobileInvokerResult;
	}

	/**
	 * Define el valor de la propiedad mobileInvokerResult.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMobileInvokerResult(String value) {
		this.mobileInvokerResult = value;
	}

}
