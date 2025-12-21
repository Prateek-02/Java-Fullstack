import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter experience: ");
        int exp = sc.nextInt();
        boolean strongProject = true;
        boolean completedGraduation = true;

        String res = (completedGraduation && (exp >= 2 || strongProject) ? "Eligible for Interview" : "Not Eligible");
        System.out.println(res);
        sc.close();

    }
}
