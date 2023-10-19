package org.example;

import java.io.File;
import java.util.Scanner;

public class Exercisi2 {
    public Exercisi2() { // constructor buit
    }

    public void exercisi2(){
        String ruta = obtindreString("Introduzca la ruta del archivo: ");
        File file = new File(ruta);
        boolean trobat = false;

        if(file.exists()){
            if(file.isDirectory()){
                File [] files = file.listFiles();
                for (int i = 0; i < files.length ; i++) {
                    files[i].deleteOnExit();
                    trobat = true;
                }
            }
        }

        if(trobat){
            System.out.println("S han borrat els arxius");
        }else{
            System.out.println("No s han borrat els arxius");
        }

    }

    public static String obtindreString(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        String text_usuari = sc.nextLine();
        return text_usuari;
    }

}
