package Esercizio3;

import Esercizio1e2.Main;

public class Banca {
    public static ContoCorrente creaNuovoConto() throws Exception, BancaException {
        System.out.println("Inserire il nominativo");
        String nome = Main.scanner.next();
        System.out.println("Inserire il saldo");
        double saldo = Main.scanner.nextInt();
        ContoCorrente c = null;
        try {
            c = new ContoCorrente(nome, saldo);
            c.preleva(1750.5);
            System.out.println("Saldo conto: " + c.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        } catch (Exception e) {
            try {
                throw new Exception("Creazione prodotto fallita");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        return c;
    }
    public static ContoOnLine creaNuovoContoOnLine() throws Exception {
        System.out.println("Inserire il nominativo");
        String nomeOnLine = Main.scanner.next();
        System.out.println("Inserire il saldo");
        double saldoOnline = Main.scanner.nextInt();
        System.out.println("Inserire il maxPrelievo");
        double maxPrelievo = Main.scanner.nextInt();
        ContoOnLine cLine = null;
        try {
            cLine = new ContoOnLine(nomeOnLine, saldoOnline, maxPrelievo);
            cLine.preleva(2000);
            cLine.stampaSaldo();
        } catch (BancaException e) {
            System.out.println("Errore durante il prelievo: " + e);
            e.printStackTrace();
        }
        return cLine;
    }


    public static void main (String args[]) throws Exception {
        creaNuovoConto();
        creaNuovoContoOnLine();

    }
}

