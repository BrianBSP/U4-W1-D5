package playerMultimediale;

public class Main {
    public static void main(String[] args) {
        ElementoMultimediale img1 = new Immagine("Foto", 3);
        ElementoMultimediale img2 = new Immagine("FotoMatrimonio", 5);

        System.out.println(img1);
        System.out.println(img2);

        img1.esegui();
        img2.esegui();


    }
}