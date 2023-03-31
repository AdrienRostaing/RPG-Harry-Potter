package Game;




import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;




public class GameLogic {
    public static String pet;
    public static String name;
    static Scanner scanner = new Scanner(System.in);
    static Wizard wizard;

    static Enemy enemy;

    //story elements
    public static int place = 0;
    public static String[] places = {"Dungeon bathrooms", "Chamber of secrets", "Lake in forbidden forrest",
            "Little Hangleton cemetery","Exam room Hogwarts", "Astronomy tower", "Hogwarts"};
    public static int boss = 0;
    public static String newspell;

    //random encounters
    public static String[] encounters = {"Battle", "Battle", "Battle", "Professor", "Rest", "Battle"};
    //enemy names
    public static String[] enemyNames = {};
    public static boolean isRunning;

    public static int level = 1;



    //method to get user input from console
    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter integer!");
            }

        } while (input < 1 || input > userChoices);
        return input;

    }
    public static void textDelay(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            delay(5);
        }
        System.out.println("");
    }

    public static void delay(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // method to simulate clearing out the console
    public static void clearConsole() {
        for (int i = 0; i < 100; i++)
            System.out.println();
    }

    // method to print a separator with length n
    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();

    }

    // method to print a heading
    public static void printHeading(String title) {
        printSeperator(1);
        System.out.println(title);
        printSeperator(1);

    }

    //method to stop the game until user enters anything
    public static void promptEnterKey(){
        System.out.println("Appuyez sur Entrée pour continuer...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public static void removeElement(Object[] arr, int removedIdx) {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
    }



    public static void name() {
        boolean nameSet;
        nameSet = false;
        do {
            textDelay("What is your name?");
            name = scanner.next();
            // verifying if correct name
            printHeading("Your name is " + name + "\nIs that correct?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No, I want to change my name.");
            int input = readInt("->", 2);
            if (input == 1)
                nameSet = true;
        }while (!nameSet);
    }







    public static void petinialise(){
        boolean petSet;
        petSet = false;
        do {
            for(int i = 0; i < Pet.PETS.length; i++)
                System.out.println("("+(i+1)+ ") "+Pet.PETS[i]);
            int input = readInt("->", Pet.PETS.length);
            if (input == 1)
                petSet = true;
            else if (input == 2)
                petSet = true;
            else if (input == 3)
                petSet = true;
            else if (input == 4)
                petSet = true;
            else
                System.out.println("Invalid input");
            pet =  Pet.PETS[input - 1];
            System.out.println("You have chosen " + pet + " as your pet. Please give him a name.");
            String petName;
            petName= scanner.next();
            System.out.println("You have named your pet " + petName + ".");
        } while (!petSet);

    }

    //Method to start the game
    public static void startGame() {
        Story.printIntro();
        wizard = new Wizard(name, 200,1,0,1,0 );
        Story.printFirstActIntro();
        //setting is Running  to true, so the game loop
        isRunning = true;

        //start main game loop can continue
        printMenu();
        gameLoop();

    }

    //method that changes the game if you beat the boss
    public static void checkAct(){
        GameLogic.clearConsole();

        //change acts based on boss fight
        if(boss == 0) {
            encounters = new String[]{"Battle", "Battle", "Shop", "Rest", "Battle"};
            enemyNames = new String[]{"Snake", "Acromantula", "cerberus"};
            if (wizard.xp >= 50) {
                wizard.hp = wizard.maxHp;
                Story.introtroll();
                enemy.boss();
                battle(Boss.boss);
                wizard.hp = wizard.maxHp;
            }
            randomEncounter();
        }else if(boss == 1) {
            Story.outrotroll();
            Story.printSecondActIntro();
            newspell = "Expelliarmus";
            encounters = new String[]{"Battle", "Battle", "Shop", "Rest", "Battle"};
            enemyNames = new String[]{"Snake", "Acromantula", "cerberus"};
            if (wizard.xp >= 175) {
                wizard.hp = wizard.maxHp;
                Story.introbasilisk();
                if (SortingHat.house == ("Gryffindor"))
                    Story.gryffbasilisk();
                    AbstractSpell.learnSpell("Gryffindor sword");
                enemy.boss();
                battle(Boss.boss);
                wizard.hp = wizard.maxHp;


            }
            randomEncounter();

        }else if(boss == 2){
            Story.outrobasilisk();
            Story.printThirdActIntro();
            encounters = new String[]{"Battle", "Battle", "Shop", "Rest", "Battle"};
            enemyNames = new String[]{"Snake", "Acromantula", "cerberus", "Dementor"};
            if (wizard.xp >= 350) {
                Story.introdementor();
                enemy.boss();
                battle(Boss.boss);
                wizard.hp = wizard.maxHp;
            }
            randomEncounter();
        }else if(boss == 3){
            Story.outrodementor();
            Story.printFourthActIntro();
            encounters = new String[]{"Battle", "Battle", "Shop", "Rest", "Battle"};
            enemyNames = new String[]{"Snake", "Acromantula", "cerberus", "Dementor", "Werewolf"};
            if (wizard.xp >= 550) {
                Story.introweakvoldemortandpetergrew();
                enemy.boss();
                battle(Boss.boss);
                wizard.hp = wizard.maxHp;


            }
            randomEncounter();
        }else if(boss == 4){
            Story.outroweakvoldemortandpetergrew();
            Story.printFifthActIntro();
            encounters = new String[]{"Battle", "Battle", "Shop", "Rest", "Battle"};
            enemyNames = new String[]{"Snake", "Acromantula", "cerberus", "Dementor", "Werewolf", "Dragon"};
            if (wizard.xp >= 850) {
                Story.introdoloresumbridge();
                enemy.boss();
                battle(Boss.boss);
                wizard.hp = wizard.maxHp;


            }
        }else if(boss == 5){
            Story.outrodoloresumbridge();
            Story.printSixthActIntro();
            encounters = new String[]{"Battle", "Battle", "Shop", "Rest", "Battle"};
            enemyNames = new String[]{"Snake", "Acromantula", "cerberus", "Dementor", "Werewolf", "Dragon", "Death Eater"};
            if (wizard.xp >= 1250) {
                Story.introdeatheater();
                enemy.boss();
                battle(Boss.boss);
                wizard.hp = wizard.maxHp;



            }
            randomEncounter();
        }else if(boss == 6){
            Story.outrodeatheater();
            Story.printSeventhActIntro();
            encounters = new String[]{"Battle", "Battle", "Shop", "Rest", "Battle"};
            enemyNames = new String[]{"Snake", "Acromantula", "cerberus", "Dementor", "Werewolf", "Dragon", "Death Eater"};
            if (wizard.xp >= 1800) {
                Story.introvoldemort();
                enemy.boss();
                battle(Boss.boss);
                wizard.hp = wizard.maxHp;
                printMenu();
            }
            randomEncounter();


    }else if (boss == 7){
        Story.outrovoldemort();
        Story.printEnd();
        isRunning = false;
        }

    }


    //method to calculate random encounters
    public static void randomEncounter(){
        //random encounter
        Random random = new Random();
        //random number between 0 and length of encounters array
        int encounter = random.nextInt(encounters.length);
        printHeading("Encounter");
        if(encounters[encounter].equals("Battle")){
            //create enemy
            promptEnterKey();
            randomBattle();

        }
        else if(encounters[encounter].equals("Rest")){
            //rest
            promptEnterKey();
            takeRest();
        }
        else if(encounters[encounter].equals("Shop")){
            //shop
            promptEnterKey();
            Potion.shop();
        }


    }



    //method to print character info
    public static void characterInfo(){
        boolean returnmenu;
        clearConsole();
        printHeading("Character Info");
        System.out.println("Name: " + wizard.name);
        System.out.println("House: " + wizard.house);
        System.out.println("Pet: "+ wizard.pet);
        System.out.println("Wand core and size: " + wizard.wand);
        System.out.println("Known-spells: " + (Arrays.toString(wizard.knownSpells)));
        System.out.println("Potions: " + wizard.potions + " "+ Potion.pots);
        System.out.println("HP: " + wizard.hp + "/" + wizard.maxHp);
        promptEnterKey();
        returnmenu = true;
        if (returnmenu == true){
            clearConsole();
            printMenu();
        }
    }
    public static void printMenu(){
        clearConsole();
        printHeading("Main Menu");
        System.out.println(places[place]);
        System.out.println("Choose an action: ");
        printSeperator(1);
        System.out.println("(1) Continue Journey");
        System.out.println("(2) Character Info");
        System.out.println("(3) Exit Game");

    }


    public static void takeRest() {
        clearConsole();
        if (wizard.restsleft >= 1){
            printHeading("Do you want to take a rest? (" + wizard.restsleft + " rests left)");
            System.out.println("(1) Yes \n(2) No");
            int input = readInt("->", 2);
            if (input == 1)
                clearConsole();
            if (wizard.hp < wizard.maxHp) {
                int hpRestored = (int) (Math.random() * (wizard.xp / 4 + 1) + 10);
                wizard.hp += hpRestored;
                if (wizard.hp > wizard.maxHp) {
                    wizard.hp = wizard.maxHp;
                    System.out.println("You recovered " + hpRestored + " HP!");
                    System.out.println("You now have " + wizard.hp + " HP!");
                    wizard.restsleft--;
                    promptEnterKey();
                }
            }else
                System.out.println("You are at full HP! You don't need to rest!");

        }else {
            System.out.println("You have no rests left!");
        }
        promptEnterKey();
        randomEncounter();
    }


    public static void randomBattle(){
        enemy.enemy();
        battle(Enemy.enemy);
    }

    //method to start a battle
    public static void battle(AbstractEnemy enemy){
        //start battle
        while(true){
            clearConsole();
            printHeading(enemy.name + " HP: " + enemy.hp + "/" + enemy.maxHp);
            printHeading(wizard.name + " HP: " + wizard.hp + "/" + wizard.maxHp);
            System.out.println("Choose an action: ");
            printSeperator(1);
            System.out.println("(1) Attack \n(2) Potions \n(3) Run");
            int input = readInt("->", 3);
            //react according to the input
            if (input == 1){
                Spell.castSpell();
                System.out.println();
                //Fight
                //calcultaing the damage and damage reduction
                int dmg = wizard.attack() - enemy.defend();
                int dmgTook = enemy.attack() - wizard.defend();
                //check if the damage is negative
                if(dmg < 0){
                    //add some damage if player defends well
                    dmg -= dmgTook/2;
                    dmgTook = 0;
                }
                if(dmg < 0)
                    //set damage to 0 if it is negative
                    dmg = 0;
                if(dmgTook < 0)
                    //set damage to 0 if it is negative
                    dmgTook = 0;
                //deal dmg to both parties
                wizard.hp -= dmgTook;
                enemy.hp -= dmg;
                //print the info of this battle round
                clearConsole();
                printHeading("You used " + AbstractSpell.spells[AbstractSpell.input-1] + "!"
                + "\n You attacked " + enemy.name + " for " + dmg + " damage!");
                printHeading(enemy.name + " attacked you for " + dmgTook + " damage!");
                promptEnterKey();
                //check if battle is over
                if(wizard.hp <= 0){
                    //player lost
                    wizardDied();
                    break;
                }else if(enemy.hp <= 0){
                    if (enemy.name == "Basilisk" || enemy.name == "Troll" || enemy.name == "Death Eater" || enemy.name == "Voldemort"
                            || enemy.name == "Hord of Dementors" || enemy.name == "Weak Voldemort and Peter Pettigrew" || enemy.name == "Dolores Umbridge"){
                        boss += 1;
                    }
                    //player won
                    clearConsole();
                    printHeading("You defeated " + enemy.name + "!");
                    //add xp
                    wizard.xp += enemy.xp;
                    System.out.println("You gained " + enemy.xp + " xp!");
                    boolean addRest = (Math.random()*5 + 1 <= 2.25);
                    int goldEarned = (int)(Math.random()*enemy.xp);
                    printHeading("What would you like to upgrade?");
                    System.out.println("(1) Damage \n(2) LifePoints");
                    int input2 = readInt("->", 3);
                    if(input2 == 1){
                        //upgrade damage
                        wizard.damage += 2;
                        System.out.println("You upgraded your damage by 2!");
                    }else if(input2 == 2) {
                        //upgrade hp
                        wizard.maxHp += 5;
                        wizard.hp += 5;
                        System.out.println("You upgraded your max HP by 5!");
                    }
                    if (addRest){
                        //add rest
                        wizard.restsleft++;
                        System.out.println("You found a rest spot!");
                        wizard.hp = wizard.maxHp;
                    }
                    if(goldEarned > 0){
                        //add gold
                        Potion.gold += goldEarned;
                        System.out.println("You found " + goldEarned + " gold from " + enemy.name + "!");
                    }
                    promptEnterKey();
                    break;
                }
            }else if(input == 2) {
                //use potion
                clearConsole();
                printHeading("Do you want to use a potion? (" + Potion.pots + " left)");
                System.out.println("(1) Yes \n(2) No");
                input = readInt("->", 2);
                if (input == 1) {
                    if (Potion.pots > 0 && wizard.hp < wizard.maxHp) {
                        //use potion
                        Potion.pots--;
                        wizard.hp += 30 + (30*House.potionboost)/100;
                        if (wizard.hp > wizard.maxHp)
                            wizard.hp = wizard.maxHp;
                        printHeading("You used a potion back to " + wizard.hp + " hp");
                        promptEnterKey();
                    } else {
                        //no potions
                        printHeading("You don't have any potions or you are full hp!");
                        promptEnterKey();

                    }
                }
            }
            else if(input == 3){
                clearConsole();
                //Chance of escape = 50%
                if(Math.random()*10 + 1 <= 5){
                    printHeading("You ran away from " + enemy.name + "!");
                    promptEnterKey();
                    break;
                }else{
                    printHeading("You couldn't escape from " + enemy.name + "!");
                    int dmgTook = enemy.attack();
                    System.out.println("You took " + dmgTook + " damage!");
                    promptEnterKey();
                    if(wizard.hp <= 0) {
                        //player lost
                        wizardDied();
                        break;
                    }
                }
            }
        }
        System.out.println(boss);

        checkAct();

    }

    public static void wizardDied(){
        //print the death screen
        clearConsole();
        printHeading("You died");
        System.out.println("You earned " + wizard.xp + " xp on your journey. Try better next time. ");
        System.out.println("Hope you had fun at Hogwarts and see you next time. ");
        promptEnterKey();
        //exit the game
        System.exit(0);
    }
    public static void gameLoop(){
        while(isRunning){
            //print the main menu

            int input = readInt("->",3);
            if(input == 1){
                //start the game
                checkAct();
            }else if(input == 2){
                characterInfo();
                //exit the game
            }else if(input == 3){
                isRunning = false;
            }
        }
    }
}

