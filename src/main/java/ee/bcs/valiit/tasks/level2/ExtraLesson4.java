package ee.bcs.valiit.tasks.level2;

import java.util.Random;

public class ExtraLesson4 {

    // TODO kirjuta mäng mis leiab suvalise numbri 0-99, mille kasutaja peab ära arvama
    // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
    // ja kasutaja peab saama uuesti arvata
    // numbri ära arvamise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks
    // Vihjeks - Scanner ja while loop.
    public static void main(){
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
    }
}
