
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
 *         &lt;element name="reciboE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reciboP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reciboNombreEmpleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reciboNombreEmpleador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claseRecibo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "reciboE", "reciboP", "reciboNombreEmpleado", "reciboNombreEmpleador", "claseRecibo",
		"cuit", "token" })
@XmlRootElement(name = "inboxAdd")
public class InboxAdd {

	protected String reciboE;
	protected String reciboP;
	protected String reciboNombreEmpleado;
	protected String reciboNombreEmpleador;
	protected String claseRecibo;
	protected String cuit;
	protected String token;

	/**
	 * Obtiene el valor de la propiedad reciboE.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReciboE() {
		return reciboE;
	}

	/**
	 * Define el valor de la propiedad reciboE.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setReciboE(String value) {
		this.reciboE = value;
	}

	/**
	 * Obtiene el valor de la propiedad reciboP.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReciboP() {
		return reciboP;
	}

	/**
	 * Define el valor de la propiedad reciboP.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setReciboP(String value) {
		this.reciboP = value;
	}

	/**
	 * Obtiene el valor de la propiedad reciboNombreEmpleado.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReciboNombreEmpleado() {
		return reciboNombreEmpleado;
	}

	/**
	 * Define el valor de la propiedad reciboNombreEmpleado.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setReciboNombreEmpleado(String value) {
		this.reciboNombreEmpleado = value;
	}

	/**
	 * Obtiene el valor de la propiedad reciboNombreEmpleador.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReciboNombreEmpleador() {
		return reciboNombreEmpleador;
	}

	/**
	 * Define el valor de la propiedad reciboNombreEmpleador.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setReciboNombreEmpleador(String value) {
		this.reciboNombreEmpleador = value;
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
