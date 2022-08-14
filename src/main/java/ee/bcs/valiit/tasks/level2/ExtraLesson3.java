package ee.bcs.valiit.tasks.level2;

import java.util.HashMap;
import java.util.Map;

public class ExtraLesson3 {

    public static void main(String[] args) {
        // TODO: siia saab kirjutada koodi testimiseks

    }

    // TODO: tagasta x faktoriaal.
    // factorial(5)     tagastab    120         (5*4*3*2*1 = 120)
    // factorial(7)     tagastab    5040        (7*6*5*4*3*2*1 = 5040)
    // factorial(1)     tagastab    1
    public static int factorial(int x) {
        return 0;
    }

    // TODO: tagasta string tagurpidi
    // reverseString("tere")    tagastab    "eret"
    // reverseString("TeRe")    tagastab    "eReT"
    // reverseString("")        tagastab    ""
    // reverseString("A")       tagastab    "A"
    public static String reverseString(String a) {
        return null;
    }

    // TODO: tagasta kas sisestatud arv on algarv
    //  (ühest suuremad arvud, mis jaguvad ainult 1 ja iseendaga.)
    //  2, 3, 5, 7, 11, 13, 17, 19, 23, 29...
    // isPrime(1)       tagastab  false
    // isPrime(2)       tagastab  true
    // isPrime(5)       tagastab  true
    // isPrime(937)     tagastab  true
    // isPrime(217)     tagastab  false
    public static boolean isPrime(int x) {
        return false;
    }

    // TODO: sorteeri massiiv suuruse järgi.
    //  kasuta tsükleid, ära kasuta ühtegi olemasolevat sort funktsiooni
    //  algoritmi selgitav YouTube video https://youtu.be/jwNWj6hxwcE
    // näide sisend {6, 2, 7, 3, 1} returns {1, 2, 3, 6, 7}
    public static int[] sort(int[] a) {
        return null;
    }

    // TODO: liida kokku kõik paaris fibonacci arvud kuni numbrini x
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, jne...
    // evenFibonacci(9)     tagastab    2 + 8 = 10
    // liidetakse paaris arvud kuni 8,
    // sest 8 on viimane number selles jadas mis on 9-st väiksem
    // Järgmine number jadas (13) on juba 9-st suurem.
    public static int evenFibonacci(int x) {
        return 0;
    }

    // TODO: kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
    // Ei pea kogu tähestikku ära katma. Peab töötama minimaalselt sisenditega "hello" ja "sos"
    // Kasuta sümboleid . ja - ning eralda kõik tähed tühikuga
    // näited:
    // e = "." ja l =".-.."
    // el = ". .-.."

    // morseCode("hello")   tagastab    ".... . .-.. .-.. ---"
    // morseCode("sos")     tagastab    "... --- ..."

    // Vihjeks. Map'i kasutamine võib olla abiks :)
    public static String morseCode(String text) {
        return null;
    }

}
