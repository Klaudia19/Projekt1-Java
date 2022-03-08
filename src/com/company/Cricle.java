package com.company;

public class Cricle extends Figure implements Printable { // dziedziczące po klasie Figure i implementujące interfejs Printable

    public double radius;

    public Cricle(double r) throws Exception {  //konstruktor, zgłaszanie wyjątku

        this.radius=r; //inicjowanie wartość zmiennej klasy

        if(r<=0)
        {
            throw new Exception("Dlugosc promienia musi byc wieksza od zera!");
        }
    }

    @Override
    double calculateArea() {

        float PI = 3.14f;
        return PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {

        return 2 * Math.PI * radius; //Math klasa operacji matematycznych
    }

    @Override
    public void print() { //wypisanie na ekran

        System.out.println("Obwód koła wynosi: " +calculatePerimeter());
        System.out.println("Pole koła wynosi: " +calculateArea());
    }
}
