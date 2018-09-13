package net.itdeal.ins.entities;

public class PolicySubscriber {
	private Long psNumber;
	private String psName;
	private String psDescription;
	private String psAddress;
	private String psPhone;
	private SubscriberCategory psCategory;
	public Long getPsNumber() {
		return psNumber;
	}
	public void setPsNumber(Long psNumber) {
		this.psNumber = psNumber;
	}
	public String getPsName() {
		return psName;
	}
	public void setPsName(String psName) {
		this.psName = psName;
	}
	public String getPsDescription() {
		return psDescription;
	}
	public void setPsDescription(String psDescription) {
		this.psDescription = psDescription;
	}
	public String getPsAddress() {
		return psAddress;
	}
	public void setPsAddress(String psAddress) {
		this.psAddress = psAddress;
	}
	public String getPsPhone() {
		return psPhone;
	}
	public void setPsPhone(String psPhone) {
		this.psPhone = psPhone;
	}
	public SubscriberCategory getPsCategory() {
		return psCategory;
	}
	public void setPsCategory(SubscriberCategory psCategory) {
		this.psCategory = psCategory;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((psNumber == null) ? 0 : psNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PolicySubscriber other = (PolicySubscriber) obj;
		if (psNumber == null) {
			if (other.psNumber != null)
				return false;
		} else if (!psNumber.equals(other.psNumber))
			return false;
		return true;
	}
	
	

}
