package ExceptionHandling;

public class NPE {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.toUpperCase());;
		}
		catch(NullPointerException e) {
			System.out.println("Cannot cast null to uppercase");
		}
	}
}
