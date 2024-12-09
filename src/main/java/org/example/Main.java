package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException { // treure la ruta d abans del arxiu

        Exercisi1 exercisi1 = new Exercisi1();
        Exercisi2 exercisi2 = new Exercisi2();

        System.out.println("1: Exercisi 1");
        System.out.println("2: Exercisi 2");
        int option = obtindreInt("Que vols fer? ");

        switch (option){
            case 1:
                exercisi1.exercisi1();
                break;
            case 2:
                exercisi2.exercisi2();
                break;
            default:
                System.out.println("No has introduit un numero valid");
        }


    }
    public static int obtindreInt(String text) {
        boolean TipusCorrecte;
        Scanner sc = new Scanner(System.in);
        int num_usuari = 0;

        do {
            System.out.print(text);
            TipusCorrecte = sc.hasNextInt();
            if (!TipusCorrecte) {
                sc.nextLine();
                System.out.println("Error: Valor no válido");
            } else {
                num_usuari = sc.nextInt();
            }
        } while (!TipusCorrecte);

        return num_usuari;
    }

}