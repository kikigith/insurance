package net.itdeal.ins.entities;
/**
 * Class OperationYear defined 
 * any the Year of business Operations
 * @author kiki
 *
 */
import java.time.LocalDate;

public class OperationYear {
	private String code;
	private LocalDate startDate;
	private LocalDate endDate;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	
}
