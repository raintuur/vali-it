package ee.bcs.valiit.tasks.level1;

public class Lesson3 {

    public static void main(String[] args) {
        // TODO siia saab kirjutada koodi testimiseks

    }

    // TODO: tagasta massiiv milles oleks numbrid 1,2,3,4,5
    // oodatav vastus: {1, 2, 3, 4, 5}
    public static int[] sampleArray() {
        int[] result = new int[5];
        result[0] = 1;
        result[1] = 2;
        result[2] = 3;
        result[3] = 4;
        result[4] = 5;
        return result;
        // või siis teise variandina oleks lihtsalt alljärgnev rida:
        // return new int[]{1, 2, 3, 4, 5};
    }

    // TODO: loo massiiv mis saab sisendiks n ja tagastab massiivi suurusega n
    //  Kus esimene element on 1 ja iga järnev arv on 1 võrra suurem
    // generateArray(6)     tagastab    {1, 2, 3, 4, 5, 6}
    // generateArray(3)     tagastab    {1, 2, 3}
    // generateArray(0)     tagastab    {}
    public static int[] generateArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    // TODO: tagasta massiiv pikkusega n, mille kõigi elementide väärtused on 3
    // arrayOfThrees(6)   tagastab    {3, 3, 3, 3, 3, 3}
    // arrayOfThrees(0)   tagastab    {}
    public static int[] arrayOfThrees(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = 3;
        }
        return array;
    }

    // TODO: muuda sisend massiivi nii et kõik elemendid oleksid 2x suuremad
    // ENNE     {1, 4, 6, 2, 4, 1};
    // PÄRAST   {2, 8, 12, 4, 8, 2};

    // ENNE     {4, 3, 1, 53, 2, 55};
    // PÄRAST   {8, 6, 2, 106, 4, 110};
    public static void doubleAllElementValues(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] *= 2; // x[i] = x[i] * 2;
        }
    }

    // TODO: määra sisend massiivi teine element 0-iks
    // ENNE     {1, 4, 6, 2, 4, 1}
    // PÄRAST   {1, 0, 6, 2, 4, 1}

    // ENNE     {4, 3, 1, 53, 2, 55}
    // PÄRAST   {4, 0, 1, 53, 2, 55}
    public static void secondElementToZero(int[] x) {
        x[1] = 0;
    }

    // TODO: vaheta massiivi esimene ja teine element omavahel
    // ENNE       {1, 4, 6, 2, 4, 1}
    // PÄRAST     {4, 1, 6, 2, 4, 1}
    public static void swapFirstAndSecondElement(int[] x) {
        int initialX0 = x[0];
        x[0] = x[1];
        x[1] = initialX0;
    }

    // TODO: määra massiivi teise elemendi väärtuseks sama mis esimesel elemendil
    // ENNE       {1, 4, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1};
    // PÄRAST     {1, 1, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1};

    // ENNE       {4, 3, 1, 53, 2, 55};
    // PÄRAST     {4, 4, 1, 53, 2, 55};
    public static void firstElementToSameAsFirst(int[] x) {
        x[1] = x[0];
    }

    // TODO:
    //  määra massiivi teise elemendi väärtuseks sama mis esimesel elemendil
    //  määra massiivi neljanda elemendi väärtuseks sama mis kolmandal elemendil
    //  määra massiivi kuuenda elemendi väärtuseks sama mis viiendal elemendil
    //  määra massiivi kaheksanda elemendi väärtuseks sama mis seitsmendal elemendil
    // ENNE       {1, 4, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1};
    // PÄRAST     {1, 1, 6, 6, 4, 4, 5, 5, 7, 1, 8, 1};
    public static void changeRequiredElements(int[] x) {
        // määra massiivi teise elemendi väärtuseks sama mis esimesel elemendil
        x[1] = x[0];
        // määra massiivi neljanda elemendi väärtuseks sama mis kolmandal elemendil
        x[3] = x[2];
        // määra massiivi kuuenda elemendi väärtuseks sama mis viiendal elemendil
        x[5] = x[4];
        // määra massiivi kaheksanda elemendi väärtuseks sama mis seitsmendal elemendil
        x[7] = x[6];
    }

    // TODO: määra massiivi iga teise elemendi (indeksid 1, 3, jne) väärtus,
    //  mis oli talle eelnenud elemendi väärtus
    // ENNE       {1, 4, 6, 2, 4, 1, 5, 2, 7, 1, 8, 1, 1};
    // PÄRAST     {1, 1, 6, 6, 4, 4, 5, 5, 7, 7, 8, 8, 1};

    // ENNE       {4, 3, 1, 53, 2, 55};
    // PÄRAST     {4, 4, 1, 1, 2, 2};
    public static void changeEvenElementsToPreviousElementValues(int[] x) {
        for (int i = 1; i < x.length; i = i + 2) {
            x[i] = x[i - 1];
        }
    }


}
