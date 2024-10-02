package it.ciardi;

public class Deposito extends Thread{
    
    Cestino c;
    int cA;

    public Deposito(Cestino c, int coinAmount) {
        this.c = c;
        cA = coinAmount;
    }

    public void run(){
        for (int i = 0; i < cA; i++) {
            c.aggiungiMoneta();;
        }
    }
}
