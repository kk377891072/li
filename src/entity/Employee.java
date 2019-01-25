package entity;

public class Employee {

	private String empId;
	private String empName;
	private int sex;
	private Dept dept = new Dept();

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Employee(String empId, String empName, int sex, Dept dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sex = sex;
		this.dept = dept;
	}

	public Employee() {
		super();
	}

}