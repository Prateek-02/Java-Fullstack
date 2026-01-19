package TopBrainsComparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentPerformanceSortingSystem {
	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<>();
		
		student.add(new Student(101,"Alice",85));
		student.add(new Student(102,"Bob",72));
		student.add(new Student(103,"Charlie",90));
		student.add(new Student(104,"Diana",78));
		
		System.out.println("Students before sorting:");
		for(Student s:student) {
			System.out.println(s);
		}
		
		Collections.sort(student);
		System.out.println("\nStudents after sorting (by marks ascending):");
		for(Student s:student) {
			System.out.println(s);
		}
	}
}

class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	private int marks;
	
	Student(int rollNo,String name,int marks){
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		return "RollNo: "+rollNo + ", Name: "+name+", Marks: "+marks; 
	}
	
	@Override
	public int compareTo(Student obj) {
		return Integer.compare(this.marks, obj.marks);
	}
	
	
}
