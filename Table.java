package com.company;

public class Table extends Furniture
{
    private String noOfseats;

    Table(String color,String shape,String material,int serialNumber ,String noOfseats )
    {
        super(color,shape,material,serialNumber);

        this.noOfseats = noOfseats;
    }
    public void printDetails()// method overridding
    {
        System.out.println("The Table details are as follows :" );

        System.out.println(" Color is :"+ color);
        System.out.println(" Shape is :"+ shape);
        System.out.println(" Material is :"+ material);
        System.out.println(" serialNumber is "+ serialNumber);


        System.out.println( " Has no of seats :"+ noOfseats);
    }

}
