package cb.beans;

public class EngStudent extends Student {
	private String branch_code;
	private String college_code;

	public EngStudent() {}

	public String getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	
	public String getCollege_code() {
		return college_code;
	}
	public void setCollege_code(String college_code) {
		this.college_code = college_code;
	}

	@Override
	public String toString() {
		return "EngStudent [branch_code=" + branch_code + ", college_code=" + college_code + "]";
	}

	
}
