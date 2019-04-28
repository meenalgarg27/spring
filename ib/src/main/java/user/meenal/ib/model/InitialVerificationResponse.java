package user.meenal.ib.model;

import java.util.List;

public class InitialVerificationResponse {

	private String initialtionId;
	private Data<String> data;
	private List<Error> errors;
	private List<Link> links;

	/**
	 * @return the initialtionId
	 */
	public String getInitialtionId() {
		return initialtionId;
	}

	/**
	 * @return the data
	 */
	public Data<String> getData() {
		return data;
	}

	/**
	 * @return the errors
	 */
	public List<Error> getErrors() {
		return errors;
	}

	/**
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * @param initialtionId
	 *            the initialtionId to set
	 */
	public void setInitialtionId(String initialtionId) {
		this.initialtionId = initialtionId;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Data<String> data) {
		this.data = data;
	}

	/**
	 * @param errors
	 *            the errors to set
	 */
	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	/**
	 * @param links
	 *            the links to set
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}

}
