package gestionebanca;

import java.util.logging.Level;
import java.util.logging.Logger;

class Conto{
    protected int saldo;

    /**
     * apertura conto con saldo iniziale
     *
     * @param saldo
     */
    public Conto(int saldo)
    {
        this.saldo=saldo;
    }

    /**
     * lettura saldo conto
     *
     * @return saldo
     */
    synchronized int getSaldo()
    {
        return saldo;
    }

    /**
     * deposito di una sommma data
     *
     * @param somma
     */
    synchronized void deposito(int somma){
        saldo+=somma;
        System.out.println(Thread.currentThread() + " Deposito:"+somma+" saldo:"+saldo);
    }

    /**
     * prelievo di una somma data se disponibile
     *
     * @param somma
     */
    synchronized void prelievo(int somma){
        if(saldo>=somma){
            saldo-=somma;
            System.out.println(Thread.currentThread() + " Prelievo:"+somma+" saldo:"+saldo);
        }
    }

}
}
