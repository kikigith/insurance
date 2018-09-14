package net.itdeal.ins.entities;

public class PolicyType {
	private String ptCode;
	private String ptDescription;
	public String getPtCode() {
		return ptCode;
	}
	public void setPtCode(String ptCode) {
		this.ptCode = ptCode;
	}
	public String getPtDescription() {
		return ptDescription;
	}
	public void setPtDescription(String ptDescription) {
		this.ptDescription = ptDescription;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ptCode == null) ? 0 : ptCode.hashCode());
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
		PolicyType other = (PolicyType) obj;
		if (ptCode == null) {
			if (other.ptCode != null)
				return false;
		} else if (!ptCode.equals(other.ptCode))
			return false;
		return true;
	}
	
	

}
