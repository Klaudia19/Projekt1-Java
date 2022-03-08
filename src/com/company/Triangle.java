package com.company;

public class Triangle extends Figure implements Printable {

    public double sideLengthA;
    public double sideLengthB;
    public double sideLengthC;

    public Triangle (double A, double B, double C) throws Exception {  //konstruktor

        this.sideLengthA=A;
        this.sideLengthB=B;
        this.sideLengthC=C;


            if(A<B+C ^ B<A+C ^ C<A+B)
            {
                System.out.println("Można zbudować trójkąt o takich bokach ");
            }
            else
                throw new Exception("Nie można zbudować trójkąta o takich bokach");

    }
    @Override
    double calculateArea() {

        double p = (sideLengthA + sideLengthB + sideLengthC) / 2; // pole trójkąta
        return  Math.sqrt( p*(p-sideLengthA)*(p-sideLengthB)*(p-sideLengthC) ); // wzór Herona
    }

    @Override
    double calculatePerimeter() {


        return sideLengthA + sideLengthB + sideLengthC;
    }

    @Override
    public void print() {

        System.out.println("Obwód trójkąta wynosi: " +calculatePerimeter());
        System.out.println("Pole trójkąta wynosi: " +calculateArea());

    }
}
