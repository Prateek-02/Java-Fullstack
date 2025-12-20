
public class Q8 {
    public static void main(String[] args) {
        int exp = 1;
        boolean strongProject = true;
        boolean completedGraduation = true;

        String res = (completedGraduation && (exp >= 2 || strongProject) ? "Eligible for Interview" : "Not Eligible");
        System.out.println(res);

    }
}
