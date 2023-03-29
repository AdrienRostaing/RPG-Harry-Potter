package Game;

import java.util.ArrayList;
import java.util.Arrays;


public abstract class AbstractSpell {
    public static int damage;
    public static int resistance;
    public static int accuracy;
    public static String name;
    public static String type;
    public static int input;
    static String[] spells = {};
    static Spell spell;
    static ForbiddenSpell forbiddenSpell;
    static House houses;

    public AbstractSpell(String name, int damage, int accuracy, int resistance, String type) {
        this.name = name;
        this.damage = damage + (damage*houses.damageboost)/100;
        this.accuracy = accuracy + (accuracy*houses.accuracyboost)/100;
        this.resistance = resistance + (resistance*houses.resistanceboost)/100;
        this.type = type;
    }
    public static void learnSpell(String name){
        System.out.println("You have learnt a new spell: "+ name);
        ArrayList<String> arrlistObj =
                new ArrayList<String>(Arrays.asList(spells));

        // Add new element to the ArrayList
        arrlistObj.add(name);
        // Convert the ArrayList to Array
        spells = arrlistObj.toArray(spells);

    }
    public static void castSpell() {
        GameLogic.clearConsole();
        GameLogic.printHeading("Which spell would you like to cast?");
        for (int i = 0; i < spells.length; i++)
            System.out.println("(" + (i + 1) + ") " + spells[i]);
        input = GameLogic.readInt("->", spells.length);
        if (spells[input - 1] == "Wingardium Leviosa") {
            spell = new Spell("WingardiumLeviosa", damage = 10, accuracy = 100, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Expelliarmus") {
            spell = new Spell("Expelliarmus", 10, 100, 0, "attack");
        } else if (spells[input - 1] == "Protego") {
            spell = new Spell("Protego", damage = 10, accuracy = 100, resistance = 10, type = "defense");
        } else if (spells[input - 1] == "Stupefy") {
            spell = new Spell("Stupefy", damage = 30, accuracy = 80, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Sectumsempra") {
            spell = new Spell("Sectumsempra", damage = 40, accuracy = 70, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Avada Kedavra") {
            forbiddenSpell = new ForbiddenSpell("Avada Kedavra", damage = 100, accuracy = 50, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Crucio") {
            forbiddenSpell = new ForbiddenSpell("Crucio", damage = 50, accuracy = 90, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Imperio") {
            forbiddenSpell = new ForbiddenSpell("Imperio", damage = 45, accuracy = 100, resistance = 0, type = "attack");
        }
    }

    public static String getName() {
        return name;
    }

}
