package com.company;
import java.lang.Math;

public class Prism {

    public double height;
    public Figure type; //zmienna typu

    public Prism(double h, Figure t) {
       height=h;
        type=t;
    }

    public double calculateArea()
    {
        return 2*type.calculateArea() + (type.calculatePerimeter() * height); //type.calculatePerimeter() - obwód
    }

    public double calculateVolume() {
        return type.calculateArea() * height;
    }


}
