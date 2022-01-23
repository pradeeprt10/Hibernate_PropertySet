package Embadable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Student")
public class Std_hibernate {
@Id
	private int stdid;
	private String stdname;
	private String pancard;
	private Course cour;
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public Course getCour() {
		return cour;
	}
	public void setCour(Course cour) {
		this.cour = cour;
	}
	@Override
	public String toString() {
		return "Std_hibernate [stdid=" + stdid + ", stdname=" + stdname + ", pancard=" + pancard + ", cour=" + cour
				+ "]";
	}
	
	

}
