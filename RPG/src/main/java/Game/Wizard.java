package Game;

public class Wizard extends Character {


    public String[] knownSpells;

    String pet;

    public static String name, type;

    String wand;

    String house;


    public String potions;

    public int xp;

    public int restsleft, damageup;



    // integers to store number of upgrades/skills in each path


    //Arrays to store skill names

    // wizard specific constructor
    public Wizard(String name, int maxHp, int accuracy, int damageup, String type ,int xp){
        super(name, maxHp, accuracy , damageup, type, xp);
        this.name = getName();
        this.pet = GameLogic.pet;
        this.maxHp = 200;
        this.accuracy = accuracy;
        this.damageup = damageup;
        this.type = type;
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
            return AbstractSpell.damage + ((AbstractSpell.damage+ damageup)*House.damageboost)/100 + damageup;
        }else{
            return 0;

        }
    }

    @Override
    public int defend() {
        return House.resistanceboost;
    }


}

