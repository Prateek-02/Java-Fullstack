package constructor;

public class B {
	int a,b;
	public B() {
		System.out.println("No Args constructor");
	}
	
	public B(int a){
		this();// this call statement, it calls the non parameterized constructor
		this.a=a;
	}
	
	public B(int a,int b){
		this(a);
		this.b=b;
	}
	
	public  void method() {
		System.out.println(this); // this keyword give the address of current class
		
	}
	
	public static void main(String[] args){
		B a1 = new B(50,100);
		System.out.println(a1.a);
		System.out.println(a1.b);
	}
}
