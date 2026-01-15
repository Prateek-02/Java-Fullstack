package Collection;

public class Main3 {
	public static void main(String[] args) {
		Integer x = 10;
		double d = x;
		System.out.println(d);
		
		String s = "100c";
		
		try {
			double d2 = Double.valueOf(s);
			System.out.println(d2);
		}
		catch(Exception e) {
			System.out.println("cannot convert String containing character to double");;
		}
		
		
		
		
	}
}
