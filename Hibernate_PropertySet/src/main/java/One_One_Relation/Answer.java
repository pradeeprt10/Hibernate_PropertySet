package One_One_Relation;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToOne;

@Entity
public class Answer {
	
@Id
@Column(name="Ans_id")

	private int ansid;
	private String ans;
	public int getAnsid() {
		return ansid;
	}
	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
	@Override
	public String toString() {
		return "Answer [ansid=" + ansid + ", ans=" + ans + "]";
	}

	
}
