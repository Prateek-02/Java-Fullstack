import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cpu usage: ");
        int cpu_usage = sc.nextInt();
        System.out.print("Enter memory usage: ");
        int memory_usage = sc.nextInt();
        boolean serverUnderMaintenance = false;
        String res = ((cpu_usage > 85 || memory_usage > 90) && !serverUnderMaintenance  ? "Unstable" : "Stable");
        System.out.println(res);
        sc.close();
    }
}
