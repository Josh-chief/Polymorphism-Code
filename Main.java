package com.company;

public class Main {

    public static void main(String[] args) {


        Chair chairOne = new Chair("white", "circular", "MDF", 2220, "relaxationChair", 4);
        chairOne.printDetails();
        chairOne.printDetails("Ikea");

        Table tableOne = new Table ("white", "circular", "MDF", 5585,"six");
        tableOne.printDetails();






    }


}

