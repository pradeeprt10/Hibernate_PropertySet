package Many_Many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Address_Many_Many {
	@Id
	private int address_id;
	private String address_name;
	@ManyToMany()
	private List<Student_Many_Many> std;
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getAddress_name() {
		return address_name;
	}
	public void setAddress_name(String address_name) {
		this.address_name = address_name;
	}
	public List<Student_Many_Many> getStd() {
		return std;
	}
	public void setStd(List<Student_Many_Many> std) {
		this.std = std;
	}
	
	
}
