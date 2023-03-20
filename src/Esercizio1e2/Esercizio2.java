package Esercizio1e2;

public class Esercizio2 {
     public static void consumoCarburante(double km, double lt) throws Exception {
        if (km == 0) {
            throw new Exception("Non puoi inserire il valore dei km a 0");
        }
        if (lt == 0) {
            throw new Exception("Non puoi inserire il valore del litri a 0");
        }
        double risultato = km / lt;
        System.out.println(risultato + "" +"km/l");

    }

}
