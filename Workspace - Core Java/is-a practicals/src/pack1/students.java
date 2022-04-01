package pack1;

public class students extends jspiders
{
	String cource;
	int fees;
	public students(String name, String branch, int branchid, String cource,int fees)
	{
		super(name, branch, branchid);
		this.cource = cource;
		this.fees = fees;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
}
