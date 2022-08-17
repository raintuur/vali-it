package ee.bcs.valiit;

public class Temporary {

    public static void main(String[] args) {


        String[] cars = new String[4];

        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Audi";


        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals("Audi")) {
                cars[i] = "Audi (Kristiina lemmik auto bränd)";
            }
            System.out.println(cars[i]);
        }


    }
}
