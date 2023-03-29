package Game;

public class Wizard extends Character {


    public String[] knownSpells;

    String pet;

    public static String name;

    String wand;

    String house;

    public String potions;

    public int xp;
    public String potiondisp;
    int gold, restsleft, pots;

    // integers to store number of upgrades/skills in each path


    //Arrays to store skill names

    // wizard specific constructor
    public Wizard(String name, int maxHp, int accuracy, int damage, int resistance ,int xp){
        super(name, maxHp, accuracy , damage, resistance, 0);
        this.name = getName();
        this.pet = GameLogic.pet;
        this.maxHp = 200;
        this.accuracy = AbstractSpell.accuracy;
        this.damage = AbstractSpell.damage;
        this.resistance = AbstractSpell.resistance;
        this.wand = Wand.wand;
        this.house = SortingHat.house;
        this.knownSpells = AbstractSpell.spells;
        this.potions = "Potion of life";
        this.gold = 5;
        this.restsleft = 1;
        this.pots = 0;
        this.xp = xp;

    }


    @Override
    public int attack() {
        if(Math.random()*100 +1 <= AbstractSpell.accuracy){
            System.out.println("You cast " + AbstractSpell.spells[AbstractSpell.input-1]+ "!");
            return AbstractSpell.damage;
        }else{
            System.out.println("You missed your spell!");
            return 0;

        }
    }

    @Override
    public int defend() {
        return AbstractSpell.resistance;
    }


}

