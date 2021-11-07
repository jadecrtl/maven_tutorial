package utils;

import java.util.Random;

public class De {
    
    public int nbrFaces;
    private int valeurDe;

    public De (int nbrFaces) {
        if (nbrFaces <= 0) {
            System.out.println("Pas de dé sans faces!");
        }
        this.nbrFaces = nbrFaces;
        this.lanceDe();
    }

    public int getValeurDe() {
        return this.valeurDe;
    }

    public void lanceDe() {
        Random r = new Random();
        this.valeurDe = 1 + r.nextInt(nbrFaces);
    }


}
