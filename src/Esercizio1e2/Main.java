package Esercizio1e2;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static  Esercizio2 calcolaCarburante () throws Exception{
        System.out.println("Inserisci i KM");
        double km = scanner.nextDouble();
        System.out.println("Inserisci i Litri");
        double lt = scanner.nextDouble();
        Esercizio2 c;
        try {
            c = new Esercizio2();
            c.consumoCarburante(km,lt);
            System.out.println("Calcolo effettuato!");
        } catch (Exception e) {
            throw e;
        }
        return c;
    }
    public static void main(String[] args) throws Exception {

        //// ESERCIZIO 1
       /// Esercizio1e2.Esercizio1.creaNumeriCasuali();
       /// Esercizio1e2.Esercizio1.inserisciNumeri();

        //// ESERCIZIO 2

        calcolaCarburante();

        /// ESERCIZIO 3








    }
}
