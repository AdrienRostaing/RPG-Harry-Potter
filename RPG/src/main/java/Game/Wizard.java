package Game;

public class Wizard extends Character {


    public String[] knownSpells;

    String pet;

    public static String name;

    String wand;

    String house;


    public String potions;

    public int xp;

    public int restsleft;



    // integers to store number of upgrades/skills in each path


    //Arrays to store skill names

    // wizard specific constructor
    public Wizard(String name, int maxHp, int accuracy, int damage, int resistance ,int xp){
        super(name, maxHp, accuracy , damage, resistance, xp);
        this.name = getName();
        this.pet = GameLogic.pet;
        this.maxHp = 200;
        this.accuracy = accuracy;
        this.damage = damage;
        this.resistance = resistance;
        this.wand = Wand.wand;
        this.house = SortingHat.house;
        this.knownSpells = AbstractSpell.spells;
        this.potions = "Potion of life";;
        this.restsleft = 1;
        this.xp = xp;

    }


    @Override
    public int attack() {
        if(Math.random()*100 +1 <= AbstractSpell.accuracy + (AbstractSpell.accuracy *House.accuracyboost)/100){
            return AbstractSpell.damage + (AbstractSpell.damage*House.damageboost)/100 +damage-20;
        }else{
            return 0;

        }
    }

    @Override
    public int defend() {
        return House.resistanceboost;
    }


}

