package javaapplication4;

import java.util.Scanner;

public class llista_persones {

    public static void main(String args[]) {

        Scanner lector = new Scanner(System.in);
        boolean b = false;
        int u;
        
        while (b) {

            System.out.println("****************");
            System.out.println("***** MENÚ *****");
            System.out.println("****************");

            System.out.println("");

            System.out.println("OPCIÓ 1: Donar alta persones per teclat.");
            System.out.println("OPCIÓ 2: Esborrar una llista de la llista.");
            System.out.println("OPCIÓ 3: Visualitzar el contingut.");
            System.out.println("OPCIÓ 4: Sortir del programa");

            System.out.println("");

            System.out.println("Tria que és el que vols fer:");
            u = lector.nextInt();
        
            if (u >= 0 && u <= 4) {
                 
                       
                
            } else {
                System.out.println("Aquest nombre no és una opció.");
            }
        }
    }
}
