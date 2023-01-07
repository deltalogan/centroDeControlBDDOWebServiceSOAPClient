
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
 *         &lt;element name="recibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reciboNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claseRecibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "recibo", "reciboNombre", "claseRecibo", "cuit", "token" })
@XmlRootElement(name = "inboxAddDocument")
public class InboxAddDocument {

	protected String recibo;
	protected String reciboNombre;
	protected String claseRecibo;
	protected String cuit;
	@XmlElement(name = "Token")
	protected String token;

	/**
	 * Obtiene el valor de la propiedad recibo.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRecibo() {
		return recibo;
	}

	/**
	 * Define el valor de la propiedad recibo.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRecibo(String value) {
		this.recibo = value;
	}

	/**
	 * Obtiene el valor de la propiedad reciboNombre.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReciboNombre() {
		return reciboNombre;
	}

	/**
	 * Define el valor de la propiedad reciboNombre.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setReciboNombre(String value) {
		this.reciboNombre = value;
	}

	/**
	 * Obtiene el valor de la propiedad claseRecibo.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClaseRecibo() {
		return claseRecibo;
	}

	/**
	 * Define el valor de la propiedad claseRecibo.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setClaseRecibo(String value) {
		this.claseRecibo = value;
	}

	/**
	 * Obtiene el valor de la propiedad cuit.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCuit() {
		return cuit;
	}

	/**
	 * Define el valor de la propiedad cuit.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCuit(String value) {
		this.cuit = value;
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
