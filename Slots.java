import java.util.*;
import java.util.concurrent.TimeUnit;
public class Slots
{
    public int playSlots(int total)
    {
        String slotMachinePull = "";
        String spotOne = "";
        String spotTwo = "";
        String spotThree = "";
        
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
	 	
        String[] symbols = {"Lemon", "Melon", "Cherry", "7", "Bar", "Diamond", "Spade", "Heart", "Club", "Diamond", "Clover", "Gold", "Horseshoe", "Grape", "Star"};
        System.out.println("Click 'Enter' to pull the pull the lever to the slot machine");
        Scanner slotMachine = new Scanner(System.in);
        slotMachinePull = slotMachine.nextLine();
        
	 	Integer randIntOne = (int)(Math.random()*15);
	 	spotOne = symbols[randIntOne];
	 	Integer randIntTwo = (int)(Math.random()*15);
	 	spotTwo = symbols[randIntTwo];
	 	Integer randIntThree = (int)(Math.random()*15);
	 	spotThree = symbols[randIntThree];
	 	
	 	System.out.println("Spinning...");
        try  
        {
            TimeUnit.SECONDS.sleep(5);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("            SLOT MACHINE RESULTS            ");
        System.out.println();
        System.out.println("        " + spotOne + "     " + spotTwo + "     " + spotThree);
        
        if (spotOne.equals(spotTwo) || spotTwo.equals(spotThree) || spotOne.equals(spotThree))
        {
            System.out.println("You win!");
            total += (amount*2)-amount;
        }
        else if (spotOne.equals(spotTwo) && spotTwo.equals(spotThree))
        {
            System.out.println("You win!");
            total += (amount*10)-amount;
        }
        else if ((spotOne.equals("7") && spotTwo.equals("7")) || (spotOne.equals("7") && spotThree.equals("7")) || (spotTwo.equals("7") && spotThree.equals("7")))
        {
            System.out.println("You win!");
            total += (amount*7)- amount;
        }
        else if (spotOne.equals("7") && spotTwo.equals("7") && spotThree.equals("7"))
        {
            System.out.println("You win!");
            total = 1000000;
        }
        else 
        {
            System.out.println("You lose.");
            total -= amount;
        }
        return total;
    }
}


