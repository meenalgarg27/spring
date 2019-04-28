package com.meenal.ib.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.meenal.ib.enums.GovernmentIdType;

@Entity
@Table
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4093344830892423734L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String firstName;

	@Column
	private String secondName;

	@Column
	private String address;

	@Column
	private String uniqueId;

	@Column
	private boolean ibEnabled;

	@Column
	private String secretQuestion1;

	@Column
	private String secretQuestion2;

	@Column
	private String secretQuestion3;

	@OneToMany
	private List<AccountType> accounts;

	@Column
	private GovernmentIdType governmentIdType;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the secondName
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the uniqueId
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param secondName
	 *            the secondName to set
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param uniqueId
	 *            the uniqueId to set
	 */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	/**
	 * @return the accounts
	 */
	public List<AccountType> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts
	 *            the accounts to set
	 */
	public void setAccounts(List<AccountType> accounts) {
		this.accounts = accounts;
	}

	/**
	 * @return the ibEnabled
	 */
	public boolean isIbEnabled() {
		return ibEnabled;
	}

	/**
	 * @param ibEnabled
	 *            the ibEnabled to set
	 */
	public void setIbEnabled(boolean ibEnabled) {
		this.ibEnabled = ibEnabled;
	}

	/**
	 * @return the secretQuestion1
	 */
	public String getSecretQuestion1() {
		return secretQuestion1;
	}

	/**
	 * @return the secretQuestion2
	 */
	public String getSecretQuestion2() {
		return secretQuestion2;
	}

	/**
	 * @return the secretQuestion3
	 */
	public String getSecretQuestion3() {
		return secretQuestion3;
	}

	/**
	 * @param secretQuestion1 the secretQuestion1 to set
	 */
	public void setSecretQuestion1(String secretQuestion1) {
		this.secretQuestion1 = secretQuestion1;
	}

	/**
	 * @param secretQuestion2 the secretQuestion2 to set
	 */
	public void setSecretQuestion2(String secretQuestion2) {
		this.secretQuestion2 = secretQuestion2;
	}

	/**
	 * @param secretQuestion3 the secretQuestion3 to set
	 */
	public void setSecretQuestion3(String secretQuestion3) {
		this.secretQuestion3 = secretQuestion3;
	}

	/**
	 * @return the governmentIdType
	 */
	public GovernmentIdType getGovernmentIdType() {
		return governmentIdType;
	}

	/**
	 * @param governmentIdType
	 *            the governmentIdType to set
	 */
	public void setGovernmentIdType(GovernmentIdType governmentIdType) {
		this.governmentIdType = governmentIdType;
	}

}
