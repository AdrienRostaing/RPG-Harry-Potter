package Game;
import java.util.Random;

public class Wand {

    public static int size;
    public static Core core;
    public static String wand;
    public void wand() {
        Random random = new Random();
        this.core = Core.values()[random.nextInt(Core.values().length)];
        this.size = random.nextInt(15) + 22;
        this.wand = this.core + " " + this.size;
        System.out.println("Your wand measures " + this.size + "cm and is made of " + this.core.type + " core."+" It is often said that a wand chooses its wielder!");

    }


}