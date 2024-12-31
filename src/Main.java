import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\n\nMinecraft Word Jumble!");
        System.out.println("\nA jumbled word will appear and it is your job to guess it!");
        System.out.println("\nThree tries per word, three words total!");
        System.out.println("\nLess guesses equates to a better score");

        System.out.println("Ready?");

        String Word = "";
        String Jumble = "";
        String Guess;
        boolean correct = false;
        int gNum = 0;
        int score = 10;
        boolean showSystemProperties = false;


        System.out.println("\n\nRound 1");
        System.out.println("__________\n");

        int randomizer = rand.nextInt(10)+1;

        switch(randomizer)
            {
            case 1:
                Word = "minecraft";
                Jumble = "ecfranmit";
                break;
            case 2:
                Word = "pig";
                Jumble = "igp";
                break;
            case 3:
                Word = "cow";
                Jumble = "wco";
                break;
            case 4:
                Word = "bucket";
                Jumble = "kutebc";
                break;
            case 5:
                Word = "nether";
                Jumble = "reenht";
                break;
            case 6:
                Word = "creeper";
                Jumble = "eeerrcp";
                break;
            case 7:
                Word = "snow";
                Jumble = "onws";
                break;
            case 8:
                Word = "skeleton";
                Jumble = "ktoeslne";
                break;
            case 9:
                Word = "wolf";
                Jumble = "flow";
                break;
            case 10:
                Word = "horse";
                Jumble = "rsohe";
                break;
            }

        for (int i = 1; i <= 3; i++)
            {
            gNum = i;
            System.out.println("\nUnscramble: " + Jumble);
            Guess = sc.next();

            if(Guess.equalsIgnoreCase(Word))
                {
                correct = true;
                break;
                }
            }

            if (correct)
                {
                System.out.println("\n\nCongratulations!\n\nIt took " + gNum + " attempts to correctly guess the word" +
                        " " + Word + "!");
                score -= 4;
                score =+ gNum;
                }
            else
                {
                System.out.println("\n\nOut of tries...\n\nSorry, the correct word that is scrambled up is " + Word +
                        ".");
                }

        // Round 2
        System.out.println("\n\nRound 2");
        System.out.println("__________\n");

        correct = false;

        randomizer = rand.nextInt(10)+1;

        switch(randomizer)
            {
            case 1:
                Word = "rabbit";
                Jumble = "britba";
                break;
            case 2:
                Word = "zombie";
                Jumble = "meiboz";
                break;
            case 3:
                Word = "chicken";
                Jumble = "nickceh";
                break;
            case 4:
                Word = "glass";
                Jumble = "sgals";
                break;
            case 5:
                Word = "dirt";
                Jumble = "trid";
                break;
            case 6:
                Word = "iron";
                Jumble = "orin";
            case 7:
                Word = "potato";
                Jumble = "aootpt";
                break;
            case 8:
                Word = "allay";
                Jumble = "yalla";
                break;
            case 9:
                Word = "villager";
                Jumble = "ieaglvlr";
                break;
            case 10:
                Word = "furnace";
                Jumble = "faurenc";
                break;
            }

        for (int i = 1; i <= 3; i++)
            {
            gNum = i;
            System.out.println("\nUnscramble: " + Jumble);
            Guess = sc.next();

            if(Guess.equalsIgnoreCase(Word))
                {
                correct = true;
                break;
                }
            }

        if (correct)
            {
            System.out.println("\n\nCongratulations!\n\nIt took " + gNum + " attempts to correctly guess the word" +
                    " " + Word + "!");
            score -= 4;
            score =+ gNum;
            }
        else
            {
            System.out.println("\n\nOut of tries...\n\nSorry, the correct word that is scrambled up is " + Word +
                    ".");
            }

        // Round 3
        System.out.println("\n\nRound 3");
        System.out.println("__________\n");

        correct = false;

        randomizer = rand.nextInt(10)+1;

        switch(randomizer)
            {
            case 1:
                Word = "grass";
                Jumble = "srgsa";
                break;
            case 2:
                Word = "mooshroom";
                Jumble = "omoohrmos";
                break;
            case 3:
                Word = "mojang";
                Jumble = "nmogja";
                break;
            case 4:
                Word = "notch";
                Jumble = "tncoh";
                break;
            case 5:
                Word = "sheep";
                Jumble = "hespe";
                break;
            case 6:
                Word = "carrot";
                Jumble = "rctaro";
            case 7:
                Word = "enderman";
                Jumble = "mendnera";
                break;
            case 8:
                Word = "llama";
                Jumble = "mllaa";
                break;
            case 9:
                Word = "strider";
                Jumble = "drtesir";
                break;
            case 10:
                Word = "saddle";
                Jumble = "dsdael";
                break;
            }

        for (int i = 1; i <= 3; i++)
            {
            gNum = i;
            System.out.println("\nUnscramble: " + Jumble);
            Guess = sc.next();

            if(Guess.equalsIgnoreCase(Word))
                {
                correct = true;
                break;
                }
            }

        if (correct)
            {
            System.out.println("\n\nCongratulations!\n\nIt took " + gNum + " attempts to correctly guess the word" +
                    " " + Word + "!");
            score -= 4;
            score =+ gNum;
            }
        else
            {
            System.out.println("\n\nOut of tries...\n\nSorry, the correct word that is scrambled up is " + Word +
                    ".");
            }

        //Score Counter

        System.out.print("\n\n\n-----\n\n");
        if (score != 1)
            {
            System.out.print("Your score is: " + score + " (Lower is Better)");
            }
        else
            {System.out.print("Perfect Score! A score of one, yippee!");}

        showSystemProperties = true;

        //Resolution
        if (showSystemProperties)
            {
            System.out.println("\n\n\n");
            System.out.println("Java Version: " + System.getProperty("java.version") + " by " + System.getProperty("java.vendor"));
            System.out.println("User: " + System.getProperty("user.name"));  //<-- TURNED OFF FOR PRIVACY IN THE VIDEO
            System.out.print("Operating System: " + System.getProperty("os.name"));
            System.out.println(" " + System.getProperty("os.version"));
            System.out.println("Architecture: " + System.getProperty("os.arch"));
            System.out.println ("By: Blu");
            System.out.println ("Coded for Hack Club High Seas on December 27th 2024");
            }

    }
}