
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="pXmlSolicitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "pXmlSolicitud", "token" })
@XmlRootElement(name = "GetEmployeeInboxes")
public class GetEmployeeInboxes {

	protected String pXmlSolicitud;
	protected String token;

	/**
	 * Obtiene el valor de la propiedad pXmlSolicitud.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPXmlSolicitud() {
		return pXmlSolicitud;
	}

	/**
	 * Define el valor de la propiedad pXmlSolicitud.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPXmlSolicitud(String value) {
		this.pXmlSolicitud = value;
	}

	/**
	 * Obtiene el valor de la propiedad token.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Define el valor de la propiedad token.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setToken(String value) {
		this.token = value;
	}

}
