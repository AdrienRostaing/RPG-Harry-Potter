package Game;

public class House {
    public int potionboost;
    public int damageboost;
    public int resistanceboost;
    public int accuracyboost;
    public String boostedstat = "boostedstat";

    public static final String[] HOUSES = {"Gryffindor", "Ravenclaw", "Hufflepuff", "Slitherin"};


    public void house() {
        if(SortingHat.house == ("Gryffindor")){
            this.potionboost = 0;
            this.damageboost = 0;
            this.resistanceboost = 25;
            this.accuracyboost = 0;
            this.boostedstat = "resistance";
        }
        else if(SortingHat.house ==("Ravenclaw")){
            this.potionboost = 0;
            this.damageboost = 25;
            this.resistanceboost = 0;
            this.accuracyboost = 0;
            this.boostedstat = "damage";
        }
        else if(SortingHat.house ==("Hufflepuff")){
            this.potionboost = 25;
            this.damageboost = 0;
            this.resistanceboost = 0;
            this.accuracyboost = 0;
            this.boostedstat = "potion";
        }
        else if(SortingHat.house ==("Slitherin")){
            this.potionboost = 0;
            this.damageboost = 0;
            this.resistanceboost = 0;
            this.accuracyboost = 25;
            this.boostedstat = "accuracy";
        }
        GameLogic.textDelay("The house comes with a booost to certain stats.");
        GameLogic.textDelay(SortingHat.house + " gives you a 25% boost" + " to your " + boostedstat + " stat.");
    }


}