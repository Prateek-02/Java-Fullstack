package Polymorphism;

public class StaticOverload {
	public static void main(String[] args) {
		StaticMethod s = new StaticMethod();
		System.out.println(s.add(4, 5));
		System.out.println(s.add(4.5, 5.6));
		
	}

}

class StaticMethod{
	static int add(int a,int b) {
		return a+b;
	}
	
	static double add(double a,double b) {
		return a+b;
	}
	
}
