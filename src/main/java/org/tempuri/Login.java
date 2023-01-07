
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
 *         &lt;element name="nombre_usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "nombreUsuario", "password", "passwordAD", "idCompany" })
@XmlRootElement(name = "login")
public class Login {

	@XmlElement(name = "nombre_usuario")
	protected String nombreUsuario;
	protected String password;
	protected String passwordAD;
	protected String idCompany;

	/**
	 * Obtiene el valor de la propiedad nombreUsuario.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * Define el valor de la propiedad nombreUsuario.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}

	/**
	 * Obtiene el valor de la propiedad password.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Define el valor de la propiedad password.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value) {
		this.password = value;
	}

	/**
	 * Obtiene el valor de la propiedad passwordAD.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPasswordAD() {
		return passwordAD;
	}

	/**
	 * Define el valor de la propiedad passwordAD.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPasswordAD(String value) {
		this.passwordAD = value;
	}

	/**
	 * Obtiene el valor de la propiedad idCompany.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdCompany() {
		return idCompany;
	}

	/**
	 * Define el valor de la propiedad idCompany.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setIdCompany(String value) {
		this.idCompany = value;
	}

}
