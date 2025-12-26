import java.util.Scanner;

public class LoginAuthentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sc.next();
        System.out.print("Enter your password: ");
        String password = sc.next();

        int statusCode = authentication(username, password);
        System.out.println(statusCode);

        sc.close();

    }

    public static int authentication(String expUsername,String expPassword){

        if(expUsername.equals("admin") && expPassword.equals("admin123")){
            return 200;
        }
        else{
            return 400;
        }

        

    }
}
