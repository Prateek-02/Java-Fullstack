

public class Q12 {
    public static void main(String[] args) {
        boolean passLogic = true;
        boolean passCoding = false;
        boolean strogReferral = true;

        boolean passTest = passCoding && passLogic;
        String res = (strogReferral || passTest) ? "Passed Test" : "Cannot pass";
        System.out.println(res);
    }
}
