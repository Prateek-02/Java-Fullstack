public class WhileLoopInfinite {
    public static void main(String[] args) {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("Hello");
            isFlag = false;
        }

        while (true) {
            System.out.println("Hi");
            System.exit(0);  // to exit infinite loop or terminate the program
        }
    }
}
