package LambdaFunctions;

@FunctionalInterface
interface Printer{
	void print(String message);
}

public class Lambda2_OneParam {
	public static void main(String[] args) {
		Printer p = msg -> System.out.println("Message: "+msg);
		
		p.print("Hello there, Welcome");
	}
}
