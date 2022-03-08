package com.company;

public class Square extends Figure implements Printable {

    public double sideLength;

    public Square(double sL) throws Exception {

        this.sideLength = sL;
            if(sL<=0)
            {
                throw new Exception("Dlugosc boku musi byc wieksza od zera!");

            }
        }

    @Override
    double calculatePerimeter() {

        perimeter=  4 * sideLength;
        return perimeter;
    }

    @Override
    double calculateArea() {

        area = sideLength * sideLength;
        return area;
    }

    @Override
    public void print() {

        System.out.println("Obwód kwadratu wynosi: " +calculatePerimeter());
        System.out.println("Pole kwadratu wynosi: " +calculateArea());
    }
}
