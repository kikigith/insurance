package net.itdeal.ins.entities;

public class MedicalServiceReferences {
	private String code;
	private String description;
	private double maxCost;// out may depend on OpeYear and CertOrg
	private double supportedRate;// out may depend on OpeYear and CertOrg
	//Type of service may be a field???
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getMaxCost() {
		return maxCost;
	}
	public void setMaxCost(double maxCost) {
		this.maxCost = maxCost;
	}
	public double getSupportedRate() {
		return supportedRate;
	}
	public void setSupportedRate(double supportedRate) {
		this.supportedRate = supportedRate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
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
		MedicalServiceReferences other = (MedicalServiceReferences) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	
	
}
