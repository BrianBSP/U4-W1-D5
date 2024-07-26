package playerMultimediale;

public class Main {
    public static void main(String[] args) {
        // immagini
        ElementoMultimediale img1 = new Immagine("Foto", 3);
        ElementoMultimediale img2 = new Immagine("FotoMatrimonio", 5);

        System.out.println(img1);
        System.out.println(img2);

        img1.esegui();
        img2.esegui();

        // audio
        ElementoMultimediale aud1 = new Audio("canzoneEminem", 5, 10);
        ElementoMultimediale aud2 = new Audio("canzoneTupac", 3, 7);

        System.out.println(aud1);
        System.out.println(aud2);

        aud1.esegui();
        aud2.esegui();

        // video
        ElementoMultimediale vid1 = new Video("videoCresima", 5, 10, 8);
        ElementoMultimediale vid2 = new Video("videoComunione", 6, 4, 7);

        System.out.println(vid1);
        System.out.println(vid2);

        vid1.esegui();
        vid2.esegui();


    }
}