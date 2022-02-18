public class RectangleTester {
    public static void main(String[] args) {

        // create a Rectangle object
        Rectangle box1 = new Rectangle();

        // set the length and with of box1 object
        box1.setLength( 10.0 );
        box1.setWidth( 20.0 );

        // display the area of box1 object
        System.out.println( 
            "\nLength: " + box1.getLength() +
            "\nWidth: " + box1.getWidth() + 
            "\nArea: " + box1.getArea() 
        );
    }
}
