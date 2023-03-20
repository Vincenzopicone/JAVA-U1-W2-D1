package Esercizio1e2;

import java.util.Random;

public class Esercizio1 {
    static int [] numeriCasuali = new int[5];



    public static void creaNumeriCasuali () {
        for (int i = 0; i < numeriCasuali.length; i++) {
            Random random = new Random();
            int number = random.nextInt(11);
            if(number != 0) {
                numeriCasuali[i] = number;
                System.out.print(numeriCasuali[i] + ",");
            } else {
                creaNumeriCasuali();
            }

        }
        System.out.println("");

    }

    public static void inserisciNumeri () {
        if (numeriCasuali.length < 6) {
            System.out.println("Scegli la posizione dentro l'array da 1 a 5!");
            int pos = Main.scanner.nextInt();
            System.out.println("Scegli il numero da 1 a 10! Premi 0 per uscire!");
            int numberNew = Main.scanner.nextInt();
            if (numberNew > 0 && numberNew < 11) {
                numeriCasuali[pos] = numberNew;
                for (int i = 0; i < numeriCasuali.length; i++) {
                    System.out.print(numeriCasuali[i] + ",");
                }
                inserisciNumeri();
            } else if (numberNew > 10) {
                System.out.println("Non puoi caricare questo numero");
                inserisciNumeri();
            } else if (numberNew == 0) {
                System.out.println("Sei uscito dal programma");
                System.exit(numberNew);
            }
        } else {
            System.out.println("Array pieno");
        }

    }

}
