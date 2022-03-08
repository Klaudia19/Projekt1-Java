package com.company;

import java.util.Scanner; //import scannera


public class Main {

    public static void main(String[] args) {

        System.out.println("Kalkulator pól i obwodów figur \n");
        Scanner scanner = new Scanner(System.in); //pobieranie danych z klawiatury

        while (true) {


            try {
                System.out.println("Wybór figury od 1 do 6:  \n1.Trójkąt \n2.Kwadrat \n3.Koło \n4.Graniastosłup o podstawie trójkąta \n5.Graniastosłup o podstawie kwadratu \n6.Graniastosłup o podstawie koła \n7.Wyjście z programu\n");
                int expression = scanner.nextInt(); //przypisanie do zmiennej expression

                switch (expression) {
                    case 1 -> {
                        System.out.println("Podaj długość pierwszego boku trójkąta a: ");
                        double a = scanner.nextDouble(); //przypisanie wartości
                        System.out.println("Podaj długość drugiego boku trójkąta b: ");
                        double b = scanner.nextDouble();
                        System.out.println("Podaj długość trzeciego boku trójkąta c: ");
                        double c = scanner.nextDouble();
                        Triangle triangle = new Triangle(a, b, c); //tworzenie nowego obiektu
                        triangle.print();
                        System.in.read(); //blokuje zwrot podczas wpisywania znaków wejściowych
                    }
                    case 2 -> {
                        System.out.println("Podaj długość boku kwadratu k: ");
                        double k = scanner.nextDouble();
                        Square square = new Square(k);
                        square.print();
                        System.in.read();

                    }
                    case 3 -> {
                        System.out.println("Podaj długość promienia r: ");
                        double r = scanner.nextDouble();
                        Cricle cricle = new Cricle(r);
                        cricle.print();
                        System.in.read();
                    }
                    case 4 -> {
                        System.out.println("Podaj długość boku podstawy trójkąta a1: ");
                        double a1 = scanner.nextDouble();
                        double type1 = a1;
                        double type2 = a1;
                        double hType = Math.sqrt(3)* a1;
                        System.out.println("Podaj  wysokość graniastosłupa h: ");
                        double h = scanner.nextDouble();
                        //Triangle triangle= new Triangle(a1, h, type1, type2);
                        //Prism prismTriangle = new Prism(a1,h);
                        //System.out.println("Pole graniastosłupa:"+prismTriangle.calculateArea());
                        //System.out.println("Objętość graniastosłupa:"+prismTriangle.calculateVolume());
                        System.in.read();

                    }
                    case 5 -> {
                        System.out.println("Podaj długość boku podstawy kwadratu k1: ");
                        double k1 = scanner.nextDouble();
                        Square square= new Square(k1);
                        System.out.println("Podaj  wysokość graniastosłupa h1: ");
                        double h1 = scanner.nextDouble();

                        Prism prismSquare = new Prism(h1,square);
                        System.out.println("Pole graniastosłupa:"+prismSquare.calculateArea());
                        System.out.println("Objętość graniastosłupa:"+prismSquare.calculateVolume());
                        System.in.read();
                    }

                    case 6 -> {
                        System.out.println("Podaj długość promienia r1: ");
                        double r1 = scanner.nextDouble();
                        Cricle cricle=new Cricle(r1);
                        System.out.println("Podaj  wysokość graniastosłupa h2: ");
                        double h2 = scanner.nextDouble();
                        Prism prismCircle = new Prism(h2, cricle);
                        System.out.println("Pole graniastosłupa:"+prismCircle.calculateArea());
                        System.out.println("Objętość graniastosłupa:"+prismCircle.calculateVolume());
                        System.in.read();
                    }
                    default -> {
                    }
                }
                if(expression==7)
                {
                    break;
                }
            }
            catch(Exception e) {
                System.out.println("Błędne dane wejścia! \n");
                scanner.nextLine();
            }
                }
            }
        }



