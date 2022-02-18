/**
 * A program that manages cellphones that are in inventory.
 */
public class CellPhone {

    // fields
    private String manufact;
    private String model; 
    private double retailPrice;

    /**
     * No-Arg Constructor
     */
    public CellPhone() {
        this.manufact = null;
        this.model = null;
        this.retailPrice = 0.0;
    }

    /**
     * Constructor
     * @param manufact The phone’s manufacturer to be assigned to the manufact field.
     * @param model phone’s model number to be assigned to the model field.
     */
    public CellPhone(String manufact, String model) {
        this.manufact = manufact;
        this.model = model;
    }

    /**
     *  The getManufact method returns the name phone’s manufacturer.
     * @return The value stored in manufact field.
     */
    public String getManufact() {
        return manufact;
    }

    /**
     * The setManufact method changes the value of the manufact field after the
     * object has been created, if necessary.
     * @param manufact The name of the phone’s manufacturer.
     */
    public void setManufact(String manufact) {
        this.manufact = manufact;
    }
    
    /**
     * The getModel method returns the phone's model number.
     * @return The phones model number.
     */
    public String getModel() {
        return model;
    }

    /**
     * The setModel method changes the value of the model field after the 
     * object has been created, if necessary.
     * @param model The model number of the phone.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The getRetailPrice method returns the phone’s retail price.
     * @return The retail Price stored in the retailPrice field.
     */
    public double getRetailPrice() {
        return retailPrice;
    }

    /**
     * The setRetailPrice method changes the value of the retailPrice field 
     * after the object has been created, if necessary.
     * @param retailPrice The price of the phone.
     */
    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
}
