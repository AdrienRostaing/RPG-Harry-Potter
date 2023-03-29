package Game;

import java.util.Random;

public abstract class  AbstractEnemy extends Character {
    public static int numenemy;
    public String name;
    static Enemy enemy;
    static Boss boss;



    public AbstractEnemy(String name, int maxHp, int accuracy, int damage, int resistance ,int xp) {
        super(name, maxHp, accuracy, damage, resistance, xp);
        this.name = name;
        this.hp = maxHp;
        this.maxHp= maxHp;
        this.accuracy = accuracy;
        this.damage = damage;
        this.resistance = resistance;
        this.xp = xp;
    }

    public static void enemy() {
        Random random = new Random();
        //random number between 0 and length of encounters array
        numenemy = random.nextInt(GameLogic.enemyNames.length);
        for (int i = numenemy; i < GameLogic.enemyNames.length - 1; i++) {
            GameLogic.enemyNames[i] = GameLogic.enemyNames[i + 1];
        }
        System.out.println("a " + GameLogic.enemyNames[numenemy] + "!");
        if (GameLogic.enemyNames[numenemy] == "Snake")
            enemy = new Enemy("Snake", 30, 70, 10, 0, 10);
        if (GameLogic.enemyNames[numenemy] == "Acromantula")
            enemy = new Enemy("Acromantula", 40, 60, 20, 0, 15);
        if (GameLogic.enemyNames[numenemy] == "cerberus")
            enemy = new Enemy("Cerberus", 70, 50, 25, 5, 25);
        if (GameLogic.enemyNames[numenemy] == "Dementor")
            enemy = new Enemy("Dementor", 85, 60, 35, 0, 35);
        if (GameLogic.enemyNames[numenemy] == "Werewolf")
            enemy = new Enemy("Werewolf", 200, 50, 45, 0, 50);
        if (GameLogic.enemyNames[numenemy] == "Dragon")
            enemy = new Enemy("Dragon", 400, 50, 55, 10, 75);
        if (GameLogic.enemyNames[numenemy] == "death eater")
            enemy = new Enemy("Death Eater", 250, 70, 65, 0, 100);
        GameLogic.promptEnterKey();
    }
    public static void boss() {
        if (GameLogic.level == 1)
            boss = new Boss("Troll", 80, 50, 35, 0, 50);
        else if (GameLogic.level == 2)
            boss = new Boss("Basilisk", 100, 60, 45, 0, 75);
        else if (GameLogic.level == 3)
            boss = new Boss("Hord of Dementors", 130, 70, 55, 0, 100);
        else if (GameLogic.level == 4)
            boss = new Boss("Weak voldemort and Peter Pettigrew", 175, 60, 65, 0, 125);
        else if (GameLogic.level == 5)
            boss = new Boss("Dolores Umbridge", 225, 60, 75, 0, 150);
        else if (GameLogic.level == 6)
            boss = new Boss("Death Eater", 250, 60, 85, 0, 175);
        else if (GameLogic.level == 7)
            boss = new Boss("Voldemort", 300, 60, 95, 0, 200);

    }



    public String getName() {
        return name;
    }
    //Enemy specific attack and defence calculations
    @Override
    public int attack() {
        if (Math.random() * 100 + 1 <= accuracy) {
            System.out.println(name + " attacked you!");
            return AbstractSpell.damage;
        } else {
            System.out.println(name + " missed!");
            return 0;
        }
    }

    @Override
    public int defend() {
        return resistance;
    }
}


