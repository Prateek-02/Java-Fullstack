public class Q5 {
    public static void main(String[] args) {
        int cpu_usage = 90;
        int memory_usage = 95;
        boolean serverUnderMaintenance = false;
        String res = ((cpu_usage > 85 || memory_usage > 90) && !serverUnderMaintenance  ? "Unstable" : "Stable");
        System.out.println(res);
    }
}
