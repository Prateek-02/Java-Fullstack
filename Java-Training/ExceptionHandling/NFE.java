package ExceptionHandling;

public class NFE {
	public static void main(String[] args) {
		String str = "amit";
		
		try {
			int a = Integer.parseInt(str);
			System.out.println(a);
		}
		catch(NumberFormatException nfe) {
			System.out.println("String "+ str +" cannot be converted to int");
		}
		
	}
}
