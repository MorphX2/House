/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.house;

import javax.swing.JOptionPane;

/**
 *
 * @author jamaalcrichfield
 */
public class RoomAreas {
    public static void main(String[] args) {
        double number; // To hold a number
        double totalArea;
        String input;
        
        // Create three Rectangle objects.
        House kitchen = new House();
        House bedroom = new House();
        House den = new House();
        
        // Get and store the dimensions of the kitchen.
        input = JOptionPane.showInputDialog("What is the " +  
                "kitchen's length?");
        
        number = Double.parseDouble(input);
        kitchen.setLength(number);
        input = JOptionPane.showInputDialog("What is the " + 
                "kitchen's width?");
        
        number = Double.parseDouble(input);
        bedroom.setWidth(number);
        
        // Get and store the dimensions of the den.
        input = JOptionPane.showInputDialog("What is the " + "den's length?");
        
        number = Double.parseDouble(input);
        den.setLength(number);
        
        input = JOptionPane.showInputDialog("What is the " + "den's width?");
        
        number = Double.parseDouble(input);
        den.setWidth(number);
        
        // Calculate the total areas of the room.
        totalArea = kitchen.getArea() * bedroom.getArea() + den.getArea();
        
        // Display the total area of the room.
        JOptionPane.showMessageDialog(null, "The total area " + "of the rooms is " 
                + totalArea);
        
        System.exit(0);
    }
    
}
