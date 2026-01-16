package constructor;

public class A {
	int a,b;
	public A() {
		System.out.println("No Args constructor");
	}
	
	A(int a){
		this();// this call statement, it calls the non parameterized constructor
		this.a=a;
		method();
	}
	
	A(int a,int b){
		this();
		this.a =a;
		this.b=b;
	}
	
	public  void method() {
		System.out.println(this); // this keyword give the address of current class
		
	}
	
	public static void main(String[] args){
		A a1 = new A(100);
		System.out.println(a1.a);
		System.out.println("--------------------------");
		
		A a2 = new A(50,100);
		System.out.println(a2.a);
		System.out.println(a2.b);
		
		
	}
}
