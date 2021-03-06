
package proj3;

/**
 * Creates objects of all the parts that will be within warehouses
 * @author Josh
 */
public class BikePart {
    String partName;
    int partNumber;
    double price;
    double salesPrice;
    boolean onSale;
    int quantity;
    /**
     * Constructor for object of all the parts that will be within warehouses. 
     * @param partName describes the part name
     * @param partNumber denotes the part number in database
     * @param price is the actual price
     * @param salesPrice is the price sold to customer
     * @param onSale whether or not it is on sale
     * @param quantity amount in warehouse
     */
    
    public BikePart(String partName,int partNumber,double price,double salesPrice,boolean onSale, int quantity){  
        this.partName = partName;
        this.partNumber = partNumber;
        this.price = price;
        this.salesPrice = salesPrice;
        this.onSale = onSale;
        this.quantity = quantity;
    }
    /**
     * returns arguments
     * @return returns all values of the BikePart with spaces in the form of a string
     */
    @Override
    public String toString(){
        //return "PartName: " + partName +" "+ "PartNum: " + partNumber+" "+ "Price: " + price +" "+ "SalesPrice: " + salesPrice+" "+ "On sale? " +onSale + " Quantity: "+ quantity;
        return partName + "," + partNumber+ "," + price +","+ salesPrice+"," +onSale +","+quantity;
    }
    /**
     * returns price
     * @return returns double price
     */
    public double getPrice(){
            return price;
    }
    /**
     * @return returns double sales price 
     */
    public double getSale(){
        return salesPrice;
    }
    /**
     * @return returns String part name 
     */
    public String getName(){
            return partName;
    }
    /**
     * @return returns int part number 
     */
    public int getNumber(){
        return partNumber;
    }
    /**
     * @return returns int quantity
     */
    public int getQuantity(){
        return quantity;
    }
    /**
     * Setter for double price.
     * @param price
     * @return returns double price after it has been set
     */
    public double setPrice(double price){
        this.price = price;
        return price;
    }
    /**
     * 
     * @param salesPrice
     * @return double salesPrice after it has been set.
     */
    public double setSalesPrice(double salesPrice){
        this.salesPrice = salesPrice;
        return salesPrice;
    }
    /**
     * 
     * @param onSale
     * @return boolean onSale after it has been set.
     */
    public boolean setonSale(boolean onSale){
        this.onSale = onSale;
        return onSale;
    }
    /**
     * Getter for boolean onSale.
     * @return returns boolean onSale.
     */
    public boolean getonSale(){
        return onSale;
    }
    /**
     * Setter for quantity.
     * @param quantity
     * @return returns int quantity after it has been set.
     */
    public int setQuantity(int quantity){
        this.quantity = quantity;
        return quantity;
    }
}
