package user.meenal.ib.model;

import com.meenal.ib.enums.LinkType;

public class Link {

	private LinkType type;
	private String url;

	/**
	 * @return the type
	 */
	public LinkType getType() {
		return type;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(LinkType type) {
		this.type = type;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
