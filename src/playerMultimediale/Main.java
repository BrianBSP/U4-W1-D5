package playerMultimediale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // immagini
        /*ElementoMultimediale img1 = new Immagine("Foto", 3);
        ElementoMultimediale img2 = new Immagine("FotoMatrimonio", 5);

        System.out.println(img1);
        System.out.println(img2);

        img1.esegui();
        img2.esegui();*/

        // audio
        /*ElementoMultimediale aud1 = new Audio("canzoneEminem", 5, 10);
        ElementoMultimediale aud2 = new Audio("canzoneTupac", 3, 7);

        System.out.println(aud1);
        System.out.println(aud2);

        aud1.esegui();
        aud2.esegui();*/

        // video
        /*ElementoMultimediale vid1 = new Video("videoCresima", 5, 10, 8);
        ElementoMultimediale vid2 = new Video("videoComunione", 6, 4, 7);

        System.out.println(vid1);
        System.out.println(vid2);

        vid1.esegui();
        vid2.esegui();*/

        // array
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
       /* elementi[0] = new Immagine("FotoMatrimonio", 4);
        elementi[1] = new Immagine("FotoMatrimonio", 4);
        elementi[2] = new Audio("CanzoneRedHotChilliPeppers", 4, 8);
        elementi[3] = new Video("VideoCresima", 3, 5, 7);
        elementi[4] = new Video("VideoComunione", 4, 6, 2);*/

        // array 

        while (true) {
            System.out.println("Scegli quale elemento dell'array vuoi eseguire:\n-Scegli elemento da 1 a 5\n-premi 0 per uscire.");
            int elementoDaEseguire = Integer.parseInt(scanner.nextLine());
            if (elementoDaEseguire == 0) {
                System.out.println("Hai spento l'applicazione");
                break;
            } else if (elementoDaEseguire >= 1 && elementoDaEseguire <= 5) {
                elementi[elementoDaEseguire - 1].esegui();
            } else {
                System.out.println("Scegli meglio... ci sono solo 5 elementi nel player multimediale.");
            }
        }


        /*for (int i = 0; i < elementi.length; i++) {
            System.out.println("Inserisci il tipo di elemento multimediale:\n 1. Immagine,\n 2. Registrazione Audio,\n 3. Video");
            String tipoElemento = scanner.nextLine();
            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

        }*/


    }
}