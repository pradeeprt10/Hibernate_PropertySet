package Embadable;

import javax.persistence.Embeddable;

@Embeddable
public class Course {

	private String name;
	private int fees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
}
