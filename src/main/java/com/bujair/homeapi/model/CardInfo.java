/**
 * 
 */
package com.bujair.homeapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author bujair
 *
 */
@Entity
@Table(name = "CARDINFO")
public class CardInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false, unique = true)
	@NotNull(message="Card Number should be valid")
	private String cardno;
	@NotNull(message="Bank Name should be valid")
	private String bankname;
	private String duedate;
	private double dueamount;
	private double availablebalance;
	private double creditLimit;
	private String bilgendate;
	private String pin;
	private String carduserid;
	private String branch;
	private String trnpwd;
	@Pattern(regexp ="^D$|^d$|^debit$|^DEBIT$|^S$|^s$|^sodexo$|^SODEXO$|^C$|^c$|^CREDIT$|^credit$*",message="Card Type not allowed")
	private String cardtype;
	private String acno;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the cardno
	 */
	public String getCardno() {
		return cardno;
	}
	/**
	 * @param cardno the cardno to set
	 */
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	/**
	 * @return the bankname
	 */
	public String getBankname() {
		return bankname;
	}
	/**
	 * @param bankname the bankname to set
	 */
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	/**
	 * @return the duedate
	 */
	public String getDuedate() {
		return duedate;
	}
	/**
	 * @param duedate the duedate to set
	 */
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	/**
	 * @return the dueamount
	 */
	public double getDueamount() {
		return dueamount;
	}
	/**
	 * @param dueamount the dueamount to set
	 */
	public void setDueamount(double dueamount) {
		this.dueamount = dueamount;
	}
	/**
	 * @return the availablebalance
	 */
	public double getAvailablebalance() {
		return availablebalance;
	}
	/**
	 * @param availablebalance the availablebalance to set
	 */
	public void setAvailablebalance(double availablebalance) {
		this.availablebalance = availablebalance;
	}
	/**
	 * @return the creditLimit
	 */
	public double getCreditLimit() {
		return creditLimit;
	}
	/**
	 * @param creditLimit the creditLimit to set
	 */
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	/**
	 * @return the bilgendate
	 */
	public String getBilgendate() {
		return bilgendate;
	}
	/**
	 * @param bilgendate the bilgendate to set
	 */
	public void setBilgendate(String bilgendate) {
		this.bilgendate = bilgendate;
	}
	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}
	/**
	 * @return the carduserid
	 */
	public String getCarduserid() {
		return carduserid;
	}
	/**
	 * @param carduserid the carduserid to set
	 */
	public void setCarduserid(String carduserid) {
		this.carduserid = carduserid;
	}
	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	/**
	 * @return the trnpwd
	 */
	public String getTrnpwd() {
		return trnpwd;
	}
	/**
	 * @param trnpwd the trnpwd to set
	 */
	public void setTrnpwd(String trnpwd) {
		this.trnpwd = trnpwd;
	}
	/**
	 * @return the cardtype
	 */
	public String getCardtype() {
		return cardtype;
	}
	/**
	 * @param cardtype the cardtype to set
	 */
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	/**
	 * @return the acno
	 */
	public String getAcno() {
		return acno;
	}
	/**
	 * @param acno the acno to set
	 */
	public void setAcno(String acno) {
		this.acno = acno;
	}

}
