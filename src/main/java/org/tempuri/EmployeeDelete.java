
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
 *         &lt;element name="cuil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="borrar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "", propOrder = { "cuil", "cuit", "borrar", "token" })
@XmlRootElement(name = "employeeDelete")
public class EmployeeDelete {

	protected String cuil;
	protected String cuit;
	protected boolean borrar;
	protected String token;

	/**
	 * Obtiene el valor de la propiedad cuil.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCuil() {
		return cuil;
	}

	/**
	 * Define el valor de la propiedad cuil.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCuil(String value) {
		this.cuil = value;
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
	 * Obtiene el valor de la propiedad borrar.
	 * 
	 */
	public boolean isBorrar() {
		return borrar;
	}

	/**
	 * Define el valor de la propiedad borrar.
	 * 
	 */
	public void setBorrar(boolean value) {
		this.borrar = value;
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
