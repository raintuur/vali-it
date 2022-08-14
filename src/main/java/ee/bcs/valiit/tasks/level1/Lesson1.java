package ee.bcs.valiit.tasks.level1;

public class Lesson1 {

    public static void main(String[] args) {
        // Siia sisse võid sa kirjutada koodi, et testida kas su meetodid töötavad korrektsel

    }

    // TODO: tagasta vastasmärgiline arv
    // invertPositiveNegative(2)    tagastab   -2
    // invertPositiveNegative(0)    tagastab   0
    // invertPositiveNegative(-9)   tagastab   9
    public static int invertPositiveNegative(int a) {
        return -a;
    }

    // TODO: tagasta kahe arvu keskmine
    // getAverage(1, 3)    tagastab    2
    // getAverage(-1, 1)   tagastab    0
    // getAverage(0, 20)   tagastab    10
    public static int getAverage(int a, int b) {
        return (a + b) / 2;
    }

    // TODO: lahuta sisendist 5 ja siis korruta 99
    // minus5Times99(-5)    tagastab   -990
    // minus5Times99(0)     tagastab   -495
    // minus5Times99(5)     tagastab   0
    public static int minus5Times99(int x) {
        return (x - 5) * 99;
    }

    // TODO: korruta a1 b1-ga, a2 b2-ga, a3 b3-ga. Ning siis liida saadud tulemused kokku.
    // multiplyPairsAndGetTotalSum(1, 3, 2, 4, 5, 6)       tagastab    41,
    // multiplyPairsAndGetTotalSum(-5, 9, 2, 18, 1, -3)    tagastab    -12
    public static int multiplyPairsAndGetTotalSum(int a1, int b1, int a2, int b2, int a3, int b3) {
        return a1 * b1 + a2 * b2 + a3 * b3;
    }

    // TODO: Sisendiks on mingi aastaarv (1920, 1984, 2000, vms)
    //  Kas arv on liigaasta?
    //  Wikipeediast:
    //  Iga aasta, mis jagub neljaga, on liigaasta (kui ta samal ajal ei jagu sajaga).
    //  Kui aasta jagub sajaga ja ei jagu neljasajaga siis ta ei ole liigaasta.
    //  Aasta, mis jagub neljasajaga, on alati liigaasta.
    //  See tähendab näiteks, et aastad 1984 ja 2000 olid liigaastad, 1900 aga mitte.
    //  Kasuta if-else-if statementi. Küsi vihjet, kui väga jänni jääd.
    // isLeapYear(1984)     tagastab    true
    // isLeapYear(2000)     tagastab    true
    // isLeapYear(1900)     tagastab    false
    // isLeapYear(2021)     tagastab    false
    // isLeapYear(2020)     tagastab    true
//    public static boolean isLeapYear(int year) {
//        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
//    }

    // TODO: tagasta x-i vastand väärtus
    // invertBoolean(false)  tagastab    true
    // invertBoolean(true)   tagastab    false
    public static boolean invertBoolean(boolean x) {
        return !x;
    }

    // TODO: tagasta true kui AINULT 1 sisend muutujatest on true
    // oneBooleanIsTrue(true, false)   tagastab    true
    // oneBooleanIsTrue(false, true)   tagastab    true
    // oneBooleanIsTrue(true, true)    tagastab    false
    // oneBooleanIsTrue(false, false)  tagastab    false
    public static boolean oneBooleanIsTrue(boolean x1, boolean x2) {
        return (x1 && !x2) || (!x1 && x2);
    }

    // TODO: tagasta true kui paaritu arv sisend muutujatest on true
    // oddNumberOfTrueBooleans(true, false, false, false)   tagastab     true
    // oddNumberOfTrueBooleans(false, true, false, false)   tagastab     true
    // oddNumberOfTrueBooleans(true, true, true, true)      tagastab     false
    // oddNumberOfTrueBooleans(false, false, false, false)  tagastab     false
    // oddNumberOfTrueBooleans(true, true, true, false)     tagastab     true
    // oddNumberOfTrueBooleans(false, true, true, true)     tagastab     true
    // oddNumberOfTrueBooleans(true, true, false, false)    tagastab     false
    // oddNumberOfTrueBooleans(false, false, true, true)    tagastab     false
    public static boolean oddNumberOfTrueBooleans(boolean x1, boolean x2, boolean x3, boolean x4) {
        int count = 0;
        if (x1) {
            count++;
        }
        if (x2) {
            count++;
        }
        if (x3) {
            count++;
        }
        if (x4) {
            count++;
        }
        return count % 2 == 1;
    }


    public static boolean isLeapYear(int i) {
        return false;
    }
}
