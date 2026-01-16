package encapsulation;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		System.out.println(a);
		sc.close();
	}
}
