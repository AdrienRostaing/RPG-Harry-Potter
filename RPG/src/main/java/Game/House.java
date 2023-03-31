package Game;

public class House {
    public static int potionboost = 0;
    public static int damageboost = 0;
    public static int resistanceboost = 0;
    public static int accuracyboost = 0;
    public String boostedstat = "boostedstat";

    public static final String[] HOUSES = {"Gryffindor", "Ravenclaw", "Hufflepuff", "Slitherin"};


    public void house() {
        if(SortingHat.house == ("Gryffindor")){
            resistanceboost = 5;
            boostedstat = "resistance";
        }
        else if(SortingHat.house ==("Slitherin")){
            damageboost = 25;
            boostedstat = "damage";
        }
        else if(SortingHat.house ==("Hufflepuff")){
            this.potionboost = 25;
            boostedstat = "potion";
        }
        else if(SortingHat.house ==("Ravenclaw")){
            this.accuracyboost = 25;
            boostedstat = "accuracy";
        }
        GameLogic.textDelay("The house comes with a booost to certain stats.");
        GameLogic.textDelay(SortingHat.house + " gives you a 25% boost" + " to your " + boostedstat + " stat.");
    }


}