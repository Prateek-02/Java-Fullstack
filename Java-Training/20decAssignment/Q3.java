public class Q3 {
    public static void main(String[] args) {
        boolean IdCard = true;
        boolean permanent_emp = true;
        boolean contract_emp = false;
        boolean managerApproval = false;

        String res = (IdCard && (permanent_emp || contract_emp) && (managerApproval) ? "Can Enter" : "Cannot Enter");
        System.out.println(res);

    }
}
