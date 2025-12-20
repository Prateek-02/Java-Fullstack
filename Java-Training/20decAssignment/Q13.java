public class Q13{
    public static void main(String[] args) {
        boolean loggedIn =  true;
        boolean acceptedTC = true;

        String res = (loggedIn && acceptedTC ? "App feature is enabled":"App feature is not enables");
        System.out.println(res);

    }
}