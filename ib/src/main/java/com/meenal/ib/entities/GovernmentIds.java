package com.meenal.ib.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class GovernmentIds {

	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	@Column
	private String governmentId;
	
	@OneToOne
	private GovernmentIdType governmentIdType;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the governmentId
	 */
	public String getGovernmentId() {
		return governmentId;
	}

	/**
	 * @return the governmentIdType
	 */
	public GovernmentIdType getGovernmentIdType() {
		return governmentIdType;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param governmentId the governmentId to set
	 */
	public void setGovernmentId(String governmentId) {
		this.governmentId = governmentId;
	}

	/**
	 * @param governmentIdType the governmentIdType to set
	 */
	public void setGovernmentIdType(GovernmentIdType governmentIdType) {
		this.governmentIdType = governmentIdType;
	}
	
	
}
