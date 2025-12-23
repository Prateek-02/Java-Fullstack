public class DoWhileLoopInfinite {
        public static void main(String[] args) {
        boolean isFlag = true;
        do{
            System.out.println("Hi");
            isFlag = false;
        }
        while(isFlag);


        do{
            System.out.println("Hello");
            System.exit(0); // to exit infinite loop or terminate the program
        }
        while(true);

    
    }
}
