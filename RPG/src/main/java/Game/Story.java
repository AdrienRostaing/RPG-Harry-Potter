package Game;

import java.util.Arrays;

public class Story {
    static Wand wand;
    static SortingHat sortingHat;
    static Wizard wizard;
    static House house;

    public static void Storyboard() {
        if (GameLogic.boss == 0) {
            outrotroll();
            GameLogic.boss++;
            printSecondActIntro();
            GameLogic.printMenu();
            GameLogic.gameLoop();

        } else if (GameLogic.boss == 1) {
            outrobasilisk();
            if (SortingHat.house == ("Gryffindor")) {
                outrogryffbasilisk();
            }
            GameLogic.boss++;
            printThirdActIntro();
            GameLogic.printMenu();
            GameLogic.gameLoop();

        } else if (GameLogic.boss == 2) {
            outrodementor();
            GameLogic.boss++;
            printFourthActIntro();
            GameLogic.printMenu();
            GameLogic.gameLoop();


        } else if (GameLogic.boss == 3) {
            outroweakvoldemortandpetergrew();
            GameLogic.boss++;
            printFifthActIntro();
            GameLogic.printMenu();
            GameLogic.gameLoop();

        } else if (GameLogic.boss == 4) {
            outrodoloresumbridge();
            GameLogic.boss++;
            printSixthActIntro();
            GameLogic.printMenu();
            GameLogic.gameLoop();

        } else if (GameLogic.boss == 5) {
            if (GameLogic.deatheater == true) {
                outroauror();
                GameLogic.boss++;
                printSixthActIntro();
                GameLogic.printMenu();
                GameLogic.gameLoop();
            } else {
                outrovoldemort();
                GameLogic.boss++;
                printSixthActIntro();
                GameLogic.printMenu();
                GameLogic.gameLoop();
            }


        } else if (GameLogic.boss == 6) {
            if (GameLogic.deatheater == true) {


                outroauror2();
                GameLogic.boss++;
                printSeventhActIntro2();
                GameLogic.printMenu();
                GameLogic.gameLoop();

            } else {
                outrovoldemort();
                GameLogic.boss++;
                printSeventhActIntro();
                GameLogic.printMenu();
                GameLogic.gameLoop();

            }

        } else if (GameLogic.boss == 7) {
            printEnd();
        }
    }

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
        GameLogic.clearConsole();
        GameLogic.textDelay("But first, we want to get to know you.");
        GameLogic.name();
        GameLogic.textDelay("Now, you need to choose your pet.");
        GameLogic.textDelay("You can choose between an owl, a rat, a cat, or a toad.");
        GameLogic.textDelay("Which pet do you choose?");
        GameLogic.petinialise();
        GameLogic.promptEnterKey();
        GameLogic.clearConsole();
        wand = new Wand();
        wand.wand();
        GameLogic.promptEnterKey();
        GameLogic.clearConsole();
        sortingHat = new SortingHat();
        sortingHat.sortingHat();
        house = new House();
        house.house();
        GameLogic.promptEnterKey();
        GameLogic.clearConsole();

    }
    public static void printFirstActIntro(){
        GameLogic.textDelay("You are now shown the " + SortingHat.house + " common room and living quarters.");
        GameLogic.textDelay("The older students are already there, and they are all talking about the recent increase in attacks by magical creatures.");
        GameLogic.textDelay("These attacks can happen at any time and anywhere.");
        GameLogic.textDelay("You are told to be careful and to always be on the lookout for any signs of danger.");
        GameLogic.promptEnterKey();
        GameLogic.clearConsole();
        GameLogic.printHeading("Later that week");
        AbstractSpell.learnSpell("Wingardium Leviosa");
        GameLogic.textDelay("This spell will allow you to levitate objects.");
        GameLogic.textDelay("You can use this spell to move objects around, or to move yourself around.");
        GameLogic.textDelay("You can also use this spell to move objects around in order to defeat your enemies.");
        GameLogic.promptEnterKey();
    }

    public static void printSecondActIntro(){
        GameLogic.printMenu();
        GameLogic.clearConsole();
        GameLogic.textDelay("This is your second year at Hogwarts.");
        GameLogic.textDelay("You return to " + SortingHat.house + " common room and living quarters.");
        GameLogic.textDelay("You are a second year now and the first years look up to you.");
        GameLogic.textDelay("You tell them what you were told during your first year.");
        GameLogic.textDelay("You tell them to be careful and to always be on the lookout for any signs of danger.");
        GameLogic.promptEnterKey();
        GameLogic.clearConsole();
        GameLogic.printHeading("Your teacher tells you that you will be learning a new spell today.");
        AbstractSpell.learnSpell("Accio");
        GameLogic.textDelay("This spell will allow you to summon objects.");
        GameLogic.textDelay("You can also use this spell to summon objects from a distance in order to defeat your enemies.");
        GameLogic.promptEnterKey();
    }
    public static void printThirdActIntro(){
        GameLogic.printMenu();
        GameLogic.clearConsole();
        GameLogic.textDelay("This is your third year at Hogwarts.");
        GameLogic.textDelay("You return to " + SortingHat.house + " common room and living quarters.");
        GameLogic.textDelay("You are a second year now and the first years look up to you.");
        GameLogic.textDelay("You tell them what you were told during your first year.");
        GameLogic.textDelay("You tell them to be careful and to always be on the lookout for any signs of danger.");
        GameLogic.promptEnterKey();
        GameLogic.clearConsole();
        GameLogic.printHeading("Later that week");
        AbstractSpell.learnSpell("Expecto Patronum");
        GameLogic.textDelay("This spell will release a Patronus, which will protect you from Dementors.");
        GameLogic.textDelay("It can also be used to defeat your enemies.");
        GameLogic.promptEnterKey();
    }
    public static void printFourthActIntro(){
        GameLogic.printMenu();
        GameLogic.clearConsole();
        GameLogic.textDelay("You return to " + SortingHat.house + " common room and living quarters.");
        GameLogic.textDelay("You are a second year now and the first years look up to you.");
        GameLogic.textDelay("You tell them what you were told during your first year.");
        GameLogic.textDelay("You tell them to be careful and to always be on the lookout for any signs of danger.");
        GameLogic.promptEnterKey();
        GameLogic.clearConsole();
        GameLogic.printHeading("During one of your classes in the defense against the dark arts, your teacher tells you");
        GameLogic.printHeading("that you need to learn an important spell.");
        AbstractSpell.learnSpell("Expelliarmus");
        GameLogic.textDelay("This spell will allow you to disarm your enemies and will skip their attacking turn if successful.");
        GameLogic.promptEnterKey();
    }
    public static void printFifthActIntro(){
        GameLogic.printMenu();
        GameLogic.clearConsole();
        GameLogic.textDelay("You return to " + SortingHat.house + " common room and living quarters.");
        GameLogic.textDelay("You are in your fifth year now.");
        GameLogic.textDelay("The events of last year have changed you and you are now more mature.");
        GameLogic.textDelay("You feel the need to expand your knowledge and learn new spells.");
        GameLogic.textDelay("Unfortunately, your new defense against the dark arts teacher, Delores Umbridge, refuses to teach you new spells.");
        GameLogic.promptEnterKey();
        GameLogic.clearConsole();
        GameLogic.printHeading("You decide to learn a new spell on your own.");
        AbstractSpell.learnSpell("Stupefy");
        GameLogic.textDelay("This spell will allow you to stun your enemies.");
        GameLogic.textDelay("It seems to be a very effective spell in combat.");
        GameLogic.promptEnterKey();
    }
    public static void printSixthActIntro(){
        GameLogic.printMenu();
        GameLogic.clearConsole();
        GameLogic.textDelay("You go to " + SortingHat.house + " common room and living quarters.");
        GameLogic.textDelay("You are in your sixth year at Hogwarts.");
        GameLogic.textDelay("You start your potions class with professor Slughorn and you are given an old potions book.");
        GameLogic.textDelay("Inside you find the inscription: \" This Book is the Property of the Half-Blood Prince \".");
        GameLogic.textDelay("You are intrigued by this book and wonder who this Half-Blood Prince might be.");
        GameLogic.promptEnterKey();
        GameLogic.clearConsole();
        GameLogic.printHeading("After going through the book you find a spell that you have never seen before.");
        AbstractSpell.learnSpell("Sectumsempra");
        GameLogic.textDelay("This spell will allow you to lacerates an enemy and causes severe hemorrhaging");
        GameLogic.textDelay("You can also use this spell to summon objects from a distance in order to defeat your enemies.");
        GameLogic.promptEnterKey();
    }
    public static void printSeventhActIntro(){
        GameLogic.printMenu();
        GameLogic.clearConsole();
        GameLogic.textDelay("You are in your seventh year but you do not return to Hogwarts");
        GameLogic.textDelay("You decide to go search for the horcruxes.");
        GameLogic.textDelay("This will allow you to defeat Voldemort once and for all.");
        GameLogic.textDelay("However, you will need to learn new spells in order to survive");
        GameLogic.promptEnterKey();
        GameLogic.clearConsole();
        GameLogic.printHeading("Along your journey,");
        AbstractSpell.learnSpell("Imperio");
        AbstractSpell.learnSpell("Crucio");
        AbstractSpell.learnSpell("Avada Kedavra");
        GameLogic.textDelay("Imperio spell will allow you to control your enemies, torture them and kill them.");
        GameLogic.textDelay("Cruciou spell will allow you to torture your enemies.");
        GameLogic.textDelay("Avada Kedavra spell will allow you to kill your enemies.");
        GameLogic.textDelay("These spells are known as the Unforgivable Curses and you can only use them as a last resort.");
        GameLogic.promptEnterKey();
    }

    public static void printSeventhActIntro2(){
        GameLogic.printMenu();
        GameLogic.clearConsole();
        GameLogic.textDelay("You are in your seventh year but you do not return to Hogwarts");
        GameLogic.textDelay("You are now part of the death eaters.");
        GameLogic.textDelay("Your objective now is to kill all wizards that get into the dark lords way.");
        GameLogic.textDelay("Your fellow death eaters are very powerful and think it's time for you to learn new spells.");
        GameLogic.promptEnterKey();
        GameLogic.clearConsole();
        GameLogic.printHeading("Along your journey,");
        AbstractSpell.learnSpell("Imperio");
        AbstractSpell.learnSpell("Crucio");
        AbstractSpell.learnSpell("Avada Kedavra");
        GameLogic.textDelay("Imperio spell will allow you to control your enemies, torture them and kill them.");
        GameLogic.textDelay("Cruciou spell will allow you to torture your enemies.");
        GameLogic.textDelay("Avada Kedavra spell will allow you to kill your enemies.");
        GameLogic.textDelay("These spells are known as the Unforgivable Curses but are necessary to kill all wizards that get in your way.");
        GameLogic.promptEnterKey();
    }

    public static void introtroll(){
        System.out.println("As you emerge victorious from your battles, your quest leads you deeper into the dark and foreboding dungeons.");
        System.out.println("Suddenly, you hear a loud thud echoing from the end of the corridor, and you instinctively take cover behind a nearby pillar.");
        System.out.println("As you pick around the corner, you catch a glimpse of the massive Troll lumbering towards you. You steel yourself for the fight of your life as you enter the 'Dungeon Bathrooms'.");
        System.out.println("Ready to face the Level 1 Boss and prove your worth as a true hero.");
        GameLogic.promptEnterKey();
    }

    public static void outrotroll() {
        System.out.println("Lifting nearby objects into the air and directing them towards the Troll's head.");
        System.out.println("Congratulations " + GameLogic.name + "!" + " You have successfully beat the troll!");
        System.out.println("You have just finished your first year at Hogwarts.");
        System.out.println("You have made a lot of friends, and you have learned a lot of new things.");
        System.out.println("You have also learned a lot about yourself.");
        GameLogic.promptEnterKey();
    }
    public static void printEnd() {
        System.out.println("Congratulations " + GameLogic.name + "!" + " You have successfully graduated from Hogwarts school of magic!");
        System.out.println("You have earned a total of " + wizard.xp + " xp.");
        GameLogic.promptEnterKey();
    }
    public static void acromantula(){
        GameLogic.clearConsole();
        GameLogic.textDelay( "As you walk through the dense forest, you hear a rustling sound from behind.");
        GameLogic.textDelay(" Turning around, you see a massive spider-like creature, an Acromantula, approaching you with its multiple eyes fixed upon you.");
        GameLogic.textDelay(" You quickly draw your wand and prepare to defend yourself against the fierce creature. ");
        GameLogic.textDelay("The Acromantula, sensing your presence, lets out a loud hiss and charges towards you with its razor-sharp legs.");

    }

    public static void snake(){
        GameLogic.textDelay("As you make your way through the tangled vines and thick foliage, you come across a dangerous creature, a giant snake.");
        GameLogic.textDelay("You know that this is no ordinary snake, for it is twice the size of any you had ever seen before, and its scales glint in the sunlight.");
        GameLogic.textDelay("The snake hisses, its forked tongue darting in and out, and you know that it is ready to strike");
    }
    public static void cerberus(){
        GameLogic.textDelay("You are wondering around the halls of Hogwarts when you come face to face with a ferocious Cerberus,");
        GameLogic.textDelay(" a three-headed dog with eyes glowing with malice.");
        GameLogic.textDelay("It's guarding the entrance to a room, and you know that the rare magical artifact you seek is inside.");
        GameLogic.textDelay("The Cerberus snarls and growls, its three sets of teeth bared, ready to attack.");
    }
    public static void dementor() {
        GameLogic.textDelay("While exploring the hogwarts grounds, you find yourself confronted by a Dementor, ");
        GameLogic.textDelay("a creature that feeds on human happiness and leaves despair in its wake.");
        GameLogic.textDelay("Its icy breath sends a chill down your spine, and you feel your happiest memories begin to slip away.");
    }
    public static void werewolf() {
        GameLogic.textDelay("You get lost in the forest and you find yourself face to face with a Werewolf, a creature with razor-sharp claws and fangs. ");
        GameLogic.textDelay("The moon is full, and the Werewolf is in its most dangerous form, ready to attack.");
        GameLogic.textDelay("The Werewolf charges towards you, its eyes glinting with malice.");
    }
    public static void dragon() {
        GameLogic.textDelay("You travel with Hogwarts to a distant land to study magical creatures!");
        GameLogic.textDelay("Out of nowhere, a mighty dragon appears, its scales gleaming in the sunlight.");
        GameLogic.textDelay("The dragon lets out a deafening roar, its fiery breath threatening to consume everything in its path.");
        GameLogic.textDelay("The dragon charges towards you, its wings beating furiously.");
    }
    public static void deatheater() {
        GameLogic.textDelay("You re walking through a dark forest, the rustling of leaves underfoot the only sound in the stillness.");
        GameLogic.textDelay("uddenly, you hear a rustling in the bushes nearby. You turn to face the sound, your wand at the ready.");
        GameLogic.textDelay("As you watch, a hooded figure emerges from the undergrowth, his wand pointed directly at you.");
        GameLogic.textDelay("You recognize him as a Death Eater, a follower of the dark lord Voldemort.");
    }
    public static void introbasilisk(){
        GameLogic.textDelay("You cautiously make your way through the dark and musty corridors of Hogwarts, your heart racing with anticipation and fear. " );
        GameLogic.textDelay("Your quest has led you to the infamous 'Chamber of Secrets', where an ancient and deadly creature lies in wait." );
        GameLogic.textDelay("You can hear the sound of its slithering body moving through the shadows, and you grip your wand tightly, preparing for the fight of your life." );
        GameLogic.textDelay("As you enter the chamber, you catch a glimpse of the creature's glowing eyes and razor-sharp fangs, and you know that this will be a battle like no other.");
        GameLogic.textDelay("With your courage and magic as your only weapons, you step forward to face the fearsome 'Basilisk', determined ");
        GameLogic.textDelay("to emerge victorious and save the school from its deadly grasp.");
        GameLogic.promptEnterKey();
    }
    public static void gryffbasilisk(){
        GameLogic.textDelay("While you try to defeat the basilisk, the sorting hat appears next to you.");
        GameLogic.textDelay("You look at it closely and in the hat you see a sword.");
        GameLogic.textDelay("You pick up the sword and read the inscription on it, \"GRYFFINDOR\"");
    }
    public static void outrogryffbasilisk(){
        GameLogic.textDelay("The gryffindor sword suddenly disappears from your hand.");
        AbstractSpell.sword("Gryffindor sword");
        GameLogic.promptEnterKey();
    }
    public static void outrobasilisk(){
        GameLogic.textDelay("You have defeated the Basilisk and saved Hogwarts from its deadly grasp.");
        GameLogic.textDelay("You have just finished your second year at Hogwarts.");
        GameLogic.textDelay("You have made a lot of friends, and you have learned a lot of new things.");
        GameLogic.textDelay("You have also learned a lot about yourself.");
        GameLogic.promptEnterKey();
    }

    public static void introdementor(){
        GameLogic.textDelay("You are walking through a dark forest, the rustling of leaves underfoot the only sound in the stillness.");
        GameLogic.textDelay("Suddenly, you hear a rustling in the bushes nearby. You turn to face the sound, your wand at the ready.");
        GameLogic.textDelay("As you watch, a hooded figure emerges from the undergrowth, his wand pointed directly at you.");
        GameLogic.textDelay("You recognize him as a Death Eater, a follower of the dark lord Voldemort.");
        GameLogic.textDelay("You know that you must defeat him before he can reach the school and wreak havoc upon the students.");
        GameLogic.textDelay("You step forward to face the Death Eater, determined to emerge victorious and save the school from his deadly grasp.");
        GameLogic.promptEnterKey();
    }
    public static void outrodementor(){
        GameLogic.textDelay("You have defeated the Death Eater and saved Hogwarts from his deadly grasp.");
        GameLogic.textDelay("You have just finished your third year at Hogwarts.");
        GameLogic.textDelay("You have made a lot of friends, and you have learned a lot of new things.");
        GameLogic.textDelay("You have also learned a lot about yourself.");
        GameLogic.promptEnterKey();
    }

    public static void introweakvoldemortandpetergrew(){
        GameLogic.textDelay("You find yourself walking through a dense forest, with nothing but the sound of twigs snapping beneath your feet to keep you company. Suddenly, you sense a presence behind you, and you turn around to face a dark, hooded figure.\n" +
                "\n" +
                "\"Who are you?\" you ask, taking a step back.\n" +
                "\n" +
                "The figure steps forward, revealing itself to be a powerful wizard known as Voldemort. \"I am Lord Voldemort,\" he hisses. \"And you are the only one who can defeat me.\"\n" +
                "\n" +
                "You raise your wand, ready for a fight");
    }
    public static void outroweakvoldemortandpetergrew(){
        GameLogic.textDelay("You have defeated Voldemort and Petter Petegrew.");
        GameLogic.textDelay("You have just finished your third year at Hogwarts.");
        GameLogic.textDelay("You have made a lot of friends, and you have learned a lot of new things.");
        GameLogic.textDelay("You have also learned a lot about yourself.");
        GameLogic.promptEnterKey();
    }
    public static void introdoloresumbridge(){
        GameLogic.textDelay("You find yourself standing in the middle of the Ministry of Magic, staring at a woman with a toad-like face and a sickly-sweet voice. It's Dolores Umbridge, the newest High Inquisitor of Hogwarts.\n" +
                "\n" +
                "\"I'm afraid I'm going to have to ask you to leave,\" she says in a falsely polite tone. \"You're not authorized to be here.\"\n" +
                "\n" +
                "You stand your ground, knowing that you're there for a reason. \"I have important business here,\" you say firmly.\n" +
                "\n" +
                "Umbridge's smile fades. \"I'm afraid I can't allow that. I have orders to keep this place secure.\"");
    }
    public static void outrodoloresumbridge(){
        GameLogic.textDelay("You have defeated Dolores Umbridge.");
        GameLogic.textDelay("You have just finished your sixth year at Hogwarts.");
        GameLogic.textDelay("You have made a lot of friends, and you have learned a lot of new things.");
        GameLogic.textDelay("You have also learned a lot about yourself.");
        GameLogic.promptEnterKey();
    }

    public static void introvoldemort(){
        GameLogic.textDelay("Ah, it seems we have a challenger,\" he says, his voice silky and menacing. \"Tell me, what brings you here?\"\n" +
                "\n" +
                "You steel yourself, knowing that you're the only one who can defeat him. \"I'm here to stop you,\" you say firmly.\n" +
                "\n" +
                "Voldemort laughs. \"You? Stop me? Don't make me laugh.\"");
    }
    public static void outrovoldemort(){
        GameLogic.textDelay("You have defeated Voldemort.");
        GameLogic.textDelay("You have just finished your seventh year at Hogwarts.");
        GameLogic.textDelay("You have made a lot of friends, and you have learned a lot of new things.");
        GameLogic.textDelay("You have also learned a lot about yourself.");
        GameLogic.promptEnterKey();
    }
    public static void introdeatheater(){
        GameLogic.textDelay("You find yourself walking through a dark forest, the branches of the trees above you blocking out the light of the full moon. " +
                "As you continue to make your way through the twisted undergrowth, you sense a growing feeling of unease in the pit of your stomach. You know that danger is near.\n" +
                "\n" +
                "Suddenly, you hear a rustling in the bushes ahead of you. You freeze, your wand at the ready. " +
                " As the sound grows louder, you begin to see the shapes of several figures emerging from the darkness. Death Eaters.");
    }
    public static void outrodeatheater(){
        GameLogic.textDelay("You have defeated the Death Eaters.");
        GameLogic.textDelay("You have just finished your sixth year at Hogwarts.");
        GameLogic.textDelay("You have made a lot of friends, and you have learned a lot of new things.");
        GameLogic.textDelay("You have also learned a lot about yourself.");
        GameLogic.promptEnterKey();
    }
    public static void introauror(){
        GameLogic.textDelay("You find yourself standing in the middle of a dark forest, the moonlight filtering through the trees above you. " +
                "You know that you're here for a reason, but you're not sure what it is. Suddenly, you hear a rustling in the bushes behind you. " +
                "You turn around, your wand at the ready, and see a figure emerging from the darkness. It's an Auror, a member of the Ministry of Magic's elite law enforcement squad.\n" +
                "\n" +
                "\"What are you doing here?\" the Auror asks, his wand pointed at you. \"This is a restricted area.\"\n" +
                "\n" +
                "You raise your wand, ready for a fight. \"I'm here to stop you,\" you say firmly.");
    }
    public static void outroauror(){
        GameLogic.textDelay("You have defeated the Auror.");
        GameLogic.textDelay("You have just finished your sixth year at Hogwarts.");
        GameLogic.textDelay("You can't go back to Hogwarts as you have joined the death eaters.");
        GameLogic.promptEnterKey();
    }

    public static void introauror2(){
        GameLogic.textDelay("The battle of Hogwarts is raging. You see wizards on both sides fighting to the death");
        GameLogic.textDelay("You see a wizard on the other side of the battlefield. He isn't wearing a black cloak and has a wand in his hand.");
        GameLogic.textDelay("He is clearly a powerful Auror. He approches you and says: I am Auror Kingsley Shacklebolt. I am here to stop you.");
        GameLogic.textDelay("You both draw your wands and prepare to fight.");
    }

    public static void outroauror2(){
        GameLogic.textDelay("You have defeated the Auror.");
        GameLogic.textDelay("The battle of Hogwarts is over.");
        GameLogic.textDelay("Voldemort and the death eaters have won. All celebrate the victory of the dark lord.");
        GameLogic.promptEnterKey();
    }

}
