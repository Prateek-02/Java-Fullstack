package LambdaFunctions;
@FunctionalInterface
interface Adder{
	int add(int a,int b);
}

public class Lambda3_MultiParam {
	public static void main(String[] args) {
		Adder sum = (x,y) -> x+y;
		System.out.println("Sum is: "+sum.add(5, 7));
	}
}
