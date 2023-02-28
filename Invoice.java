package chapter10;

public class Invoice implements Payable{

    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    //konstruktori
    public Invoice(String pn, String pd, int q, double ppi) {
        if(q < 0)
        throw new IllegalArgumentException("Quantity duhet >0");

        if(ppi < 0.0)
        throw new IllegalArgumentException("ppi duhet > 0");

        partNumber = pn;
        partDescription = pd;
        quantity = q;
        pricePerItem = ppi;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int q) {
        if(q < 0)
        throw new IllegalArgumentException("quantity < 0");
    }

    public int getQuantity() {
        return quantity;
    }


    public void setPricePerItem(double ppi) {

        if(ppi < 0.0)
        throw new IllegalArgumentException("ppi > 0");

        pricePerItem = ppi;
    }

    public double getPricePerItem(){
        return pricePerItem;
    }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
        "invoice", "part number", getPartNumber(), getPartDescription(),
        "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem(); //kostoja totale
    }

    
}
