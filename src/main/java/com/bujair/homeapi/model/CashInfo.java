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

/**
 * @author bujair
 *
 */
@Entity
@Table(name = "CASHINFO")
public class CashInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private double availablebalance;
	private String trandate;
	
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
	 * @return the trandate
	 */
	public String getTrandate() {
		return trandate;
	}
	/**
	 * @param trandate the trandate to set
	 */
	public void setTrandate(String trandate) {
		this.trandate = trandate;
	}
}
