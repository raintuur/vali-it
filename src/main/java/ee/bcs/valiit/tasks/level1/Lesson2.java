package ee.bcs.valiit.tasks.level1;

// TODO kasuta if/else. Ära kasuta Math librarit
public class Lesson2 {

    public static void main(String[] args) {
        // Siia sisse võid sa kirjutada koodi, et testida kas su meetodid töötavad korrektselt
        // Katseta IntelliJ shortcuti. Olles intelliJ kirjuta "sout" ja siis vajuta enter
        System.out.println(min(1, 3)); // trükib miinimumi ehk 1
    }

    // TODO tagasta a ja b väikseim väärtus
    // min(2,  3)   tagastab    2
    // min(2, -3)   tagastab   -3
    // min(-3,-3)   tagastab   -3
    public static int min(int a, int b) {
        return a < b ? a : b;

//        if (a < b) {
//            return a;
//        } else {
//            return b;
//        }
    }

    // TODO tagasta a ja b suurim väärtus
    // max(2,  3)   tagastab   3
    // max(2, -3)   tagastab   2
    // min(-3,-3)   tagastab  -3
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta kolmest arvust kõige väiksem
    // min3(2, 3, 4)    tagastab     2
    // min3(2, 2, 4)    tagastab     2
    // min3(2, 4, 4)    tagastab     2
    // min3(3, 2, 4)    tagastab     2
    // min3(1, 2, 4)    tagastab     1
    // min3(1, 2,-5)    tagastab    -5
    public static int min3(int a, int b, int c) {
        int minAB = min(a, b);
        int minBC = min(b, c);
        int minABC = min(minAB, minBC);
        return minABC;
    }

    // TODO tagasta kolmest arvust kõige suurem
    // max3(2, 3, 4)    tagastab    4
    // max3(3, 3, 4)    tagastab    4
    // max3(2, 4, 4)    tagastab    4
    // max3(3, 2, 4)    tagastab    4
    // max3(4, 2, 4)    tagastab    4
    public static int max3(int a, int b, int c) {
        int maxAB = max(a, b);
        int maxBC = max(b, c);
        int maxABC = max(maxAB, maxBC);
        return maxABC;
    }

    // TODO tagasta a absoluut arv
    // abs( 2)  tagastab    2
    // abs(-2)  tagastab    2
    public static int abs(int a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }

    // TODO tagasta true, kui a on paaris arv
    //  tagasta false kui a on paaritu arv
    // isEven(-4)  tagastab    true
    // isEven( 3)  tagastab    false
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

}
