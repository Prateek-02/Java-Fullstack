public class Questions {
    public static void main(String[] args) {
        //1. write a java program to claculate area of square whose side is 4.2;
        double side = 4.2;
        double area = side*side;
        System.out.println("Area of square is: " + area);

        //2. write a java program to claculate area of circle whose radius is 5;
        int r = 5;
        double area2 = 3.14*r*r;
        System.out.println("Area of circle is: "+ area2);

        //3. write a java program to claculate area of rectangle whose l = 3.5 and b = 4;
        double l = 3.5;
        int b = 5;
        double area3 = l*b;
        System.out.println("Area of rectangle is: " + area3);


        //4. swap two varibles using 3rd variable
        int num1 = 3;
        int num2 = 5;
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + " " + num2);

        //5. swap two varibles without 3rd variable
        int x = 15;
        int y = 20;
        x = x^y;
        y = y^x;
        x = x^y;
        System.out.println(x + " " + y);

        

        

    }
}


