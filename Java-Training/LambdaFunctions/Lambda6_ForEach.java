package LambdaFunctions;

import java.util.Arrays;
import java.util.List;

public class Lambda6_ForEach {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Dhoni","Raina","Yuvraj");
		
		//lambda way
		names.forEach(name -> System.out.println(name.toUpperCase()));
		
		//method reference way
		names.forEach(System.out::println);
	}
}
