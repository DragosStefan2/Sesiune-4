package Teme;

import java.util.Scanner;

public class Tema10 {
    public static void main(String[] args) {
        /**parcurgem un for care are indexul de la 1 la 1000. Daca indexul=10 afisam un mesaj, daca indexul=100 afisam un al doilea mesaj, daca  indexul este 900 afisam un al treilea mesaj.*/
        for(int i=1; i<=1000; i++){
            if(i==10){
                System.out.println("i este " +i);
            }else if(i==100){
                System.out.println("i este "+i);
            }else if(i==900){
                System.out.println("i este "+i);
            }
            }

        /**rezolvam exercitiul de mai sus cu while si do while in loc de for.*/
        int i=100;
        while(i==10){
            System.out.println("i este 10");
        }
        while(i==100){
            System.out.println("i este 100");
        }
        while(i==900){
            System.out.println("i este 900");
        }
        do {
            System.out.println("i este 10");

        } while (i == 10);
        do {
            System.out.println("i este 100");
        } while (i==100);
        do{
            System.out.println("i este 900");
        } while(i==900);
        /**folosind un switch verificam daca variabila primita de la utilizator este mai mare decat 100. Daca este adevarat afisam un mesaj.*/
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number: ");
        int d= scanner.nextInt();
        switch (d) {
            case 1:
                System.out.println("Valoarea este 1.");
                break;
            case 2:
                System.out.println("Valoarea este 2.");
                break;
            default:
                if (d > 100) {
                    System.out.println("Valoarea este mai mare decât 100.");
                } else {
                    System.out.println("Valoarea este mai mică sau egală cu 100.");
                }
                break;
        }
        /**Ce este o clasa?*/
        /** Clasa este o structură fundamentală a programării orientate pe obiecte (OOP), de asemenea putem definii variabile, metode si constructori.*/
        /**Ce inseamna o metoda/proprietate/ un constructor?*/
        /** Metoda sunt functii definite in clasa care definesc comportamentul obiectelor. Proprietatea este o caracterista a obiectului. Un constructor este o metoda specifica in care se pot initializa obiecte cu ajutorul cuvantul cheie "new".*/
        }
    }

