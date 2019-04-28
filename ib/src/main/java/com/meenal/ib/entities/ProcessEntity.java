package com.meenal.ib.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.meenal.ib.enums.IbProcess;

@Entity
@Table
public class ProcessEntity {
	
	@Id
	@Column
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	@Column
	private boolean initialVerificationDone;
	
	@Column
	private boolean isFinalVerificationDone;

	@Column
	private IbProcess ibProcess;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the initialVerificationDone
	 */
	public boolean isInitialVerificationDone() {
		return initialVerificationDone;
	}

	/**
	 * @return the isFinalVerificationDone
	 */
	public boolean isFinalVerificationDone() {
		return isFinalVerificationDone;
	}

	/**
	 * @return the ibProcess
	 */
	public IbProcess getIbProcess() {
		return ibProcess;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param initialVerificationDone the initialVerificationDone to set
	 */
	public void setInitialVerificationDone(boolean initialVerificationDone) {
		this.initialVerificationDone = initialVerificationDone;
	}

	/**
	 * @param isFinalVerificationDone the isFinalVerificationDone to set
	 */
	public void setFinalVerificationDone(boolean isFinalVerificationDone) {
		this.isFinalVerificationDone = isFinalVerificationDone;
	}

	/**
	 * @param ibProcess the ibProcess to set
	 */
	public void setIbProcess(IbProcess ibProcess) {
		this.ibProcess = ibProcess;
	}



	
	
}
