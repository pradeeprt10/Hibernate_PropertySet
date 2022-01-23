package One_Many_Relation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class project {
	@Id
	private int proj_id;
	private String proj_name;
	@ManyToOne
	private Emp_Hib empl;

	public Emp_Hib getEmpl() {
		return empl;
	}

	public void setEmpl(Emp_Hib empl) {
		this.empl = empl;
	}

	public int getProj_id() {
		return proj_id;
	}

	public void setProj_id(int proj_id) {
		this.proj_id = proj_id;
	}

	public String getProj_name() {
		return proj_name;
	}

	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}

	@Override
	public String toString() {
		return "proj_id=" + proj_id + ", proj_name=" + proj_name ;
	}
	
	

}
