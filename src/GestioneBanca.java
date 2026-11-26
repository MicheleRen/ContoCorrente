package gestionebanca;

public class GestioneBanca{
    public static void main(String args[]){
        System.out.println(" [0] Apertura banca");
        gestionebanca.Conto contoComune = new gestionebanca.Conto(50);
        gestionebanca.Cliente c1 = new gestionebanca.Cliente(contoComune);
        gestionebanca.Cliente c2 = new gestionebanca.Cliente(contoComune);
        c1.start();
        c2.start();
        try{
            Thread.sleep(1500);
        }
        catch(InterruptedException e){
            System.err.println("[0] Errore nello sleep!");
        }
        System.out.println(" [0] Chiusura banca");
    }
}

