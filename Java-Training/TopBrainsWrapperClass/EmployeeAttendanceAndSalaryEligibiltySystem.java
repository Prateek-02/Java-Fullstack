package TopBrainsWrapperClass;

public class EmployeeAttendanceAndSalaryEligibiltySystem {
	public static void main(String[] args) {
		Employee emp[] = {
				new Employee("101","Ravi","22","18"),
				new Employee("101","Meena","22","15"),
				new Employee("101","Arjun","22","null")
		};
		
		AttendanceService service = new AttendanceService();
		
		for(Employee e : emp) {
			Integer total = service.parseAttendance(e.getTotalWorkingDays());
			Integer present = service.parseAttendance(e.getDaysPresent());
			
			Integer attendance = service.calculateAttendancePercentage(total, present);
			
			String eligible = service.isSalaryEligible(attendance) ? "Salary Eligible" : "Not Eligible";
			
			System.out.println("Employee: "+e.getEmployeeName()+" --> Attendance: "+attendance+"% --> "+eligible);
		}
	}
}

class Employee{
	private String employeeId;
	private String employeeName;
	private String totalWorkingDays;
	private String daysPresent;
	
	Employee(String employeeId,String employeeName,String totalWorkingDays,String daysPresent){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.totalWorkingDays = totalWorkingDays;
		this.daysPresent = daysPresent;
	}
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getTotalWorkingDays() {
		return totalWorkingDays;
	}

	public void setTotalWorkingDays(String totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}

	public String getDaysPresent() {
		return daysPresent;
	}

	public void setDaysPresent(String daysPresent) {
		this.daysPresent = daysPresent;
	}
	
}

class AttendanceService{
	public Integer parseAttendance(String value) {
		try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
	}
	
	public Integer calculateAttendancePercentage(Integer total,Integer present) {
		return (present*100)/total;
	}
	
	public boolean isSalaryEligible(Integer attendance){
		return attendance >= 75;
	}
}
