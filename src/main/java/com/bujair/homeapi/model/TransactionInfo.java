/**
 * 
 */
package com.bujair.homeapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author bujair
 *
 */
@Entity
@Table(name = "TRANSINFO")
public class TransactionInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull(message="Transaction Amount should be valid")
	private double amount;
	
	@NotNull(message="Transaction date should be valid")
	private String  transDate;
	private String reason;
	@NotNull(message="Please mention who spent?")
	private String person;
	@NotNull(message="Please mention where you spent on?")
	private String spentOn;
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
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the transDate
	 */
	public String getTransDate() {
		return transDate;
	}
	/**
	 * @param transDate the transDate to set
	 */
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * @return the person
	 */
	public String getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(String person) {
		this.person = person;
	}
	/**
	 * @return the spentOn
	 */
	public String getSpentOn() {
		return spentOn;
	}
	/**
	 * @param spentOn the spentOn to set
	 */
	public void setSpentOn(String spentOn) {
		this.spentOn = spentOn;
	}
	
}
