
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
 *         &lt;element name="pIdUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pCuit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pSectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pSubsidiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pSheetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pCuil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pCitizenShip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pIdEmployeeSexType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pIdEmployeeCitizenshipDocType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pCitizenshipDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pDateEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "pIdUser", "pCuit", "pSectionName", "pSubsidiaryName", "pSheetNumber", "pCuil",
		"pCitizenShip", "pIdEmployeeSexType", "pIdEmployeeCitizenshipDocType", "pCitizenshipDocumentNumber",
		"pDateEntry", "pFirstName", "pLastName", "pRol", "pEmail", "token", "pAddress" })
@XmlRootElement(name = "employeeAdd")
public class EmployeeAdd {

	protected String pIdUser;
	protected String pCuit;
	protected String pSectionName;
	protected String pSubsidiaryName;
	protected String pSheetNumber;
	protected String pCuil;
	protected String pCitizenShip;
	protected String pIdEmployeeSexType;
	protected String pIdEmployeeCitizenshipDocType;
	protected String pCitizenshipDocumentNumber;
	protected String pDateEntry;
	protected String pFirstName;
	protected String pLastName;
	protected String pRol;
	protected String pEmail;
	protected String token;
	protected String pAddress;

	/**
	 * Obtiene el valor de la propiedad pIdUser.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPIdUser() {
		return pIdUser;
	}

	/**
	 * Define el valor de la propiedad pIdUser.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPIdUser(String value) {
		this.pIdUser = value;
	}

	/**
	 * Obtiene el valor de la propiedad pCuit.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPCuit() {
		return pCuit;
	}

	/**
	 * Define el valor de la propiedad pCuit.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPCuit(String value) {
		this.pCuit = value;
	}

	/**
	 * Obtiene el valor de la propiedad pSectionName.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPSectionName() {
		return pSectionName;
	}

	/**
	 * Define el valor de la propiedad pSectionName.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPSectionName(String value) {
		this.pSectionName = value;
	}

	/**
	 * Obtiene el valor de la propiedad pSubsidiaryName.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPSubsidiaryName() {
		return pSubsidiaryName;
	}

	/**
	 * Define el valor de la propiedad pSubsidiaryName.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPSubsidiaryName(String value) {
		this.pSubsidiaryName = value;
	}

	/**
	 * Obtiene el valor de la propiedad pSheetNumber.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPSheetNumber() {
		return pSheetNumber;
	}

	/**
	 * Define el valor de la propiedad pSheetNumber.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPSheetNumber(String value) {
		this.pSheetNumber = value;
	}

	/**
	 * Obtiene el valor de la propiedad pCuil.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPCuil() {
		return pCuil;
	}

	/**
	 * Define el valor de la propiedad pCuil.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPCuil(String value) {
		this.pCuil = value;
	}

	/**
	 * Obtiene el valor de la propiedad pCitizenShip.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPCitizenShip() {
		return pCitizenShip;
	}

	/**
	 * Define el valor de la propiedad pCitizenShip.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPCitizenShip(String value) {
		this.pCitizenShip = value;
	}

	/**
	 * Obtiene el valor de la propiedad pIdEmployeeSexType.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPIdEmployeeSexType() {
		return pIdEmployeeSexType;
	}

	/**
	 * Define el valor de la propiedad pIdEmployeeSexType.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPIdEmployeeSexType(String value) {
		this.pIdEmployeeSexType = value;
	}

	/**
	 * Obtiene el valor de la propiedad pIdEmployeeCitizenshipDocType.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPIdEmployeeCitizenshipDocType() {
		return pIdEmployeeCitizenshipDocType;
	}

	/**
	 * Define el valor de la propiedad pIdEmployeeCitizenshipDocType.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPIdEmployeeCitizenshipDocType(String value) {
		this.pIdEmployeeCitizenshipDocType = value;
	}

	/**
	 * Obtiene el valor de la propiedad pCitizenshipDocumentNumber.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPCitizenshipDocumentNumber() {
		return pCitizenshipDocumentNumber;
	}

	/**
	 * Define el valor de la propiedad pCitizenshipDocumentNumber.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPCitizenshipDocumentNumber(String value) {
		this.pCitizenshipDocumentNumber = value;
	}

	/**
	 * Obtiene el valor de la propiedad pDateEntry.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPDateEntry() {
		return pDateEntry;
	}

	/**
	 * Define el valor de la propiedad pDateEntry.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPDateEntry(String value) {
		this.pDateEntry = value;
	}

	/**
	 * Obtiene el valor de la propiedad pFirstName.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPFirstName() {
		return pFirstName;
	}

	/**
	 * Define el valor de la propiedad pFirstName.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPFirstName(String value) {
		this.pFirstName = value;
	}

	/**
	 * Obtiene el valor de la propiedad pLastName.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPLastName() {
		return pLastName;
	}

	/**
	 * Define el valor de la propiedad pLastName.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPLastName(String value) {
		this.pLastName = value;
	}

	/**
	 * Obtiene el valor de la propiedad pRol.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPRol() {
		return pRol;
	}

	/**
	 * Define el valor de la propiedad pRol.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPRol(String value) {
		this.pRol = value;
	}

	/**
	 * Obtiene el valor de la propiedad pEmail.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPEmail() {
		return pEmail;
	}

	/**
	 * Define el valor de la propiedad pEmail.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPEmail(String value) {
		this.pEmail = value;
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

	/**
	 * Obtiene el valor de la propiedad pAddress.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPAddress() {
		return pAddress;
	}

	/**
	 * Define el valor de la propiedad pAddress.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPAddress(String value) {
		this.pAddress = value;
	}

}
