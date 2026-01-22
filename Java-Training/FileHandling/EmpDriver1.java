package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmpDriver1 {
	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(101,"Rahul","IT",20000.0));
		emp.add(new Employee(102,"Mukesh","BA",21000.0));
		emp.add(new Employee(103,"Nitin","DA",23000.0));
		emp.add(new Employee(104,"Praveen","Developer",50000.0));
		
		String path = "D:\\Java Training\\FileHandling\\F1\\EmployeeDetails.txt";
			
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			bw.write("ID    Name    Dept    Salary");
			bw.newLine();
			bw.write("----------------------------------");
			bw.newLine();
		
			for(Employee e:emp) {
				bw.write(e.toString());
				bw.newLine();
			}
			bw.close();
		} 
		catch (IOException e1) {
			System.err.println("Invalid Process "+e1.getMessage());
			e1.printStackTrace();
		}
			
			
	}
}
