public class Rectangle {

    // fields
    private double length;
    private double width;
    private String name;

    /**
     * No-Arg Constructor
     */
    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
        this.name = null;
    }

    /**
     * Constructor
     * @param name The name to be stored in the name field.
     */
    public Rectangle(String name){
        this.name = name;
    }

    /**
     * The getLength method returns a rectangle object's length.
     * @return The value stored in the length field.
     */
    public double getLength() {
        return length;
    }

    /**
     * The setLength method stores a value in the length field.
     * @param length The value to be stored.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * The getWidth method returns a rectangle object's width.
     * @return The value stored in the width field.
     */
    public double getWidth() {
        return width;
    }

    /**
     * The setWidth method stores a value in the width field.
     * @param width The value to be stored.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * The setName method stores a name in the name field.
     * @param name The name to be stored.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * The getName method returns a rectangle object's name.
     * @return The name stored in the name field.
     */
    public String getName(){
        return this.name;
    }

    /**
     *  The getArea methods returns a rectangle object's area.
     * @return The area of of an object.
     */
    public double getArea(){
        double area = this.length * this.width;
        return area;
    }
    
}
