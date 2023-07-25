package qa;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle ("circle1", "red", 0,0, 10);

        System.out.println("Circle location before move: " + c.getCurrentLocation());
        c.move(10.5, 4.3);
        System.out.println(("Circle location after move: " + c.getCurrentLocation()));
        System.out.println();
        

        Circle c2 = new Circle ("circle2", "blue", 10,10, 5);



        Rectangle r1 = new Rectangle("Alex" , "red", 2, 10, 10 , 10 );
        Rectangle r2 = new Rectangle( "Void" , "none" , 0 , 0 , 0 , 0);

        Circle c11 = new Circle( "Ballie" , "yellow",  10,10, 5);

        System.out.println(c11);
        System.out.println();

        System.out.println("The area and the centre point are: " + c11.getCentrePoint() + " and " + c11.getArea() );
        System.out.println();

        System.out.println(r1);
        System.out.println(r2);
        System.out.println();

        System.out.println("Area of r1 = " + r1.getArea());
        System.out.println("Area of r2 = " + r2.getArea());
        System.out.println();


        System.out.println("Centre point of r1 is = " + r1.getCentrePoint());
        System.out.println("Centre point of r2 is = " + r2.getCentrePoint());
        System.out.println();



    }
}
