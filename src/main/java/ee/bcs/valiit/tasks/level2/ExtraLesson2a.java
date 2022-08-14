package ee.bcs.valiit.tasks.level2;

public class ExtraLesson2a {

    public static void main(String[] args) {
        // TODO: siia saab kirjutada koodi testimiseks

    }

    // TODO:
    // Võid vaadata enne ExtraLesson2b (kus see harjutus on tehtud osadeks).
    // Kujutame ette numbrite jada, kus juhul kui number on paaris arv siis me jagame selle 2-ga
    // Kui number on paaritu arv siis me korrutame selle 3-ga ja liidame 1. (3n+1)
    // Seda tegevust teeme me niikaua kuni me saame vastuseks 1
    // Näiteks kui sisend arv on 22, siis kogu jada oleks:
    // 22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
    // Sellise jada pikkus on 16
    // Kirjutada programm, mis peab leidma kõige pikema jada pikkuse mis jääb kahe täis arvu vahele
    // Näiteks:
    // Sisend 10 20
    // Tuleb vaadata, kui pikk jada tuleb kui esimene number on 10. Järgmisena tuleb arvutada number 11 jada pikkus.
    // jne. kuni numbrini 20
    // Tagastada tuleb kõige pikema jada pikkus number
    // Näiteks sisendi 10 ja 20 puhul on kõige pikem jada 21

    // sequence3n(1, 10)        tagastab    20
    // sequence3n(100, 200)     tagastab    125
    // sequence3n(201, 210)     tagastab    89
    // sequence3n(900, 1000)    tagastab   174
    public static int sequence3n(int x, int y) {
        int maxLength = 0;
        for (int i = x; i < y; i++) {
            int length = 1;
            int count = i;
            while (count > 1) {
                if (count % 2 == 0) {
                    count = count / 2;
                } else {
                    count = count * 3 + 1;
                }
                length++;
            }
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }

}
