package Game;

public class Boss extends AbstractEnemy{

    public String name, type;
    public int maxHp, hp, accuracy, damage, xp;

    public Boss(String name, int maxHp, int accuracy, int damage, String type ,int xp) {
        super(name, maxHp, accuracy, damage, type, xp);
        this.name = name;
        this.hp = maxHp;
        this.maxHp= maxHp;
        this.accuracy = accuracy;
        this.damage = damage;
        this.type = type;
        this.xp = xp;
    }


}
