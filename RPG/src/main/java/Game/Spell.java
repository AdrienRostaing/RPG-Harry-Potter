package Game;

public class Spell extends AbstractSpell {
    public static int accuracy;
    public static int damage;
    public String name;
    public static int resistance;
    public static String type;

    public Spell(String name, int damage, int accuracy, int resistance, String type) {
        super(name, damage, accuracy, resistance, type);
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.resistance = resistance;
        this.type = type;

    }



}

