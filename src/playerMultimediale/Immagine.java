package playerMultimediale;

public class Immagine extends ElementoMultimediale {
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

    public void show() {
        System.out.println(getTitolo() + " " + "*".repeat(luminosita));
    }

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
}
