package ee.bcs.valiit;

public class ConsolePrintService {

    public void printGreetingInEnglish(String name) {
        System.out.println("Welcome " + name);
        printGreetingInEstonian(name);
    }

    private void printGreetingInEstonian(String name) {
        System.out.println("Tere tulemast " + name);
    }

}