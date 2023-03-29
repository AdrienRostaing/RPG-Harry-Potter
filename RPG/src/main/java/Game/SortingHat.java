package Game;

import java.util.Random;

public class SortingHat {
    public static String house;
    public void sortingHat() {
        int rnd = new Random().nextInt(House.HOUSES.length);
        this.house =  House.HOUSES[rnd];
        System.out.println("Hmm... It is very diffult to assign you a house... This may take some time...");
        GameLogic.delay(3000);
        System.out.println("... Ah but of course, you are a " + this.house + " !");
    }
}
