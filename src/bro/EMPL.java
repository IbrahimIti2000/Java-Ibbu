package bro;

public class EMPL {
	private int eid;
	private String name;
	private int esalary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public EMPL() {

	}

	public EMPL(int eid, String name, int esalary) {
		super();
		this.eid = eid;
		this.name = name;
		this.esalary = esalary;
	}

	

}
