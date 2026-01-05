public class Bike {
    // default constructor is created by the compiler only if no constructor is written explicitly and it initialize the data members with default value
    String name;
    double price;

    public void race(){
        System.out.println("1000 horse power bike");
    }

    //multiline non static initializer, it cannot be called inpplicitly if we don't create object reference
    {
        System.out.println("BMW");  
    }
}


// sequence of execution:- Main() -> Object Creation -> MultiLine static initializer -> MultiLine Non-static initializer -> Constructor -> method calls
                           
