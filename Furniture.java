package com.company;

public class Furniture {
    public String color;
    public String shape;
    public String material;
    public int serialNumber;

    Furniture(String color,String shape,String material,int serialNumber)//constructor
    {
        this.color = color;
        this.shape = shape;
        this.material = material;
        this.serialNumber = serialNumber;

    }

    public void printDetails()
    {
        System.out.println("The furnitures details are as follows :" );

        System.out.println(" Color is :"+ color);
        System.out.println(" Shape is :"+ shape);
        System.out.println(" Material is :"+ material);
        System.out.println(" serialNumber is "+ serialNumber);


    }
}
