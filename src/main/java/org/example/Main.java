package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException { // treure la ruta d abans del arxiu

        int option = 0; // si no no la deixe utilitzar al while
        String ruta = obtindreString("Introduzca la ruta del archivo: ");
        File file = new File(ruta);
        File newFile = null;
//        ArrayList<String> carpetes = new ArrayList<>();

//        if (!file.exists()) {
//            System.out.println("El sistema no puede encontrar la ruta especificada.");
//            file = new File(obtindreString("Introduzca la ruta del archivo: "));
//        }else if (file.isFile()){
//            String[] separador = file.getName().split("\\."); // separe per punts el nom del arxiu per lo que separe la extensio del nom del arxiu
//            String nouNom = file.getName();
//            separador[0] = nouNom;
//            file.renameTo(new File(separador[0])); // fem el rename del nom arxiu a la primera posicio del array de strings, que es el nom sense la extensio
//            System.out.println("El nuevo nombre del archivo es : " + separador[0]);
//        }else{
//            System.out.println("Es una carpeta");
//        }

        if(file.exists()) { // treu l' ultim arxiu/carpeta de la ruta
            String[] novaRuta = ruta.split("\\\\"); // separe per \
//            for (int i = 0; i < novaRuta.length; i++) {
//                carpetes.add(novaRuta[i]);
////                if (i == (novaRuta.length - 1)) {
////                    carpetes.remove(i);
////                }
////                ruta += carpetes.get(i);
////                if (i == (novaRuta.length - 1)) { // per a que ho fagui al acabar
////                    System.out.println(ruta);
////                    ruta = (novaRuta[novaRuta.length - 1]); // treu la posicio de les subcarpetes depenent del length - x
////                    ruta.replace(novaRuta[novaRuta.length - 1],"");
////                }
//            }
            novaRuta[novaRuta.length-1] = "";
//            for (int i = 0; i < carpetes.size(); i++) {
//                if (i > novaRuta.length - 1) {
//                    novaRuta[i] = carpetes.get(i-1);
//                }
//            }

//            System.out.println(ruta);
//            System.out.println(Arrays.toString(novaRuta));

        }else{
            System.out.println("La ruta no existeix");
        }

    }

    public static String obtindreString(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        String text_usuari = sc.nextLine();
        return text_usuari;
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