import java.util.*;
import java.util.concurrent.TimeUnit;
public class Blackjack
{
    public int playBlackjack(int total)
    {
        String playerCardOne;
        String playerCardTwo;
        String botCardOne;
        String botCardTwo;
        String yN;
        String aceValue;
        Boolean temp = true;
        Boolean temp2 = true;
        
        String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        ArrayList<String> cardList = new ArrayList<String>(Arrays.asList(cards));
        ArrayList<String> playerCards = new ArrayList<String>();
        ArrayList<String> botCards = new ArrayList<String>();
        
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
	 	
	 	int randIntOne = (int)(Math.random()*cardList.size());
	 	playerCardOne = cardList.get(randIntOne);
	 	cardList.remove(randIntOne);
	 	playerCards.add(playerCardOne);
	 	int randIntTwo = (int)(Math.random()*cardList.size());
	 	playerCardTwo = cardList.get(randIntTwo);
	 	cardList.remove(randIntTwo);
	 	playerCards.add(playerCardTwo);
	 	
	 	int randIntBotOne = (int)(Math.random()*cardList.size());
	 	botCardOne = cardList.get(randIntBotOne);
	 	cardList.remove(randIntBotOne);
	 	botCards.add(botCardOne);
	 	int randIntBotTwo = (int)(Math.random()*cardList.size());
	 	botCardTwo = cardList.get(randIntBotTwo);
	 	cardList.remove(randIntBotTwo);
	 	botCards.add(botCardTwo);
	 	
	 	System.out.println("Dealing...");
	 	try  
        {
            TimeUnit.SECONDS.sleep(4);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
	 	System.out.println("Your cards are: ");
	 	System.out.println(playerCards);
	 	
	 	System.out.println("The bot has a " + botCards.get(0) + " and a card that is face down");
	 	
	 	int playerValue = 0;
	 	int botValue = 0;
	 	for (int i = 0; i<playerCards.size(); i++)
 	    {
 	        if (playerCards.get(i).equals("K") || playerCards.get(i).equals("Q") || playerCards.get(i).equals("J"))
 	        {
 	            playerValue +=10;
 	        }
 	        else if (playerCards.get(i).equals("A"))
 	        {
 	            if (playerValue < 11)
 	            {
 	                playerValue+=11;
 	            }
 	            else
 	            {
 	                playerValue+=1;
 	            }
 	        }
 	        else 
 	        {
 	            playerValue += Integer.parseInt(playerCards.get(i));
 	        }
 	    }
	 	System.out.println("You currently have a blackjack value of " + playerValue);
	 	int botCardRounds = 0;
	 	if (playerValue == 21)
	 	{
	 	    for (int x = 0; x<botCards.size(); x++)
         	    {
         	        if (botCards.get(x).equals("K") || botCards.get(x).equals("Q") || botCards.get(x).equals("J"))
         	        {
         	            botValue +=10;
         	        }
         	        else if (botCards.get(x).equals("A"))
         	        {
         	            if (botValue < 11)
         	            {
         	                botValue+=11;
         	            }
         	            else
         	            {
         	                botValue+=1;
         	            }
         	        }
         	        else 
         	        {
         	            botValue += Integer.parseInt(botCards.get(x));
         	        }
     	        }
     	        System.out.println();
     	        System.out.println("The bot's cards are: ");
                System.out.println(botCards);
                System.out.println("The bot's blackjack value is: " + botValue);
     	  if (playerValue>botValue)
     	  {
     	      System.out.println("You have blackjack and the bot doesn't! You Win!");
     	      total += (amount*2.5)-amount;
     	      return total;
     	  }
     	  else
     	  {
     	      System.out.println("Both you and the bot have blackjack! The bet is pushed.");
     	      return total;
     	  }
         	   
	 	}
	 	while (playerValue<=21)
	 	{
	 	    int cardRounds = 0;
	        System.out.println("Do you want to hit? Type 'y' to hit or 'n' to stand ");
	        Scanner hitYN = new Scanner(System.in);
	        yN = hitYN.nextLine();
	        if (yN.equals("y"))
	        {
	            int newRandInt = (int)(Math.random()*(cardList.size()-1));
	            cardRounds++;
	            playerCards.add(cardList.get(newRandInt));
	            cardList.remove(newRandInt);
	            
	            System.out.println("Dealing a new card...");
        	 	try  
                {
                    TimeUnit.SECONDS.sleep(2);
                }
                catch (InterruptedException e) {
                    System.err.format("IOException: %s%n", e);
                }
                
                if (playerCards.get(playerCards.size()-1).equals("K") || playerCards.get(playerCards.size()-1).equals("Q") || playerCards.get(playerCards.size()-1).equals("J"))
     	        {
     	            playerValue +=10;
     	        }
     	        else if (playerCards.get(playerCards.size()-1).equals("A"))
     	        {
     	            if (playerValue < 11)
         	            {
         	                playerValue+=11;
         	            }
         	            else
         	            {
         	                playerValue+=1;
         	            }
     	        }
     	        else 
     	        {
     	            playerValue += Integer.parseInt(playerCards.get(playerCards.size()-1));
     	        }
 	            if (playerCards.get(0).equals("A") || playerCards.get(1).equals("A"))
     	        {
         	        while (temp2)
         	        {
             	        if (playerValue > 21 && (playerCards.get(0).equals("A") || playerCards.get(1).equals("A")))
             	        {
             	            playerValue-=10;
             	            temp2 = false;
             	        }
         	        }
     	        }
     	        if (playerValue>21)
     	        {
     	            System.out.println("You drew a " + playerCards.get(playerCards.size()-1));
     	            try  
                    {
                        TimeUnit.SECONDS.sleep(3);
                    }
                    catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
     	            System.out.println("Your total is over 21. You busted. You lose.");
     	            total -= amount;
     	            return total;
     	        }
     	        else
     	        {
    	            System.out.println("You drew a " + playerCards.get(playerCards.size()-1));
                    try  
                    {
                        TimeUnit.SECONDS.sleep(3);
                    }
                    catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
    	            System.out.println("Your cards are now: ");
    	 	        System.out.println(playerCards);
    	 	        
     	        }
     	        
         	    System.out.println("You currently have a blackjack value of " + playerValue);
	        }
	        if (yN.equals("n"))
	        {
	            System.out.println("Your final cards are: ");
	            System.out.println(playerCards);
	            System.out.println("Your final blackjack value is: " + playerValue);
	            System.out.println();
	            try  
                {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (InterruptedException e) {
                    System.err.format("IOException: %s%n", e);
                }
	            System.out.println("The bot's card that was face down is a " + botCards.get(1));
                System.out.println("The bot's cards are now: ");
                System.out.println(botCards);
                
	            for (int x = 0; x<botCards.size(); x++)
         	    {
         	        if (botCards.get(x).equals("K") || botCards.get(x).equals("Q") || botCards.get(x).equals("J"))
         	        {
         	            botValue +=10;
         	        }
         	        else if (botCards.get(x).equals("A"))
         	        {
         	            if (botValue < 11)
         	            {
         	                botValue+=11;
         	            }
         	            else
         	            {
         	                botValue+=1;
         	            }
         	        }
         	        else 
         	        {
         	            botValue += Integer.parseInt(botCards.get(x));
         	        }
         	    }
         	    System.out.println("The bot has a blackjack value of: " + botValue);
         	    try  
                {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (InterruptedException e) {
                    System.err.format("IOException: %s%n", e);
                }
         	    while (botValue <= 16)
         	    {
         	        int newRandIntBot = (int)(Math.random()*(cardList.size()));
         	        botCardRounds++;
    	            botCards.add(cardList.get(newRandIntBot));
    	            cardList.remove(newRandIntBot);
    	            
    	            System.out.println("Dealing the bot a new card...");
            	 	try  
                    {
                        TimeUnit.SECONDS.sleep(3);
                    }
                    catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                    System.out.println("The bot drew a " + botCards.get(botCards.size()-1));
                    try  
                    {
                        TimeUnit.SECONDS.sleep(3);
                    }
                    catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
                    System.out.println();
                    System.out.println("The bot's cards are now: ");
                    System.out.println(botCards);

                    if (botCards.get(botCards.size()-1).equals("K") || botCards.get(botCards.size()-1).equals("Q") || botCards.get(botCards.size()-1).equals("J"))
         	        {
         	            botValue +=10;
         	        }
         	        else if (botCards.get(botCards.size()-1).equals("A"))
         	        {
         	            if (botValue < 11)
         	            {
         	                botValue+=11;
         	            }
         	            else
         	            {
         	                botValue+=1;
         	            }
         	        }
         	        else 
         	        {
         	            botValue += Integer.parseInt(botCards.get(botCards.size()-1));
         	        }
         	        if (botCards.get(0).equals("A") || botCards.get(1).equals("A"))
         	        {
             	        while (temp)
             	        {
                 	        if (botValue > 21 && (botCards.get(0).equals("A") || botCards.get(1).equals("A")))
                 	        {
                 	            botValue-=10;
                 	            temp = false;
                 	        }
             	        }
         	        }
         	        System.out.println("The bot has a blackjack value of: " + botValue);
         	    }
         	    if (botValue>21)
         	    {
                    try  
                    {
                        TimeUnit.SECONDS.sleep(3);
                    }
                    catch (InterruptedException e) {
                        System.err.format("IOException: %s%n", e);
                    }
         	        System.out.println("The bot busted. You win!");
         	        total += (amount*2)-amount;
         	        return total;
         	    }
         	    else
         	    {
         	        System.out.println("The bot cards are now: ");
             	    System.out.println(botCards);
    	            System.out.println("The bot's final blackjack value is: " + botValue);
         	        if (botValue > playerValue)
         	        {
         	            System.out.println("The bot is closer to 21 than you. You lose.");
         	            total -= amount;
         	            return total;
         	        }
         	        else if (botValue==playerValue)
         	        {
         	            System.out.println("The bot and you have tied. The bet is pushed.");
         	            return total;
         	        }
         	        else
         	        {
         	            System.out.println("You win!");
         	            total += (amount*2)-amount;
         	            return total;
         	        }
         	    }
	        }
	 	}
	 	return total;
    }
}