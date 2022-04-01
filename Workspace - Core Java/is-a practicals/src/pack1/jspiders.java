package pack1;

public class jspiders
{
	String name;
	String branch;
	int batchid;
	
	public jspiders(String name, String branch, int batchid)
	{
		//super();
		this.name = name;
		this.branch = branch;
		this.batchid = batchid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getBatchid() {
		return batchid;
	}

	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
	
	
}
