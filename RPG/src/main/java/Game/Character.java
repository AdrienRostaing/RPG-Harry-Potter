package Game;

public abstract class Character {

    public static String name;
    public int  hp;
    public int maxHp;
    public int xp;
    public int accuracy;
    public static int damage;
    public static int resistance;



    public Character(String name, int maxHp, int accuracy, int damage, int resistance ,int xp) {
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.name = name;
        this.accuracy = accuracy;
        this.damage = damage;
        this.resistance = resistance;
        this.xp = xp;
    }



    public String getName() {
        return name;
    }


    public int attack(){
        return 0;
    }


    public int defend() {
        return 0;
    }
}
