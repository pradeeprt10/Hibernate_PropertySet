package One_One_Relation;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity

@Cacheable
//This is for Session Factory Cache and we are using 2 dependency  mentioned in pom.xml for EHCACHE
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)


public class Question {

	@Id
	@Column(name="Qst_Name")
	private int qstid;
	private String qst;
	// Added Cascade is All(Delete,update,add)
	@OneToOne(cascade =CascadeType.ALL )
	private Answer ans;
	public int getQstid() {
		return qstid;
	}
	public void setQstid(int qstid) {
		this.qstid = qstid;
	}
	public String getQst() {
		return qst;
	}
	public void setQst(String qst) {
		this.qst = qst;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	
	@Override
	public String toString() {
		return "Question [qstid=" + qstid + ", qst=" + qst + ", ansid=" + ans.getAnsid()+ ", ans="+ans.getAns() + "]";
	}

	
}
