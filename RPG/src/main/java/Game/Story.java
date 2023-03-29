package Game;

import java.util.Arrays;

public class Story {
    static Wand wand;
    static SortingHat sortingHat;
    static Wizard wizard;
    static House house;
    public static void printIntro() {
        //print title screen
        System.out.println("     ___      ___         _          ________      ________    __       __             ________     ________     ____________    ____________    __________     ________              ");
        System.out.println("     | |      | |        / \\        / /    \\ \\    / /    \\ \\   \\ \\     / /            / /    \\ \\   / /_____\\ \\  |____________|  |____________|  |  ________|   / /    \\ \\          ");
        System.out.println("     | |      | |       / _ \\       | |     | |   | |     | |   \\ \\   / /             | |     | |  | |     | |        | |             | |       | |            | |     | |                   ");
        System.out.println("     | |______| |      / / \\ \\      | |____/ /    | |____/ /     \\_\\ /_/              | |____/ /   | |     | |        | |             | |       | |________    | |____/ /         ");
        System.out.println("     | |______| |     / /___\\ \\     | |___/ /     | |___/ /        | |                | |___/_/    | |     | |        | |             | |       |  ________|   | |___/ /");
        System.out.println("     | |      | |    / /_____\\ \\    | |   \\ \\     | |   \\ \\        | |                | |          | |     | |        | |             | |       | |            | |   \\ \\      ");
        System.out.println("     | |      | |   / /       \\ \\   | |    \\ \\    | |    \\ \\       | |                | |          | |_____| |        | |             | |       | |________    | |    \\ \\             ");
        System.out.println("     |_|      |_|  /_/         \\_\\  |_|     \\_\\   |_|     \\_\\      |_|                |_|          \\_\\_____/_/        |_|             |_|       |__________|   |_|     \\_\\                             ");
        System.out.println("                                                                                                                          ");
        System.out.println("                                                                               /-\\                                  ");
        System.out.println("                                                                              /   \\                            ");
        System.out.println("                                                                             /     \\                         ");
        System.out.println("                                                                            /       \\                         ");
        System.out.println("                                                                           /         \\                       ");
        System.out.println("                                                                          /           \\                      ");
        System.out.println("                                                                         /             \\                      ");
        System.out.println("                                                                        /               \\                      ");
        System.out.println("                                                                       /                 \\                      ");
        System.out.println("                                                                      /                   \\                      ");
        System.out.println("                                                                     /                     \\                      ");
        System.out.println("                                                                    /                       \\                      ");
        System.out.println("                                                                 |||||||||||||||||||||||||||||||                     ");
        System.out.println("                                                                      |                   |            ");
        System.out.println("                                                                      |    __       __    |            ");
        System.out.println("                                                                     /|   |  |     |  |   |\\       ");
        System.out.println("                                                                     \\|   |__| / \\ |__|   |/          ");
        System.out.println("                                                                      |       /___\\       |         ");
        System.out.println("                                                                      |                   |         ");
        System.out.println("                                                                       \\     _______     /         ");
        System.out.println("                                                                        \\   [_______]   /         ");
        System.out.println("                                                                         \\             /         ");
        System.out.println("                                                                          \\___________/         ");

        GameLogic.printHeading("                                                                        HARRY POTTER AT HOME"
                + "\n                                                           A game created and designed by Adrien Rostaing");
        System.out.println(" ");

        GameLogic.promptEnterKey();
        GameLogic.textDelay("Welcome to the magical world of Harry Potter!");
        GameLogic.textDelay("You are a young wizard, and you have just been accepted to Hogwarts School of Witchcraft and Wizardry.");
        GameLogic.textDelay("Soon, you will start your first year at Hogwarts.");
        GameLogic.textDelay("I hope you will have lots of fun and learn a lot of new things about the magical world of Harry Potter.");
        GameLogic.textDelay("But be careful, there are many dangers in the magical world.");
        GameLogic.promptEnterKey();
        GameLogic.textDelay("But first, we want to get to know you.");
        GameLogic.name();
        GameLogic.textDelay("Now, you need to choose your pet.");
        GameLogic.textDelay("You can choose between an owl, a rat, a cat, or a toad.");
        GameLogic.textDelay("Which pet do you choose?");
        GameLogic.petinialise();
        GameLogic.promptEnterKey();
        wand = new Wand();
        wand.wand();
        GameLogic.promptEnterKey();
        sortingHat = new SortingHat();
        sortingHat.sortingHat();
        house = new House();
        house.house();
        GameLogic.promptEnterKey();


    }
    public static void printFirstActIntro(){
        GameLogic.textDelay("You are now shown the " + SortingHat.house + " common room and living quarters.");
        GameLogic.textDelay("The older students are already there, and they are all talking about the recent increase in attacks by magical creatures.");
        GameLogic.textDelay("These attacks can happen at any time and anywhere.");
        GameLogic.textDelay("You are told to be careful and to always be on the lookout for any signs of danger.");
        GameLogic.promptEnterKey();
        GameLogic.printHeading("Later that week");
        AbstractSpell.learnSpell("Wingardium Leviosa");
        GameLogic.textDelay("This spell will allow you to levitate objects.");
        GameLogic.textDelay("You can use this spell to move objects around, or to move yourself around.");
        GameLogic.textDelay("You can also use this spell to move objects around in order to defeat your enemies.");
        GameLogic.textDelay("You are walking inside the castle when you see... ");
        GameLogic.randomEncounter();
        GameLogic.textDelay("WOW! That was a close one! You are lucky to be alive!");
        GameLogic.printSeperator(1);
        GameLogic.textDelay("the dead "+ GameLogic.enemyNames[AbstractEnemy.numenemy]+" is lying on the ground in front of you.");

    }

    public static void printFirstActOutro() {
        System.out.println("Congratulations " + GameLogic.name + "!" + " You have successfully beat the troll!");
        System.out.println("You have just finished your first year at Hogwarts.");
        System.out.println("You have made a lot of friends, and you have learned a lot of new things.");
        System.out.println("You have also learned a lot about yourself.");

    }
    public static void printEnd() {
        System.out.println("Congratulations " + GameLogic.name + "!" + " You have successfully graduated from Hogwarts school of magic!");
        System.out.println("You have earned a total of " + wizard.xp + " xp.");

    }
}
