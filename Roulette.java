import java.util.*;
import java.util.concurrent.TimeUnit;
public class Roulette
{
    public String playerInput()
    {
		System.out.println("Indicate whether you want to bet on a number 'n', a color 'c', even or odds 'e', or a range of numbers 'r'.");
		Scanner input = new Scanner(System.in);
		String pC = input.nextLine();
		return pC;
    }
    
	public int simulate(int total) {
		Roulette r = new Roulette();
		String playerChoice = r.playerInput();
		String playerNum = "";
		String playerColor = "";
		String playerRange = "";
		String playerEvenOdd = "";
		while (!(playerChoice.equals("n") || playerChoice.equals("c") || playerChoice.equals("r") || playerChoice.equals("e")))
		{
		    playerChoice = r.playerInput();
		}
		if (playerChoice.equals("n"))
		{
		    System.out.println("Input a number from 0-36 to bet on: ");
		    Scanner numInput = new Scanner(System.in);
		     playerNum = numInput.nextLine();
		}
	 	else if (playerChoice.equals("c"))
	 	{
	 	    System.out.println("Input either 'red' or 'black'.");
	 	    Scanner colorInput = new Scanner(System.in);
	 	     playerColor = colorInput.nextLine();
	 	}
	 	else if (playerChoice.equals("e"))
	 	{
	 	    System.out.println("Input either 'even' or 'odd'.");
	 	    Scanner evenOddInput = new Scanner(System.in);
	 	     playerEvenOdd = evenOddInput.nextLine();
	 	}
	 	else
	 	{
	 	    System.out.println("Input 'low' for numbers 1-12, 'mid' for numbers 13-24, or 'high' for numbers 25-36");
	 	    Scanner rangeInput = new Scanner(System.in);
	 	     playerRange = rangeInput.nextLine();
	 	}
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
	 	
        Integer rouletteNum = (int)(Math.random()*37);
        
        String rouletteColor = "";
        String rouletteRange = "";
        String rouletteEvenOdd = "";
        
        if (rouletteNum == 2 ||rouletteNum == 4 ||rouletteNum == 6 ||rouletteNum == 8 ||rouletteNum == 10 ||rouletteNum == 11 ||rouletteNum == 13 ||rouletteNum == 15 ||rouletteNum == 17 ||rouletteNum == 20 ||rouletteNum == 22 ||rouletteNum == 24 ||rouletteNum == 26 ||rouletteNum == 28 ||rouletteNum == 29 ||rouletteNum == 31 ||rouletteNum == 33 ||rouletteNum == 35)
        {
            rouletteColor = "black";
        }
        else if (rouletteNum == 0)
        {
            rouletteColor = "green";
        }
        else
        {
            rouletteColor = "red";
        }
        if (rouletteNum <= 12)
        {
            rouletteRange = "low";
        }
        if (rouletteNum > 12 && rouletteNum <= 24)
        {
            rouletteRange = "mid";
        }
        if (rouletteNum > 24)
        {
            rouletteRange = "high";
        }
        if (rouletteNum %2 == 0)
        {
            rouletteEvenOdd = "even";
        }
        if (rouletteNum %2 == 1)
        {
            rouletteEvenOdd = "odd";
        }
        
        System.out.println("Spinning...");
        try  
        {
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("The roulette number was " + rouletteNum);
        System.out.println("The roulette color was " + rouletteColor);
        System.out.println("The roulette range was " + rouletteRange);
        System.out.println();
        
        if (playerChoice.equals("n"))
        {
        if (rouletteNum.toString().equals(playerNum))
        {
            System.out.println("You win!");
            total += (amount*35)-amount;
        }
        if (!(rouletteNum.toString().equals(playerNum)))
        {
            System.out.println("You lose.");
            total -= amount;
        }
        }
        
        if (playerChoice.equals("c"))
        {
        if (rouletteColor.equals(playerColor))
        {
            System.out.println("You win!");
            total += (amount*2)-amount;
        }
        if (!(rouletteColor.equals(playerColor)))
        {
            System.out.println("You lose.");
            total -= amount;
        }
        }
        
        if (playerChoice.equals("e"))
        {
        if (rouletteEvenOdd.equals(playerEvenOdd))
        {
            System.out.println("You win!");
            total += (amount*2)-amount;
        }
        if (!(rouletteEvenOdd.equals(playerEvenOdd)))
        {
            System.out.println("You lose.");
            total -= amount;
        }
        }
        
        if (playerChoice.equals("r"))
        {
        
        if (rouletteRange.equals(playerRange))
        {
            System.out.println("You win!");
            total += (amount*3)-amount;
        }
        if (!(rouletteRange.equals(playerRange)))
        {
            System.out.println("You lose.");
            total -= amount;
        }
        }
        return total;
    }
}
