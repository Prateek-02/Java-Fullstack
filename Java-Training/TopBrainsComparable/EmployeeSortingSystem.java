package TopBrainsComparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSortingSystem{
    public static void main(String[] args){
        ArrayList <Employee> emp = new ArrayList<>();
        emp.add(new Employee(201,"John",50000.0));
        emp.add(new Employee(103,"Emma",75000.0));
        emp.add(new Employee(150,"Liam",62000.0));
        emp.add(new Employee(120,"Olivia",58000.0));

        System.out.println("Employees before sorting:");
        for(Employee e: emp){
            System.out.println(e);
        }

        System.out.println();

        Collections.sort(emp);
        System.out.println("Employees after sorting:");
        for(Employee e: emp){
            System.out.println(e);
        }
    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;

    Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
    
    @Override
    public int compareTo(Employee obj){
        return Integer.compare(this.id, obj.id);
    }

    @Override
    public String toString(){
        return "ID: "+id+", Name: "+name+", Salary: "+salary;
    }
}
