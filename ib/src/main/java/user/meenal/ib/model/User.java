package user.meenal.ib.model;

import com.meenal.ib.enums.GovernmentIdType;

public class User {

	private String firstName;

	private String secondName;

	private String address;

	private String uniqueId;

	private GovernmentIdType governmentIdType;

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
