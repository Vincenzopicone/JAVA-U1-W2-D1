package Esercizio3;

public class ContoOnLine  extends ContoCorrente{
    double maxPrelievo;

    ContoOnLine(String titolare, double saldo, double maxP) throws Exception, BancaException  {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    void stampaSaldo() {

        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    void preleva(double x) throws Exception {
        if (x > maxPrelievo) {
            throw new BancaException("il prelievo non è disponibile");
        }
        if (x <= maxPrelievo) {
            super.preleva(x);
        }
    }
}
