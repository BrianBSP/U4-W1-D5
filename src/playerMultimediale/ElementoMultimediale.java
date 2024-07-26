package playerMultimediale;

public abstract class ElementoMultimediale {
    //attributi
    private String titolo;


    // costruttore
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    // metodi
    // getter & setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    // metodo astratto
    public abstract void esegui();

}


