package playerMultimediale;

import interfaces.Riproducibile;

public class Audio extends ElementoMultimediale implements Riproducibile {
    // attributi
    private int durata;
    private int volume;

    // costruttori
    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;

    }

    // metodi
    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        volume--;
    }

    // getter
    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    // overrides
    @Override
    public void esegui() {
        play();
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume));
        }
    }

    @Override
    public String toString() {
        return "----Audio: ----\n{" +
                "titolo= " + getTitolo() +
                "\ndurata= " + durata +
                ", \nvolume= " + volume +
                '}';
    }
}
