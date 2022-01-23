package Many_Many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student_Many_Many {
@Id
private int std_id;
private String std_name;
@ManyToMany()
private List<Address_Many_Many> add;
public int getStd_id() {
	return std_id;
}
public void setStd_id(int std_id) {
	this.std_id = std_id;
}
public String getStd_name() {
	return std_name;
}
public void setStd_name(String std_name) {
	this.std_name = std_name;
}
public List<Address_Many_Many> getAdd() {
	return add;
}
public void setAdd(List<Address_Many_Many> add) {
	this.add = add;
}

	
}
