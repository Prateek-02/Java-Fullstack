package LambdaFunctions;

@FunctionalInterface
interface Calculator{
	int calculate(int a,int b);
}
public class Lambda4_Body {
	public static void main(String[] args) {
		Calculator multiply = (a,b) -> {
			System.out.println("Multiplying "+a+" and "+b);
			return a*b;
		};
		System.out.println("Result: "+multiply.calculate(4, 5));
	}
}
