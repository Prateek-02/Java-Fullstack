public class BikeDriver {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.name = "BMW R10";
        b1.price = 200000;

        System.out.println("-------------------------------------------");
        
        System.out.println(b1.name);
        System.out.println(b1.price);

        System.out.println("-------------------------------------------");

        Bike b2 = new Bike();
        b2.name = "Yamaha R15";
        b2.price = 150000;
        System.out.println(b2.name);
        System.out.println(b2.price);
    }
}
