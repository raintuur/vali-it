package ee.bcs.valiit;


import java.util.Scanner;


public class Temporary {

    public static void main(String[] args) {
        String name = "Nipi Tiri";

        printGreetingInSpanish(name);


        printGreetingFinnish(name);

        int inputNumber = 2;
        int multiplyResult = getMultiplyResult(inputNumber);

        System.out.println("Salvestame tulemuse andmebaasi " + multiplyResult);

        ContactRepository contactRepository = new ContactRepository();
        String message = contactRepository.saveContact(name);


        ConsolePrintService printService = new ConsolePrintService();
        printService.printGreetingInEnglish(name);


        saveNameToDatabase(name);

        int number = 10;

        int number2 = 20;

        int result2 = multiplyByThree(number2);


        int result = multiplyByTwo(number);

        int someResult = multiplyByTwo(20);

        System.out.println("kahega korrutamise tulemus: " + result);

        System.out.println("Finito!");
    }

    private static int getMultiplyResult(int inputNumber) {
        int multiplyResult;
        if (inputNumber % 2 == 0) {
            multiplyResult = multiplyByTwo(inputNumber);
        } else {
            multiplyResult = multiplyByThree(inputNumber);
        }
        return multiplyResult;
    }

    private static void printGreetingInSpanish(String name) {
        System.out.println("Hola " + name);
        System.out.println("Hola " + name);
        System.out.println("Hola " + name);
        System.out.println("Hola " + name);
    }

    private static int multiplyByThree(int number2) {
        return 0;
    }

    private static void printGreetingFinnish(String name) {
        System.out.println("Tervetuloa " + name);
    }


    private static void saveNameToDatabase(String nameToSave) {
        System.out.println("nimi salvetatud andmebaasi: " + nameToSave);
    }

    private static int multiplyByTwo(int number) {
        return number * 2;
    }


}
