package FileHandling;

public class Employee {
	int empId;
	String empName;
	String dept;
	double salary;
	public Employee(int empId, String empName, String dept, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return empId + "    " + empName + "    " + dept +"    " + salary;
	}
	
	
	
}
