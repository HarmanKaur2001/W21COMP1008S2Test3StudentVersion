package models;
/*
 * name:  Harman Kaur
 * Student Number = 200456178
 */
import Utilities.DBUtility;

import java.util.List;

public class TennisRacquet extends InventoryItem  {
    private double weight;  //240-310
    private String headSize; //midsize, midplus, oversize, super oversize
    private String brand; //Head, Babolat, Dunlop, Yonex
    private String model;



    public TennisRacquet(String brand, String model, double weight, String headSize, double purchasePrice, double sellingPrice, int quantityInStock) {
        super(purchasePrice, sellingPrice, quantityInStock);
        setWeight(weight);
        setBrand(brand);
        setHeadSize(headSize);
        setModel(model);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
    }

    public String getHeadSize() {
        return headSize;
    }

    public void setHeadSize(String headSize) {
        String lowerCase = headSize.toLowerCase();
        List<String> headSizes = DBUtility.getTennisRacquetHeadSizes();
        if (headSizes.contains(lowerCase))
        {
            this.headSize = headSize;
        }
        else
        {
            throw new IllegalArgumentException("Enter valid type of head size");
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {


        List<String> brands = DBUtility.tennisEquipmentBrands();
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
        List<String> models = DBUtility.tennisRacquetModelsByBrand(brand);
        if (models.contains(model))
        {
            this.model = model;
        }
        else
        {
            throw new IllegalArgumentException("enter valid type of model");
        }
    }

}
