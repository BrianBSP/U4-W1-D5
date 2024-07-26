package playerMultimediale;

import interfaces.Guardabile;
import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile, Guardabile {
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

    // getter che mi possono servire
    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    //overrides
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

    @Override
    public void show() {
        System.out.println(getTitolo());
    }
}
