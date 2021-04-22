package models;
/*
 * name:  Harman Kaur
 * Student Number = 200456178
 */
import Utilities.DBUtility;

import java.util.List;

public class Skis extends InventoryItem{
    private String brand, model;
    private int length;

    public Skis(String brand, String model, int length,double purchasePrice, double sellingPrice, int quantityInStock) {
        super(purchasePrice, sellingPrice, quantityInStock);
        setBrand(brand);
        setModel(model);
        setLength(length);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        List<String> brands = DBUtility.getSkiBrands();
        if (brands.contains(brand))
        {
            this.brand = brand;
        }
        else
        {
            throw new IllegalArgumentException("enter valid type of brand");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        List<String> models = DBUtility.getSkiModelByBrand(brand);
        if (models.contains(model))
        {
            this.model = model;
        }
        else
        {
            throw new IllegalArgumentException("enter valid type of model");
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= 60 && length <= 220){
            this.length = length;
        }
        else{
            throw new IllegalStateException("please insert between 60 to 220");
        }
    }
}
