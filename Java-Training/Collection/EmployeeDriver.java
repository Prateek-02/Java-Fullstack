package Collection;

import java.util.ArrayList;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee("Alice",101);
		Employee e2 = new Employee("Bob",102);
		Employee e3 = new Employee("John",103);
		
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		
		a.add(new Employee("Casie",104));
		a.add(new Employee("Lily",105));
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
	}
}
