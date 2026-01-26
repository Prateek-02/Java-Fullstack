package LambdaFunctions;


@FunctionalInterface
interface Greeting {
	void sayHello();
}

public class Lambda1_ZeroParam {
	public static void main(String[] args) {
		//Traditional anonymus class(long)
		Greeting g = new Greeting() {
			public void sayHello() {
				System.out.println("Hello!");
			}
		};
		g.sayHello();
		
		//using lambda expression
		Greeting g2 = () -> System.out.println("Hello there");
		g2.sayHello();
	}
}
