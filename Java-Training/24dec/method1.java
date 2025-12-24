public class method1 {
    public static void main(String[] args) {
        System.out.println("Start");  //prints start
        demo1();   // go to demo1 method
        System.out.println("End"); //prints End
    }

    public static void demo1(){
        System.out.println("Demo1() method"); // prints Demo1() method
        demo2(); // go to demo2 method
        // after coming from demo2 method go back to main method
    }

    public static void demo2(){
        System.out.println("Demo2() method"); // prints Demo2() method, go back to demo1() method
        
    }
}
