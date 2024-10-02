package it.ciardi;

public class Cestino {
    int valore;

    public Cestino(int i){
        valore = i;
    }
    
    public int getValore() {
        return valore;
    } 

    synchronized public void aggiungiMoneta(){
        valore+=1;
    }

}
