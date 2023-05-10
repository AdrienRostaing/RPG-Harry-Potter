package Game;

import java.util.Random;

public abstract class  AbstractEnemy extends Character {
    public static int numenemy;
    public String name;
    public static String type;
    static Enemy enemy;
    static Boss boss;
    static Wizard wizard;



    public AbstractEnemy(String name, int maxHp, int accuracy, int damage, String type ,int xp) {
        super(name, maxHp, accuracy, damage, type, xp);
        this.name = name;
        this.hp = maxHp;
        this.maxHp= maxHp;
        this.accuracy = accuracy;
        this.damage = damage;
        this.type = type;
        this.xp = xp;
    }

    public static void enemy() {
        GameLogic.clearConsole();
        Random random = new Random();
        //random number between 0 and length of encounters array
        numenemy = random.nextInt(GameLogic.enemyNames.length);
        //for (int i = numenemy; i < GameLogic.enemyNames.length - 1; i++) {
           // GameLogic.enemyNames[i] = GameLogic.enemyNames[i + 1];
        //}
        if (GameLogic.enemyNames[numenemy] == "Snake") {
            Story.snake();
            enemy = new Enemy("Snake", 30, 70, 10, "mob", 10);
        }else if (GameLogic.enemyNames[numenemy] == "Acromantula"){
            Story.acromantula();
            enemy = new Enemy("Acromantula", 40, 60, 20, "mob", 15);
        }else if (GameLogic.enemyNames[numenemy] == "cerberus"){
            Story.cerberus();
            enemy = new Enemy("Cerberus", 70, 50, 25, "mob", 25);
        }else if (GameLogic.enemyNames[numenemy] == "Dementor"){
            Story.dementor();
            enemy = new Enemy("Dementor", 85, 60, 35, "mob", 35);
        }else if (GameLogic.enemyNames[numenemy] == "Werewolf"){
            Story.werewolf();
            enemy = new Enemy("Werewolf", 200, 50, 45, "mob", 50);
        }else if (GameLogic.enemyNames[numenemy] == "Dragon"){
            Story.dragon();
            enemy = new Enemy("Dragon", 400, 50, 55, "mob", 75);
        }else if (GameLogic.enemyNames[numenemy] == "death eater"){
            Story.deatheater();
            enemy = new Enemy("Death Eater", 250, 70, 65, "mob", 100);
        }
        GameLogic.promptEnterKey();
    }

    public static void boss() {
        if (GameLogic.boss == 0)
            boss = new Boss("Troll", 80, 50, 25, "boss", 50);
        else if (GameLogic.boss ==  1)
            boss = new Boss("Basilisk", 100, 60, 45, "boss", 75);
        else if (GameLogic.boss ==  2)
            boss = new Boss("Hord of Dementors", 130, 70, 55, "boss", 100);
        else if (GameLogic.boss == 3)
            boss = new Boss("Weak Voldemort and Peter Pettigrew", 175, 60, 65, "boss", 125);
        else if (GameLogic.boss == 4)
            boss = new Boss("Dolores Umbridge", 225, 60, 75, "boss", 150);
        else if (GameLogic.boss ==  5)
            boss = new Boss("Death Eater", 250, 60, 85, "boss", 175);
        else if (GameLogic.boss ==  6)
            boss = new Boss("Voldemort", 300, 60, 95, "boss", 200);
    }

    //Enemy specific attack and defence calculations
    @Override
    public int attack() {
        if (Math.random() * 100 + 1 <= accuracy) {
            System.out.println(name + " attacked you!");
            return damage;
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
