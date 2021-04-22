package models;

/*
* name:  Harman Kaur
* Student Number = 200456178
*/

public abstract class InventoryItem {

    private int quantityInStock, quantitySold;
    private double purchasePrice, sellingPrice;

    public InventoryItem(double purchasePrice, double sellingPrice, int quantityInStock)
    {
        setPurchasePrice(purchasePrice);
        setQuantitySold(quantitySold);
        setSellingPrice(sellingPrice);
        setQuantityInStock(quantityInStock);

    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if(quantityInStock>=0){
            this.quantityInStock =quantityInStock;
        }
        else{
            throw new IllegalArgumentException("set greater than 0");
        }
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        if(quantityInStock>= quantitySold){
            this.quantitySold+= quantitySold;
        }
        else{
            throw new IllegalArgumentException("make the value greater or equal to quantity sold");
        }
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        if (purchasePrice >=0)
        {
            this.purchasePrice = purchasePrice;
        }
        else
        {
            throw new IllegalArgumentException("Enter valid purchase price");
        }

    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        if (sellingPrice > purchasePrice)
        {
            this.sellingPrice = sellingPrice;
        }
        else
        {
            throw new IllegalArgumentException("Enter valid selling price");
        }
    }

    public double getProfit()
    {
         double profit = (sellingPrice - purchasePrice)* quantitySold;
        return profit;
    }
}
