public class method1 {
    public static void main(String[] args) {
        m1(m2(),m3(100),200);
    }
    public static void m1(int c,int b, int a){
        System.out.println("m1() -> "+a);
        System.out.println("m2() -> "+c);
        System.out.println("m3(int a) -> "+b);
    }
    public static int m2(){
        return 10;
    }
    public static int m3(int a) {
        return a;
    }

}
