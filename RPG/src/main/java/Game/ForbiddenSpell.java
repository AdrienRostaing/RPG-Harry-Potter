package Game;

public class ForbiddenSpell extends AbstractSpell{


    public ForbiddenSpell(String name, int damage, int accuracy, int resistance, String type) {
        super(name, damage, accuracy, resistance, type);
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
        this.resistance = resistance;
        this.type = type;

    }



}