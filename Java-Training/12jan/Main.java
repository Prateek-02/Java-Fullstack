public class Main {
	public static void main(String[] args) {
		A a = new A("Prateek",22,14344,1224);
		System.out.println(a);
		System.out.println(a.toString());
	}
}

class A{
	private String name;
	private int age;
	private long contactNum;
	private long regNum;

	A(String name, int age, long contactNum, long regNum) {
		this.name = name;
		this.age = age;
		this.contactNum = contactNum;
		this.regNum = regNum;
	}

	@Override
	public String toString() {
		System.out.println("Name: "+name + "\nAge: "+ age +"\nContactNum: "+ contactNum + "\nregNum: "+regNum);
		return " ";
	}
}
