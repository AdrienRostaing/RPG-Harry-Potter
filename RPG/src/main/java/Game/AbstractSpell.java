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

    public AbstractSpell(String name, int damage, int accuracy, int resistance, String type) {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.resistance = resistance;
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

    public static void sword(String name) {
        ArrayList<String> arrlistObj =
                new ArrayList<String>(Arrays.asList(spells));

        // Add remove element to the ArrayList
        arrlistObj.remove(name);
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
        } else if (spells[input - 1] == "Accio") {
            spell = new Spell("Accio", damage = 20, accuracy = 80, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Expecto Patronum") {
            spell = new Spell("Expecto Patronum", damage = 30, accuracy = 70, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Sectumsempra") {
            spell = new Spell("Sectumsempra", damage = 40, accuracy = 60, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Stupefy") {
            spell = new Spell("Stupefy", damage = 50, accuracy = 55, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Avada Kedavra") {
            forbiddenSpell = new ForbiddenSpell("Avada Kedavra", damage = 100, accuracy = 40, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Crucio") {
            forbiddenSpell = new ForbiddenSpell("Crucio", damage = 60, accuracy = 50, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Imperio") {
            forbiddenSpell = new ForbiddenSpell("Imperio", damage = 70, accuracy = 40, resistance = 0, type = "attack");
        } else if (spells[input - 1] == "Gryffindor sword"){
            spell = new Spell("Gryffindor sword", damage = 30, accuracy = 80, resistance = 0, type = "attack");
        }

    }

    public static String getName() {
        return name;
    }

}
