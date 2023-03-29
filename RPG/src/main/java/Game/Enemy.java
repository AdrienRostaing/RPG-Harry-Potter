package Game;



public class Enemy extends AbstractEnemy {
    public String name;
    public int maxHp, hp, accuracy, damage, resistance, xp;

    public Enemy(String name, int maxHp, int accuracy, int damage, int resistance ,int xp) {
        super(name, maxHp, accuracy, damage, resistance, xp);
    this.name = name;
    this.hp = maxHp;
    this.maxHp= maxHp;
    this.accuracy = accuracy;
    this.damage = damage;
    this.resistance = resistance;
    this.xp = xp;
    }



}
