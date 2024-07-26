package playerMultimediale;

import interfaces.Guardabile;

public class Immagine extends ElementoMultimediale implements Guardabile {
    // attributi
    private int luminosita;

    // costruttore
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    // metodi
    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    // overrides
    @Override
    public void esegui() {
        show();
    }

    @Override
    public String toString() {
        return "----Immagine: -----\n{" +
                "titolo= " + getTitolo() +
                "\nluminosita= " + luminosita +
                '}';
    }

    @Override
    public void show() {
        System.out.println(getTitolo() + " " + "*".repeat(luminosita));
    }
}
