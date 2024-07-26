package playerMultimediale;

public class Immagine extends ElementoMultimediale {
    // attributi
    private int luminosita;

    // costruttore
    public Immagine(String titolo) {
        super(titolo);
    }

    // metodi
    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    @Override
    public String toString() {
        return "----Immagine-----\n{" +
                "titolo" + getTitolo() +
                "luminosita=" + luminosita +
                '}';
    }

}
