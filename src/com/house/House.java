package com.house;
import java.util.*;

public class House {
    private double length;
    private double width;
    
    public void setLength (double len) {
        length = len;
    }
    public void setWidth (double wide) {
        width = wide;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getArea () {  
        return length * width;
    }
}
