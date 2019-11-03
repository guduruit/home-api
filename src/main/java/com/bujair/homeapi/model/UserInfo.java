/**
 * 
 */
package com.bujair.homeapi.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


/**
 * @author bujair
 *
 */
@Entity
@Table(name = "USERINFO")
public class UserInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String password;

    @NotBlank
    @Column(name="userName")
    private String userName;

	/*
	 * @Column(name="createdAt" ,nullable = false, updatable = false)
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @CreatedDate private Date createdAt;
	 * 
	 * @Column(name="updatedAt" ,nullable = false)
	 * 
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @LastModifiedDate private Date updatedAt;
	 */

    @NotBlank(message=" First name is mandatory")
    private String fname;
    private String lname;
    private String dob;
    @Pattern(regexp ="^M$|^m$|^Male$|^male$|^F$|^f$|^Female$|^female$*",message="Gender not allowed")
    private String gendar;
    private String phone;
    private String email;
    
    @OneToOne(cascade=CascadeType.ALL)
    @Fetch(value = FetchMode.SELECT)
    @JoinColumn(name = "addressID")
    private Address primaryAddress;
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/*
	 * public Date getCreatedAt() { if(null == createdAt) createdAt = new Date();
	 * return createdAt; }
	 * 
	 * public void setCreatedAt(Date createdAt) { if(null == createdAt) createdAt =
	 * new Date(); this.createdAt = createdAt; }
	 * 
	 * public Date getUpdatedAt() { if(null == updatedAt) updatedAt = new Date();
	 * return updatedAt; }
	 * 
	 * public void setUpdatedAt(Date updatedAt) { if(null == updatedAt) updatedAt =
	 * new Date(); this.updatedAt = updatedAt; }
	 */
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGendar() {
		return gendar;
	}

	public void setGendar(String gendar) {
		this.gendar = gendar;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getPrimaryAddress() {
		return primaryAddress;
	}

	public void setPrimaryAddress(Address primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
    

}
