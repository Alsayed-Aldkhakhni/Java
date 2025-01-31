/*
 * File name: Invoice.java
 *
 * Subject: A class that presents invoice items.
 *
 * Date: March 13, 2024
 *
 * Author: Alsayed-Aldkhakhni
 *
 * Last modification: August 6, 2024 --> [5:26 AM]
 *
 * */


public class Invoice // class declaration.
{
    // instance variables.
    private String partNum; // the number of the part.
    private double price;   // its price. 
    private int quantity;   // how many of it.
    private String descrip; // what it is.
    
    // 4-arguments constructore.
    public Invoice(String num, double price, int quantity, String descrip)
    {
        partNum = num;
        if(price > 0.0) this.price = price;
        if(quantity > 0) this.quantity = quantity;
        this.descrip = descrip;
    }
    
    // getters, accessors.
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getPartNum() { return partNum; }
    public String getDescription() { return descrip;}
    public double getInvoiceAmount() { return price * quantity; }
    
    // print the data sotred in the invoice.
    public void printData()
    {
        System.out.printf("Part#:       %s%nPrice:       $%,.2f%nQuantity:    %d%nTotal price: $%,.2f%nDescription: %s%n%n",
                           partNum, price, quantity, getInvoiceAmount(), descrip);
    }
    
    // setters, mutators.
    public void setPrice(double amount) { if(amount > 0.0) price = amount; }
    public void setDescription(String desc) { descrip = desc; }
    public void setPartNum(String num) { partNum = num; }
    public void setQuantity(int quantity) { if(quantity > 0) this.quantity = quantity; }
}
