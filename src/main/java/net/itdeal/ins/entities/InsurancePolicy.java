package net.itdeal.ins.entities;
/**
 * Class InsurancePolicy individual
 * insurance policy
 * @author kiki
 *
 */
public class InsurancePolicy extends Person {
    private String ipNumber;

	public String getIpNumber() {
		return ipNumber;
	}

	public void setIpNumber(String ipNumber) {
		this.ipNumber = ipNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ipNumber == null) ? 0 : ipNumber.hashCode());
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
		InsurancePolicy other = (InsurancePolicy) obj;
		if (ipNumber == null) {
			if (other.ipNumber != null)
				return false;
		} else if (!ipNumber.equals(other.ipNumber))
			return false;
		return true;
	}
	
	
    
    
}
