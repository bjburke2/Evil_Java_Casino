import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main
{
	public static void main(String[] args)
    {
        String playerSelect = "";
        /*
        System.out.println("You are stranded on an island far far away...");
        try  
        {
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("You decide to explore the island, and it seems to be uninhabited...");
        try  
        {
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("As you continue your search, you stumble upon what appears to be a run down building...");
        try  
        {
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("You walk inside and find a roulette wheel, a slot machine, a baccarat table, a blackjack table with a robot, and a miniature horse track");
        try  
        {
            TimeUnit.SECONDS.sleep(6);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("You see a dark sign that says 'Evil Java Casino'...");
        try  
        {
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("You try to run out the door, but it is locked...");
        try  
        {
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("You hear a voice coming from above saying...");
        try  
        {
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        System.out.println("'You need $5000 to exit through the door'...");
        try  
        {
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
         System.out.println("Welcome to the Evil Java Casino! Good luck getting out...");
        try  
        {
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
        */
        int start = 0;
        int max = 0;
        System.out.println("Click 'Enter' to determine your starting amount");
        Scanner startAmount = new Scanner(System.in);
        playerSelect = startAmount.nextLine();
        int total = (int)(Math.random()*401)+100;
        System.out.println("You have been given $" + total + " to start with");
        start = total;
        max = total;
        
        System.out.println("");
        int rouletteRounds = 0;
        int slotsRounds = 0;
        int baccaratRounds = 0;
        int blackjackRounds = 0;
        int horseRaces = 0;
        int pokerRounds = 0;
        
        
        while (total<5000)
        {
            System.out.println("Choose your game:");
            System.out.println("Input 'r' for roulette, 's' for slots, 'ba' for baccarat, 'b' for blackjack, or 'h' for horse race.");
            Scanner gameSelect = new Scanner(System.in);
            playerSelect = gameSelect.nextLine();
            
            if (playerSelect.equals("r"))
            {
                Roulette game = new Roulette();
                total = game.simulate(total);
                if (total>max)
                {
                    max = total;
                }
                
                System.out.print("Your total is now $" + total);
                System.out.println();
                rouletteRounds++;
                System.out.println("Number of rounds of roulette: " + rouletteRounds);
                if (total == 0)
                {
                    System.out.println("You ran out of money. The Evil Java Casino wins!");
                    System.out.println("You started with $" + start);
                    System.out.println("The maximum amount of money that you had was $" + max);
                    System.exit(0);
                }
            }
            
            if (playerSelect.equals("s"))
            {
                Slots game = new Slots();
                total = game.playSlots(total);
                if (total>max)
                {
                    max = total;
                }
                
                System.out.print("Your total is now $" + total);
                System.out.println();
                slotsRounds++;
                System.out.println("Number of rounds of slots: " + slotsRounds);
                if (total == 0)
                {
                    System.out.println("You ran out of money. The Evil Java Casino wins!");
                    System.out.println("You started with $" + start);
                    System.out.println("The maximum amount of money that you had was $" + max);
                    System.exit(0);
                }
            }
            
            if (playerSelect.equals("ba"))
            {
                Baccarat game = new Baccarat();
                total = game.playBaccarat(total);
                if (total>max)
                {
                    max = total;
                }
                
                System.out.print("Your total is now $" + total);
                System.out.println();
                baccaratRounds++;
                System.out.println("Number of rounds of baccarat: " + baccaratRounds);
                if (total == 0)
                {
                    System.out.println("You ran out of money. The Evil Java Casino wins!");
                    System.out.println("You started with $" + start);
                    System.out.println("The maximum amount of money that you had was $" + max);
                    System.exit(0);
                }
            }
            
            if (playerSelect.equals("b"))
            {
                Blackjack game = new Blackjack();
                total = game.playBlackjack(total);
                if (total>max)
                {
                    max = total;
                }
                
                System.out.print("Your total is now $" + total);
                System.out.println();
                blackjackRounds++;
                System.out.println("Number of rounds of blackjack: " + blackjackRounds);
                if (total == 0)
                {
                    System.out.println("You ran out of money. The Evil Java Casino wins!");
                    System.out.println("You started with $" + start);
                    System.out.println("The maximum amount of money that you had was $" + max);
                    System.exit(0);
                }
            }
            
            if (playerSelect.equals("h"))
            {
                Horse game = new Horse();
                int tempTotal = total;
                total = game.horseRace(total);
                if (tempTotal<total)
                {
                    System.out.println();
                    System.out.println("You win!");
                }
                else
                {
                    System.out.println();
                    System.out.println("You lose.");
                }
                try  
                {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (InterruptedException e) {
                    System.err.format("IOException: %s%n", e);
                }
                if (total>max)
                {
                    max = total;
                }
                System.out.print("Your total is now $" + total);
                System.out.println();
                horseRaces++;
                System.out.println("Number of horse races: " + horseRaces);
                if (total == 0)
                {
                    System.out.println("You ran out of money. The Evil Java Casino wins!");
                    System.out.println("You started with $" + start);
                    System.out.println("The maximum amount of money that you had was $" + max);
                    System.exit(0);
                }
            }
            
            if (playerSelect.equals("p"))
            {
                Poker game = new Poker();
                total = game.playPoker(total);
                
                System.out.print("Your total is now $" + total);
                System.out.println();
                pokerRounds++;
                System.out.println("Number of rounds of poker: " + pokerRounds);
                if (total == 0)
                {
                    System.out.println("You ran out of money. The Evil Java Casino wins!");
                    System.exit(0);
                }
            }
            
        }
        if (total>=5000)
        {
            System.out.println("You started with $" + start);
            System.out.println("Wow you are a great gambler! You have successfully escaped the Evil Java Casino!");
            System.exit(0);
        }
    }
}
