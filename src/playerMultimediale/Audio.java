package playerMultimediale;

public class Audio extends ElementoMultimediale implements Riproducibile {

    //attributi


    // costruttori
    public Audio(String titolo) {
        super(titolo);
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }

    @Override
    public void play() {

    }
}
