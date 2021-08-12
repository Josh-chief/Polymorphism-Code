package com.company;

public class Chair extends Furniture
{
    private String type;
    private int noOflegs;
   // private String Ikea;


    Chair(String color,String shape,String material,int serialNumber ,String type ,int noOflegs) //Constructor
    {
        super(color,shape,material,serialNumber);
        this.type = type;
        this.noOflegs = noOflegs;


    }


    public void printDetails()//Overiding occurs in methods of different classes(Parent n child class)
    {
        System.out.println("The Chair details are as follows :" );

        System.out.println(" Color is :"+ color);
        System.out.println(" Shape is :"+ shape);
        System.out.println(" Material is :"+ material);
        System.out.println(" serialNumber is "+ serialNumber);

        System.out.println(" Type is a:"+ type );
        System.out.println(" Its has this no of legs : "+ noOflegs);
    }
    public void printDetails(String brand)//Overloading the function
    {

        System.out.println("The brand is "+ brand);

    }


}
