package playerMultimediale;

import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile {
    //attributi
    private int durata;
    private int volume;
    private int luminosita;

    //costruttori
    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    // metodi
    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        volume--;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    @Override
    public void esegui() {
        play();
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume) + " " + "*".repeat(luminosita));
        }
    }

    @Override
    public String toString() {
        return "----Video: ----\n{" +
                "titolo= " + getTitolo() +
                "\ndurata= " + durata +
                ", \nvolume= " + volume +
                ", \nluminosita= " + luminosita +
                '}';
    }
}
