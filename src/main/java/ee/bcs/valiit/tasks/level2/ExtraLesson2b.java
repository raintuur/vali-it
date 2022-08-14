package ee.bcs.valiit.tasks.level2;

public class ExtraLesson2b {

    public static void main(String[] args) {
        // TODO: siia saab kirjutada koodi testimiseks

    }

    // TODO:
    // Kujutame ette numbrite jada, kus juhul kui number on paaris arv siis me jagame selle 2-ga,
    // aga kui number on paaritu arv siis me korrutame selle 3-ga ja liidame 1. (3n+1)  (TODO: 1)
    // Seda tegevust teeme me niikaua kuni me saame vastuseks 1(TODO: 2)
    // Näiteks kui sisend arv on 22, siis kogu jada oleks:
    // 22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
    // Sellise jada pikkus on 16
    // Kirjutada programm, mis peab leidma kõige pikema jada pikkuse mis jääb kahe täis arvu vahele (TODO: 3)
    // Näiteks:
    // Sisend 10 20
    // Tuleb vaadata, kui pikk jada tuleb kui esimene number on 10. Järgmisena tuleb arvutada number 11 jada pikkus.
    // jne. kuni numbrini 20
    // Tagastada tuleb kõige pikema jada pikkus number
    // Näiteks sisendi 10 ja 20 puhul on kõige pikem jada 21

    // TODO: 3
    //  tehke tsükkel x -> y
    //  kutsuge iga väärtuse korral välja meetodit getSeqLength
    //  salvestage maha kõige suurem getSeqLength() pikkus
    //  ja funktsiooni lõpus tagastage leitud arv

    // sequence3n(1, 10)        tagastab    20
    // sequence3n(100, 200)     tagastab    125
    // sequence3n(201, 210)     tagastab    89
    // sequence3n(900, 1000)    tagastab   174
    public static int sequence3n(int x, int y) {
        return 0;
    }

    // TODO: 2
    //  kutsuge korduvalt välja meetodit nextElement nii kaua kuni selle meetodi vastus tuleb 1
    //  getSeqLength() peab siis tagastama nende korduste arvu + 1
    //  kui x = 22 siis nextElement(x) tsükliliselt läbi käies oleks nextElement(x) tagastused järgmiste väärustega:
    //  22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
    //     1     2     3     4     5     6     7     8     9    10    11    12   13   14   15
    //  kordusi (->) tuleks kokku 15
    //  nextElement(22) tagastaks 11
    //  nextElement(11) tagastaks 34
    //  nextElement(34) tagastaks 17
    //  nextElement(17) tagastaks 52
    //  jne
    //  tagastada tuleb korduste arv + 1, ehk siis 15 + 1 = 16

    //  getSeqLength(1)     tagastab    1
    //  getSeqLength(5)     tagastab    6
    //  getSeqLength(8)     tagastab    4
    public static int getSeqLength(int x){
        return 0;
    }

    // TODO: 1
    //  kui x on paaris arv siis me jagame selle 2-ga
    //  Kui x on paaritu arv siis me korrutame selle 3-ga ja liidame 1. (3n+1)
    //  tagasta jada järgmine element
    //  näiteks:
    //  x = 22      -> 11
    //  x = 11      -> 34
    //  x = 34      -> 17
    //  x = 17      -> 52
    public static int nextElement(int x){
        return 0;
    }

}
