package models;
/*
 * name:  Harman Kaur
 * Student Number = 200456178
 */
import java.util.ArrayList;

public class SportStore {
    private String address;
    private ArrayList<InventoryItem> inventory;

    public SportStore(String address, ArrayList<InventoryItem> inventory) {
        setAddress(address);
        this.inventory = inventory;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        //remove the white spaces
        address = address.trim();
        if (address.length()>=5)
            this.address = address;
        else
            throw new IllegalArgumentException("address must be greater than 5");

    }

    public ArrayList<InventoryItem> getInventory() {
        return inventory;
    }

    public void sellItem(InventoryItem item, int quantitySold)
    {
        item.setQuantitySold(quantitySold);
    }

    public double calculateProfit()
    {
        double profit=0;
        ArrayList<InventoryItem> list = getInventory();

        for(int i=0;i<list.size();i++){
            profit += list.get(i).getProfit();
        }

        return profit;
    }
}
