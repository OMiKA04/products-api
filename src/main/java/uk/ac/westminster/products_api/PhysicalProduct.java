package uk.ac.westminster.products_api;

//A PhysicalProduct IS-A Product because Product is the parent class and PhysicalProduct is the child class.
//A ShoppingCart is NOT a Product because it represents a container holding multiple products, not a product itself.

public class PhysicalProduct extends Product{
    private double weightKg;
    private String dimension;

    public PhysicalProduct(){}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimension){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimension = dimension;
    }

    public double getWeightKg(){
        return this.weightKg;
    }
    public String getDimension(){
        return this.dimension;
    }
}
