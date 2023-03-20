package Esercizio3;

public class ContoCorrente  {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    ContoCorrente(String titolare, double saldo) throws Exception, BancaException {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x) throws Exception {
        nMovimenti++;
        if (x > saldo) {
            throw new BancaException("Il conto è in rosso");

        }
        if (nMovimenti < maxMovimenti)
            saldo = saldo - x;
        else
            saldo = saldo - x - 0.50;
        nMovimenti++;
    }

    double restituisciSaldo() {
        return saldo;
    }
}
