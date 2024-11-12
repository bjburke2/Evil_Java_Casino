import java.util.*;
import java.util.concurrent.TimeUnit;
public class Horse
{
    public void error(int t)
    {
        try  
        {
            TimeUnit.SECONDS.sleep(t);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
    public int horseRace(int total)
    {
        Horse h = new Horse();
        String horseHolder;
        Integer horse1BetAmount = 0;
        Integer horse2BetAmount = 0;
        Integer horse3BetAmount = 0;
        Integer horse4BetAmount = 0;
        Integer horse5BetAmount = 0;
        Integer horse6BetAmount = 0;
        Integer horse7BetAmount = 0;
        Integer horse8BetAmount = 0;
        System.out.println("Welcome to the minature horse track! It will be an 7 horse race, and you will bet on one of them.");
        h.error(3);
        String[] horses = {
            " Thundering Hoof  ",
            " Midnight Shadow  ",
            "  Golden Gallop   ",
            " Diamond Stallion ",
            "Starlight Sprinter",
            "Velvet Thunderbolt",
            "Mystic Moonstrider",
            "Firestorm Runner  ",
            "Sapphire Speedster",
            "Celestial Spirit  ",
            " Enigma Eclipse   ",
            "Phoenix Firestorm ",
            " Echoing Thunder  ",
            " Serene Moonlight ",
            " Radiant Runaway  ",
            "Whirlwind Whisper ",
            "  Crimson Comet   ",
            " Aurora Avalanche ",
            "  Mirage Majesty  ",
            " Electric Equest  ",
            " Stormy Seasaddle ",
            " Silver Starshine ",
            "Mystical Momentum ",
            " Cosmic Canterer  ",
            " Midnight Marvel  ",
            "Shooting Starlet  ",
            "Golden Galloping  ",
            " Mystic Moonbeam  ",
            "Whispering Winds  ",
            "Obsidian Onslaught",
            "  Stellar Steed   ",
            "Spectral Sprinter ",
            "  Lunar Lancer    ",
            "Thunderbolt Trail ",
            "Celestial Charge  ",
            "  Ivory Inferno   ",
            "Enigmatic Escapade",
            " Ethereal Eclipse ",
            " Solstice Sprint  ",
            "Galloping Glimmer ",
            " Inferno Instinct ",
            " Shadow Sprinter  ",
            " Whispering Whim  ",
            " Starlight Stride ",
            " Sapphire Sprint  ",
            "   Blaze Bolt     ",
            "  Phantom Pace    ",
            "  Velvet Vortex   ",
            "Wildfire Whirlwind",
            " Solar Speedster  ",
            " Galactic Gallop  ",
            " Echoing Eclipse  ",
            "  Crimson Tiger   ",
            "  Radiant Racer   ",
            "  Serene Steed    ",
            " Moonlit Mystery  ",
            " Enchanted Equine ",
            " Emerald Express  ",
            "  Radiant Rider   ",
            "Seraphic Sprinter ",
            "  Blizzard Bolt   ",
            "Whispering Willow ",
            " Diamond Dashaway ",
            " Twilight Trotter ",
            " Enchanted Fairy  ",
            " Solar Sprinter   ",
            " Mystic Momentum  ",
            "  Velvet Voyage   ",
            " Radiant Rampage  ",
            " Midnight Majesty ",
            "  Phantom Phenom  ",
            "  Firestorm Fury  ",
            "  Serene Sprint   ",
            " Sapphire Strider ",
            " Celestial Canter ",
            "  Ethereal Echo   ",
            "  Shadow Shine    ",
            "  Diamond Dynamo  ",
            "  Mystic Mystery  ",
            "  Twilight Trek   ",
            " Whispering Whirl ",
            "  Golden Glide    ",
            "  Thunder Trot    ",
            "  Cosmic Cruise   ",
            " Seraphic Sprint  ",
            "  Crimson Cruise  ",
            " Enigma Elephant  ",
            "  Mystic Mother   ",
            "  Velvet Vacuum   ",
            "  Radiant Horse   ",
            " Midnight Mayhem  ",
            " Phantom Express  ",
            "  Firestorm Fire  ",
            "  Serene Sloth    ",
            " Sapphire Beauty  ",
            " Celestial Bodies ",
            " Ethereal Sneeze  ",
            "   Shadow Mane    ",
            "  Diamond Rocky   ",
            "   Mystic Moon    ",
            "  Twilight Train  ",
            };
        ArrayList<String> horseNames = new ArrayList<String>(Arrays.asList(horses));
        int randIntOne = (int)(Math.random()*horseNames.size());
        String horse1 = horseNames.get(randIntOne);
        horseNames.remove(randIntOne);
        int randIntTwo = (int)(Math.random()*horseNames.size());
        String horse2 = horseNames.get(randIntTwo);
        horseNames.remove(randIntTwo);
        int randIntThree = (int)(Math.random()*horseNames.size());
        String horse3 = horseNames.get(randIntThree);
        horseNames.remove(randIntThree);
        int randIntFour = (int)(Math.random()*horseNames.size());
        String horse4 = horseNames.get(randIntFour);
        horseNames.remove(randIntFour);
        int randIntFive = (int)(Math.random()*horseNames.size());
        String horse5 = horseNames.get(randIntFive);
        horseNames.remove(randIntFive);
        int randIntSix = (int)(Math.random()*horseNames.size());
        String horse6 = horseNames.get(randIntSix);
        horseNames.remove(randIntSix);
        int randIntSeven = (int)(Math.random()*horseNames.size());
        String horse7 = horseNames.get(randIntSeven);
        horseNames.remove(randIntSeven);
        
        String [] odds = {"5-1", "2-1", "9-1", "4-1", "11-1", "19-1", "14-1"};
        ArrayList<String> horseOdds = new ArrayList<String>(Arrays.asList(odds));
        int ranIntOne = (int)(Math.random()*7);
        String horse1Odds = horseOdds.get(ranIntOne);
        horseOdds.remove(ranIntOne);
        int ranIntTwo = (int)(Math.random()*6);
        String horse2Odds = horseOdds.get(ranIntTwo);
        horseOdds.remove(ranIntTwo);
        int ranIntThree = (int)(Math.random()*5);
        String horse3Odds = horseOdds.get(ranIntThree);
        horseOdds.remove(ranIntThree);
        int ranIntFour = (int)(Math.random()*4);
        String horse4Odds = horseOdds.get(ranIntFour);
        horseOdds.remove(ranIntFour);
        int ranIntFive = (int)(Math.random()*3);
        String horse5Odds = horseOdds.get(ranIntFive);
        horseOdds.remove(ranIntFive);
        int ranIntSix = (int)(Math.random()*2);
        String horse6Odds = horseOdds.get(ranIntSix);
        horseOdds.remove(ranIntSix);
        int ranIntSeven = (int)(Math.random()*1);
        String horse7Odds = horseOdds.get(ranIntSeven);
        horseOdds.remove(ranIntSeven);
        if (horse1Odds.length()==4)
        {
            horse1Odds = "      "+horse1Odds+"        ";
        }
        else
        {
            horse1Odds = "       "+horse1Odds+"        ";
        }
        if (horse2Odds.length()==4)
        {
            horse2Odds = "      "+horse2Odds+"        ";
        }
        else
        {
            horse2Odds = "       "+horse2Odds+"        ";
        }
        if (horse3Odds.length()==4)
        {
            horse3Odds = "      "+horse3Odds+"        ";
        }
        else
        {
            horse3Odds = "       "+horse3Odds+"        ";
        }
        if (horse4Odds.length()==4)
        {
            horse4Odds = "      "+horse4Odds+"        ";
        }
        else
        {
            horse4Odds = "       "+horse4Odds+"        ";
        }
        if (horse5Odds.length()==4)
        {
            horse5Odds = "      "+horse5Odds+"        ";
        }
        else
        {
            horse5Odds = "       "+horse5Odds+"        ";
        }
        if (horse6Odds.length()==4)
        {
            horse6Odds = "      "+horse6Odds+"        ";
        }
        else
        {
            horse6Odds = "       "+horse6Odds+"        ";
        }
        if (horse7Odds.length()==4)
        {
            horse7Odds = "      "+horse7Odds+"        ";
        }
        else
        {
            horse7Odds = "       "+horse7Odds+"        ";
        }
        
        String[] nums = {"        1         ","        2         ","        3         ","        4         ","        5         ","        6         ","        7         "};
        String[] names = {horse1,horse2,horse3,horse4,horse5,horse6,horse7};
        String[] oidds = {horse1Odds,horse2Odds,horse3Odds,horse4Odds,horse5Odds,horse6Odds,horse7Odds};
        ArrayList<String> hNums = new ArrayList<String>(Arrays.asList(nums));
        ArrayList<String> hNames = new ArrayList<String>(Arrays.asList(names));
        ArrayList<String> hOdds = new ArrayList<String>(Arrays.asList(oidds));
        
        System.out.println("HORSES:");
        System.out.println(hNums);
        System.out.println(hNames);
        System.out.println(hOdds);
        h.error(3);
        
        Integer amount = 0;
	 	System.out.println("You currently have " + total + " dollars. Enter an amount that you want to bet: ");
	 	Scanner betInput = new Scanner(System.in);
	 	amount = Integer.parseInt(betInput.nextLine());
	 	while (amount > total)
	 	{
	 	    System.out.println("Select an amount within your total.");
	 	    Scanner newBetInput = new Scanner(System.in);
	 	    amount = Integer.parseInt(newBetInput.nextLine());
	 	}
        
        System.out.println("What horse do you want to bet on? Type the number of the horse below:");
        Scanner horseBet = new Scanner(System.in);
	 	horseHolder = horseBet.nextLine();
	 	if (horseHolder.equals("1"))
	 	{
	 	    horse1BetAmount = amount;
	 	}
	 	if (horseHolder.equals("2"))
	 	{
	 	    horse2BetAmount = amount;
	 	}
	 	if (horseHolder.equals("3"))
	 	{
	 	    horse3BetAmount = amount;
	 	}
	 	if (horseHolder.equals("4"))
	 	{
	 	    horse4BetAmount = amount;
	 	}
	 	if (horseHolder.equals("5"))
	 	{
	 	    horse5BetAmount = amount;
	 	}
	 	if (horseHolder.equals("6"))
	 	{
	 	    horse6BetAmount = amount;
	 	}
	 	if (horseHolder.equals("7"))
	 	{
	 	    horse7BetAmount = amount;
	 	}
	 	if (horseHolder.equals("8"))
	 	{
	 	    horse8BetAmount = amount;
	 	}
	 	h.error(2);
	 	Integer randomTime = (int)(Math.random()*10)+1;
	 	System.out.println("The race is going to start in approximately " + randomTime + " seconds.");
	 	try  
        {
            TimeUnit.SECONDS.sleep(randomTime);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
	 	System.out.println("On your marks...");
	 	try  
        {
            TimeUnit.SECONDS.sleep(2);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
	 	System.out.println("Get set...");
	 	Integer randomTimeTwo = (int)(Math.random()*5) +1;
	 	try  
        {
            TimeUnit.SECONDS.sleep(randomTimeTwo);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
	 	System.out.println("Go!");
	 	h.error(2);
	 	System.out.println("And they're off...");
	 	Integer randFirstHorse = (int)(Math.random()*7);
	 	h.error(3);
	 	System.out.println(hNames.get(randFirstHorse) + " gets a great start out of the gate");
	 	h.error(4);
	 	Integer randSecondHorse = (int)(Math.random()*7);
	 	System.out.println(hNames.get(randSecondHorse) + " is in the lead around the first turn");
	 	h.error(4);
	 	Integer randThirdHorse = (int)(Math.random()*7);
	 	System.out.println(hNames.get(randThirdHorse) + " gets to the front on the straightaway");
	 	h.error(4);
	 	Integer randFourthHorse = (int)(Math.random()*7);
	 	System.out.println(hNames.get(randFourthHorse) + " is in the lead around the final turn");
	 	h.error(4);
	 	
	 	
	 	int winner = (int)(Math.random()*101);
	 	int second = 0;
	 	int third = 0;
	 	String firstPlace = "";
	 	String secondPlace = "";
	 	String thirdPlace ="";
	 	
	 	String fiveOneOdds = "";
	 	String twoOneOdds = "";
	 	String nineOneOdds = "";
	 	String fourOneOdds = "";
	 	String elevenOneOdds = "";
	 	String nineteenOneOdds = "";
	 	String fourteenOneOdds = "";

	 	for (int g = 0; g<hOdds.size();g++)
	 	{
	 	    if (hOdds.get(g).equals("       5-1        "))
	 	    {
	 	        fiveOneOdds = hNames.get(g);
	 	    }
	 	    else if (hOdds.get(g).equals("       2-1        "))
	 	    {
	 	        twoOneOdds = hNames.get(g);
	 	    }
	 	    else if (hOdds.get(g).equals("       9-1        "))
	 	    {
	 	        nineOneOdds = hNames.get(g);
	 	    }
	 	    else if (hOdds.get(g).equals("       4-1        "))
	 	    {
	 	        fourOneOdds = hNames.get(g);
	 	    }
	 	    else if (hOdds.get(g).equals("      11-1        "))
	 	    {
	 	        elevenOneOdds = hNames.get(g);
	 	    }
	 	    else if (hOdds.get(g).equals("      19-1        "))
	 	    {
	 	        nineteenOneOdds = hNames.get(g);
	 	    }
	 	    else if (hOdds.get(g).equals("      14-1        "))
	 	    {
	 	        fourteenOneOdds = hNames.get(g);
	 	    }
	 	}
	 	
	 	if (winner<17)
	 	{
	 	    firstPlace = fiveOneOdds;
	 	    hNames.remove(fiveOneOdds);
	 	    second = (int)(Math.random()*6);
	 	    secondPlace = hNames.get(second);
	 	    hNames.remove(second);
	 	    third = (int)(Math.random()*5);
	 	    thirdPlace = hNames.get(third);
	 	    hNames.remove(third);
	 	    if (horse1BetAmount>0 && firstPlace.equals(horse1))
	 	    {
	 	        total += (amount*5);
	 	    }
	 	    else if (horse2BetAmount>0 && firstPlace.equals(horse2))
	 	    {
	 	        total += (amount*5);
	 	    }
	 	    else if (horse3BetAmount>0 && firstPlace.equals(horse3))
	 	    {
	 	        total += (amount*5);
	 	    }
	 	    else if (horse4BetAmount>0 && firstPlace.equals(horse4))
	 	    {
	 	        total += (amount*5);
	 	    }
	 	    else if (horse5BetAmount>0 && firstPlace.equals(horse5))
	 	    {
	 	        total += (amount*5);
	 	    }
	 	    else if (horse6BetAmount>0 && firstPlace.equals(horse6))
	 	    {
	 	        total += (amount*5);
	 	    }
	 	    else if (horse7BetAmount>0 && firstPlace.equals(horse7))
	 	    {
	 	        total += (amount*5);
	 	    }
	 	    else
	 	    {
	 	        total-= amount;
	 	    }
	 	}
	 	
	 	if (winner>=17&&winner<51)
	 	{
	 	    firstPlace = twoOneOdds;
	 	    hNames.remove(twoOneOdds);
	 	    second = (int)(Math.random()*6);
	 	    secondPlace = hNames.get(second);
	 	    hNames.remove(second);
	 	    third = (int)(Math.random()*5);
	 	    thirdPlace = hNames.get(third);
	 	    hNames.remove(third);
	 	    if (horse1BetAmount>0 && firstPlace.equals(horse1))
	 	    {
	 	        total += (amount*2);
	 	    }
	 	    else if (horse2BetAmount>0 && firstPlace.equals(horse2))
	 	    {
	 	        total += (amount*2);
	 	    }
	 	    else if (horse3BetAmount>0 && firstPlace.equals(horse3))
	 	    {
	 	        total += (amount*2);
	 	    }
	 	    else if (horse4BetAmount>0 && firstPlace.equals(horse4))
	 	    {
	 	        total += (amount*2);
	 	    }
	 	    else if (horse5BetAmount>0 && firstPlace.equals(horse5))
	 	    {
	 	        total += (amount*2);
	 	    }
	 	    else if (horse6BetAmount>0 && firstPlace.equals(horse6))
	 	    {
	 	        total += (amount*2);
	 	    }
	 	    else if (horse7BetAmount>0 && firstPlace.equals(horse7))
	 	    {
	 	        total += (amount*2);
	 	    }
	 	    else
	 	    {
	 	        total-= amount;
	 	    }
	 	}
	 	
	 	if (winner>=51 && winner<61)
	 	{
	 	    firstPlace = nineOneOdds;
	 	    hNames.remove(nineOneOdds);
	 	    second = (int)(Math.random()*6);
	 	    secondPlace = hNames.get(second);
	 	    hNames.remove(second);
	 	    third = (int)(Math.random()*5);
	 	    thirdPlace = hNames.get(third);
	 	    hNames.remove(third);
	 	    if (horse1BetAmount>0 && firstPlace.equals(horse1))
	 	    {
	 	        total += (amount*9);
	 	    }
	 	    else if (horse2BetAmount>0 && firstPlace.equals(horse2))
	 	    {
	 	        total += (amount*9);
	 	    }
	 	    else if (horse3BetAmount>0 && firstPlace.equals(horse3))
	 	    {
	 	        total += (amount*9);
	 	    }
	 	    else if (horse4BetAmount>0 && firstPlace.equals(horse4))
	 	    {
	 	        total += (amount*9);
	 	    }
	 	    else if (horse5BetAmount>0 && firstPlace.equals(horse5))
	 	    {
	 	        total += (amount*9);
	 	    }
	 	    else if (horse6BetAmount>0 && firstPlace.equals(horse6))
	 	    {
	 	        total += (amount*9);
	 	    }
	 	    else if (horse7BetAmount>0 && firstPlace.equals(horse7))
	 	    {
	 	        total += (amount*9);
	 	    }
	 	    else
	 	    {
	 	        total-= amount;
	 	    }
	 	}
	 	
	 	if (winner>=61 && winner<81)
	 	{
	 	    firstPlace = fourOneOdds;
	 	    hNames.remove(fourOneOdds);
	 	    second = (int)(Math.random()*6);
	 	    secondPlace = hNames.get(second);
	 	    hNames.remove(second);
	 	    third = (int)(Math.random()*5);
	 	    thirdPlace = hNames.get(third);
	 	    hNames.remove(third);
	 	    if (horse1BetAmount>0 && firstPlace.equals(horse1))
	 	    {
	 	        total += (amount*4);
	 	    }
	 	    else if (horse2BetAmount>0 && firstPlace.equals(horse2))
	 	    {
	 	        total += (amount*4);
	 	    }
	 	    else if (horse3BetAmount>0 && firstPlace.equals(horse3))
	 	    {
	 	        total += (amount*4);
	 	    }
	 	    else if (horse4BetAmount>0 && firstPlace.equals(horse4))
	 	    {
	 	        total += (amount*4);
	 	    }
	 	    else if (horse5BetAmount>0 && firstPlace.equals(horse5))
	 	    {
	 	        total += (amount*4);
	 	    }
	 	    else if (horse6BetAmount>0 && firstPlace.equals(horse6))
	 	    {
	 	        total += (amount*4);
	 	    }
	 	    else if (horse7BetAmount>0 && firstPlace.equals(horse7))
	 	    {
	 	        total += (amount*4);
	 	    }
	 	    else
	 	    {
	 	        total-= amount;
	 	    }
	 	}
	 	
	 	if (winner>=81 && winner<89)
	 	{
	 	    firstPlace = elevenOneOdds;
	 	    hNames.remove(elevenOneOdds);
	 	    second = (int)(Math.random()*6);
	 	    secondPlace = hNames.get(second);
	 	    hNames.remove(second);
	 	    third = (int)(Math.random()*5);
	 	    thirdPlace = hNames.get(third);
	 	    hNames.remove(third);
	 	    if (horse1BetAmount>0 && firstPlace.equals(horse1))
	 	    {
	 	        total += (amount*11);
	 	    }
	 	    else if (horse2BetAmount>0 && firstPlace.equals(horse2))
	 	    {
	 	        total += (amount*11);
	 	    }
	 	    else if (horse3BetAmount>0 && firstPlace.equals(horse3))
	 	    {
	 	        total += (amount*11);
	 	    }
	 	    else if (horse4BetAmount>0 && firstPlace.equals(horse4))
	 	    {
	 	        total += (amount*11);
	 	    }
	 	    else if (horse5BetAmount>0 && firstPlace.equals(horse5))
	 	    {
	 	        total += (amount*11);
	 	    }
	 	    else if (horse6BetAmount>0 && firstPlace.equals(horse6))
	 	    {
	 	        total += (amount*11);
	 	    }
	 	    else if (horse7BetAmount>0 && firstPlace.equals(horse7))
	 	    {
	 	        total += (amount*11);
	 	    }
	 	    else
	 	    {
	 	        total-= amount;
	 	    }
	 	}
	 	
	 	if (winner>=89 && winner<94)
	 	{
	 	    firstPlace = nineteenOneOdds;
	 	    hNames.remove(nineteenOneOdds);
	 	    second = (int)(Math.random()*6);
	 	    secondPlace = hNames.get(second);
	 	    hNames.remove(second);
	 	    third = (int)(Math.random()*5);
	 	    thirdPlace = hNames.get(third);
	 	    hNames.remove(third);
	 	    if (horse1BetAmount>0 && firstPlace.equals(horse1))
	 	    {
	 	        total += (amount*19);
	 	    }
	 	    else if (horse2BetAmount>0 && firstPlace.equals(horse2))
	 	    {
	 	        total += (amount*19);
	 	    }
	 	    else if (horse3BetAmount>0 && firstPlace.equals(horse3))
	 	    {
	 	        total += (amount*19);
	 	    }
	 	    else if (horse4BetAmount>0 && firstPlace.equals(horse4))
	 	    {
	 	        total += (amount*19);
	 	    }
	 	    else if (horse5BetAmount>0 && firstPlace.equals(horse5))
	 	    {
	 	        total += (amount*19);
	 	    }
	 	    else if (horse6BetAmount>0 && firstPlace.equals(horse6))
	 	    {
	 	        total += (amount*19);
	 	    }
	 	    else if (horse7BetAmount>0 && firstPlace.equals(horse7))
	 	    {
	 	        total += (amount*19);
	 	    }
	 	    else
	 	    {
	 	        total-= amount;
	 	    }
	 	}
	 	
	 	if (winner>=94)
	 	{
	 	    firstPlace = fourteenOneOdds;
	 	    hNames.remove(fourteenOneOdds);
	 	    second = (int)(Math.random()*6);
	 	    secondPlace = hNames.get(second);
	 	    hNames.remove(second);
	 	    third = (int)(Math.random()*5);
	 	    thirdPlace = hNames.get(third);
	 	    hNames.remove(third);
	 	    if (horse1BetAmount>0 && firstPlace.equals(horse1))
	 	    {
	 	        total += (amount*14);
	 	    }
	 	    else if (horse2BetAmount>0 && firstPlace.equals(horse2))
	 	    {
	 	        total += (amount*14);
	 	    }
	 	    else if (horse3BetAmount>0 && firstPlace.equals(horse3))
	 	    {
	 	        total += (amount*14);
	 	    }
	 	    else if (horse4BetAmount>0 && firstPlace.equals(horse4))
	 	    {
	 	        total += (amount*14);
	 	    }
	 	    else if (horse5BetAmount>0 && firstPlace.equals(horse5))
	 	    {
	 	        total += (amount*14);
	 	    }
	 	    else if (horse6BetAmount>0 && firstPlace.equals(horse6))
	 	    {
	 	        total += (amount*14);
	 	    }
	 	    else if (horse7BetAmount>0 && firstPlace.equals(horse7))
	 	    {
	 	        total += (amount*14);
	 	    }
	 	    else
	 	    {
	 	        total-= amount;
	 	    }
	 	}
	 	
	 	int randNum = (int)(Math.random()*101);
	 	if (randNum<=50)
	 	{
	 	    System.out.println(firstPlace + " is starting to pull away");
	 	    h.error(3);
	 	    System.out.println("It looks like " + firstPlace + " will win by a landslide");
	 	    h.error(3);
	 	    System.out.println("The results from the race are: ");
	 	}
	 	else 
	 	{
	 	    System.out.println("This race is close, it's gonna be a three horse finish!");
	 	    h.error(3);
	 	    System.out.println("And the results after a photo finish is...");
	 	    h.error(3);
	 	}
	 	System.out.println("1st place: " + firstPlace);
	 	h.error(2);
	 	System.out.println("2nd place: " + secondPlace);
	 	System.out.println("3rd place: " + thirdPlace);
	 	h.error(4);
	 	return total;
    }
}