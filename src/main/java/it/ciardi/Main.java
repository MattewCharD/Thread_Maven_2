package it.ciardi;

public class Main {
    public static void main(String[] args) throws InterruptedException {
     
        Cestino c1 = new Cestino(0);
        Deposito d1 = new Deposito(c1, 1000);
        Deposito d2 = new Deposito(c1, 1000);
        d1.start();
        d2.start();
        d1.join();
        d2.join();
        System.out.println("Conto finale: " + c1.getValore());

        // Si crea una sezione critica = piu thread vogliono accedere alla solita risorsa
    }
}