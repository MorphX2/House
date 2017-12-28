package com.house;
import java.util.Scanner;

public class HouseIO {
    public static void main(String[] args) {
        double lengthInput;
        double widthInput;
        
        Scanner dataInput = new Scanner(System.in);
        House basic = new House();
        
        System.out.println("Setting the length of the house: ");
        lengthInput = dataInput.nextDouble();
        
        basic.setLength(lengthInput);
      
        System.out.println("Setting the width of the house: ");
        widthInput = dataInput.nextDouble();
        basic.setWidth(widthInput);
        
        System.out.println("The length of the basic house is:" 
                + basic.getLength());
        System.out.println("The width of the basic house is: " + basic.getWidth());
        System.out.println("The area of the basic house is: " + basic.getArea());
    }
    
}
