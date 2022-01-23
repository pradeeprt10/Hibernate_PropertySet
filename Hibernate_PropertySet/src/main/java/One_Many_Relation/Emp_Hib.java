package One_Many_Relation;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Emp_Hib {

	@Id
	private int emp_id;
	private String emp_name;
	
	// FetchType.EAGER will load the project data in starting and if FetchType.LAZY then it will load the project data when we use it
	@OneToMany(mappedBy="empl",fetch = FetchType.EAGER)
	private List<project> proj;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public List<project> getProj() {
		return proj;
	}

	public void setProj(List<project> proj) {
		this.proj = proj;
	}

}
