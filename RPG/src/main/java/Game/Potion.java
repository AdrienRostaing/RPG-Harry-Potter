package Game;



public class Potion {
    private static String name;
    static Wizard wizard;

    //Shopping method
    public static void shop(){
        GameLogic.clearConsole();
        GameLogic.printHeading("Welcome to the shop!");
        int price = (int)(Math.random()* (10 + wizard.pots*3) + 10 + wizard.pots);
        System.out.println("You can buy a potion for " + price + " gold.");
        GameLogic.printSeperator(1);
        System.out.println("(1) Buy a potion \n(2) Leave");
        int input = GameLogic.readInt("->", 2);
        if(input == 1){
            GameLogic.clearConsole();
            if(wizard.gold >= price){
                wizard.gold -= price;
                wizard.pots++;
                System.out.println("You bought a potion for " + price + " gold!");
                GameLogic.promptEnterKey();
            }
            else
                System.out.println("You don't have enough gold!");
            GameLogic.promptEnterKey();

        }
    }

}
