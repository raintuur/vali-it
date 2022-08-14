package ee.bcs.valiit.tasks.level1;

import java.util.Scanner;

public class Lesson4 {

    // TODO
    //  Copy-paste Lesson2-st meetodite [abs(),isEven(),min(),min3(),max(),max3()] lahendused -> LessonService klassi
    //  Loo LessonService klass'ist üks uus objekt, et pääseda ligi nendele meetoditele.
    //  Küsi kasutajalt Scanneri abil konsoolist, et millist meetodit ta soovib kasutada.
    //  Kasutaja peab valiku tegemiseks sisestama konsooli vastava numbri.
    //  Seejärel peab kasutajale kuvama abistavat infot, et ta saaks sisestada vajalikud arvud.
    //  Kasutaja saab programmi seni kaua kasutada, kuni ta valib "0 - välju"
    //  YouTube video, et kuidas see lahendus peaks toimima: https://youtu.be/KCum0_T5q6E

    // Näidis:

    // Rakendust käivitades kuvatakse kõik valikud
    //  Valikud:
    //  1 - min(a, b)
    //  2 - max(a, b)
    //  jne.....
    //  Vali meetod, mida tahad tööle panna:

    //  Kasutaja sisetab konsooli "1" ja kasutajale kuvatakse teade:
    //  Sisesta min(a, b) sisendid
    //  Sisesta 'a' number:

    //  Kasutaja sisetab konsooli "10" ja kasutajale kuvatakse teade:
    //  Sisesta 'b' number:

    //  Kasutaja sisetab konsooli "20" ja kasutajale kuvatakse teade:
    //  min(a, b) tagastab: 10

    //  Vihje - kasuta while() loogitkat ja siis "if else if" või siis switch statementit.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    private static void displayOptionsInConsole() {
        System.out.println("\nValikud:");
        System.out.println("1 - min(a, b)");
        System.out.println("2 - max(a, b)");
        System.out.println("3 - min3(a, b, c)");
        System.out.println("4 - max3(a, b, c)");
        System.out.println("5 - abs(a)");
        System.out.println("6 - isEven(a)");
        System.out.println("0 - välju");
        System.out.println("Vali meetod, mida tahad tööle panna:");
    }

}
