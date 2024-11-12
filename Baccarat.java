import java.util.*;
import java.util.concurrent.TimeUnit;
public class Baccarat
{
    public void error()
    {
        try  
        {
            TimeUnit.SECONDS.sleep(3);
        }
        catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
    
    public int playBaccarat(int total)
    {
        Baccarat bac = new Baccarat();
        String playerCardOne;
        String playerCardTwo;
        String playerCardThree;
        String bankerCardOne;
        String bankerCardTwo;
        String bankerCardThree;
        String betTypeHolder;
        Integer bankerAmount = 0;
        Integer tieAmount = 0;
        Integer playerAmount = 0;
        Integer playerTotal = 0;
        Integer bankerTotal = 0;
        Integer playerThirdValue = 0;
        Integer bankerThirdValue = 0;
        
        String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        ArrayList<String> cardList = new ArrayList<String>(Arrays.asList(cards));
        ArrayList<String> playerCards = new ArrayList<String>();
        ArrayList<String> bankerCards = new ArrayList<String>();
        
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
	 	
	 	System.out.println("Who do you want to bet on? Type 'b' for the banker (95:100 odds), 'p' for the player (1:1 odds), or 't' for a tie (8:1 odds)");
	 	Scanner betType = new Scanner(System.in);
	 	betTypeHolder = betType.nextLine();
	 	if (betTypeHolder.equals("b"))
	 	{
	 	    bankerAmount = amount;
	 	}
	 	if (betTypeHolder.equals("p"))
	 	{
	 	    playerAmount = amount;
	 	}
	 	if (betTypeHolder.equals("t"))
	 	{
	 	    tieAmount = amount;
	 	}
	 	Integer randIntOne = (int)(Math.random()*52);
	 	playerCardOne = cardList.get(randIntOne);
	 	cardList.remove(randIntOne);
	 	playerCards.add(playerCardOne);
	 	Integer randIntTwo = (int)(Math.random()*51);
	 	playerCardTwo = cardList.get(randIntTwo);
	 	cardList.remove(randIntTwo);
	 	playerCards.add(playerCardTwo);
	 	
	 	Integer randIntBankerOne = (int)(Math.random()*50);
	 	bankerCardOne = cardList.get(randIntBankerOne);
	 	cardList.remove(randIntBankerOne);
	 	bankerCards.add(bankerCardOne);
	 	Integer randIntBankerTwo = (int)(Math.random()*49);
	 	bankerCardTwo = cardList.get(randIntBankerTwo);
	 	cardList.remove(randIntBankerTwo);
	 	bankerCards.add(bankerCardTwo);
	 	
	 	for (int i = 0; i<playerCards.size(); i++)
 	    {
 	        if (playerCards.get(i).equals("A"))
 	        {
                playerTotal+=1;
            }
            else if (playerCards.get(i).equals("K") || playerCards.get(i).equals("Q") || playerCards.get(i).equals("J"))
            {
                playerTotal +=0;
            }
 	        else 
 	        {
 	            playerTotal += Integer.parseInt(playerCards.get(i));
 	        }
 	    }
 	    if (playerTotal>9)
 	    {
 	        playerTotal -= 10;
 	    }
 	    else if (playerTotal>19)
 	    {
 	        playerTotal = 0;
 	    }
 	    else
 	    {
 	        playerTotal = playerTotal + 0;
 	    }
 	    
 	    for (int x = 0; x<bankerCards.size(); x++)
 	    {
 	        if (bankerCards.get(x).equals("A"))
 	        {
                bankerTotal+=1;
            }
            else if (bankerCards.get(x).equals("K") || bankerCards.get(x).equals("Q") || bankerCards.get(x).equals("J"))
            {
                bankerTotal +=0;
            }
 	        else 
 	        {
 	            bankerTotal += Integer.parseInt(bankerCards.get(x));
 	        }
 	    }
 	    if (bankerTotal>9)
 	    {
 	        bankerTotal -= 10;
 	    }
 	    else if (bankerTotal>19)
 	    {
 	        bankerTotal = 0;
 	    }
 	    else
 	    {
 	        bankerTotal = bankerTotal + 0;
 	    }
 	    
 	    System.out.println("Dealing...");
	 	bac.error();
        
        System.out.println("The player's cards are: ");
	 	System.out.println(playerCards);
	 	System.out.println("The player's baccarat score is " + playerTotal);
	 	System.out.println();
	 	bac.error();
	 	System.out.println("The banker's cards are: ");
	 	System.out.println(bankerCards);
	 	System.out.println("The banker's baccarat score is " + bankerTotal);
	 	System.out.println();
	 	bac.error();
	 	if (playerTotal<=5 && bankerTotal>=8)
	 	{
	 	    if (bankerAmount>0)
	 	    {
	 	        System.out.println("The banker wins! You win!");
	 	        total+= (amount*1.95)-amount;
	 	    }
	 	    else
	 	    {
	 	        System.out.println("The banker wins. You lose.");
	 	        total -= amount;
	 	    }
	 	    return total;
	 	}
	 	if (playerTotal< 6)
	 	{
	 	    Integer randIntThree = (int)(Math.random()*48);
	 	    playerCardThree = cardList.get(randIntThree);
    	 	cardList.remove(randIntThree);
    	 	playerCards.add(playerCardThree);
    	 	if (playerCards.get(2).equals("A"))
 	        {
                playerTotal+=1;
            }
            else if (playerCards.get(2).equals("K") || playerCards.get(2).equals("Q") || playerCards.get(2).equals("J"))
            {
                playerTotal +=0;
            }
 	        else 
 	        {
 	            playerTotal += Integer.parseInt(playerCards.get(2));
 	        }
    	 	playerTotal += playerThirdValue;
    	 	if (playerTotal>9)
    	 	{
    	 	    playerTotal -= 10;
    	 	}
    	 	else if (playerTotal>19)
    	 	{
    	 	    playerTotal = 0;
    	 	}
    	 	else
    	 	{
    	 	    playerTotal += 0;
    	 	}
    	 	System.out.println("Dealing the player a new card... ");
    	 	bac.error();
    	 	System.out.println("The player drew a " + playerCardThree);
    	 	bac.error();
    	 	System.out.println("The player's cards are: ");
    	 	System.out.println(playerCards);
    	 	System.out.println("The player's baccarat score is " + playerTotal);
    	 	System.out.println();
    	 	bac.error();
            System.out.println("The banker's cards are: ");
    	 	System.out.println(bankerCards);
    	 	System.out.println("The banker's baccarat score is " + bankerTotal);    
    	 	System.out.println();
	 	}
	 	
	 	if (playerTotal>=6 && bankerTotal<8)
	 	{
	 	    Integer randIntBankerThree = (int)(Math.random()*47);
	 	    bankerCardThree = cardList.get(randIntBankerThree);
    	 	cardList.remove(randIntBankerThree);
    	 	bankerCards.add(bankerCardThree);
    	 	if (bankerCards.get(2).equals("A"))
 	        {
                bankerTotal+=1;
            }
            else if (bankerCards.get(2).equals("K") || bankerCards.get(2).equals("Q") || bankerCards.get(2).equals("J"))
            {
                bankerTotal +=0;
            }
 	        else 
 	        {
 	            bankerTotal += Integer.parseInt(bankerCards.get(2));
 	        }
    	 	bankerTotal += bankerThirdValue;
    	 	if (bankerTotal>9)
    	 	{
    	 	    bankerTotal -= 10;
    	 	}
    	 	else if (bankerTotal>19)
    	 	{
    	 	    bankerTotal = 0;
    	 	}
    	 	else
    	 	{
    	 	    bankerTotal += 0;
    	 	}
    	 	System.out.println("Dealing the banker a new card... ");
    	 	bac.error();
    	 	System.out.println("The banker drew a " + bankerCardThree);
    	 	bac.error();
            System.out.println("The banker's cards are: ");
    	 	System.out.println(bankerCards);
    	 	System.out.println("The banker's baccarat score is " + bankerTotal);
    	 	System.out.println();
	 	}
	 	if (playerThirdValue == 8 && bankerTotal<=2)
	 	{
	 	    Integer randIntBankerThree = (int)(Math.random()*47);
	 	    bankerCardThree = cardList.get(randIntBankerThree);
    	 	cardList.remove(randIntBankerThree);
    	 	bankerCards.add(bankerCardThree);
    	 	if (bankerCards.get(2).equals("A"))
 	        {
                bankerTotal+=1;
            }
            else if (bankerCards.get(2).equals("K") || bankerCards.get(2).equals("Q") || bankerCards.get(2).equals("J"))
            {
                bankerTotal +=0;
            }
 	        else 
 	        {
 	            bankerTotal += Integer.parseInt(bankerCards.get(2));
 	        }
    	 	bankerTotal += bankerThirdValue;
    	 	if (bankerTotal>9)
    	 	{
    	 	    bankerTotal -= 10;
    	 	}
    	 	else if (bankerTotal>19)
    	 	{
    	 	    bankerTotal = 0;
    	 	}
    	 	else
    	 	{
    	 	    bankerTotal += 0;
    	 	}
    	 	System.out.println("Dealing the banker a new card... ");
    	 	bac.error();
    	 	System.out.println("The banker drew a " + bankerCardThree);
    	 	bac.error();
            System.out.println("The banker's cards are: ");
    	 	System.out.println(bankerCards);
    	 	System.out.println("The banker's baccarat score is " + bankerTotal);
    	 	System.out.println();
	 	}
	 	if ((playerThirdValue == 6 || playerThirdValue == 7) && bankerTotal<=6)
	 	{
	 	    Integer randIntBankerThree = (int)(Math.random()*47);
	 	    bankerCardThree = cardList.get(randIntBankerThree);
    	 	cardList.remove(randIntBankerThree);
    	 	bankerCards.add(bankerCardThree);
    	 	if (bankerCards.get(2).equals("A"))
 	        {
                bankerTotal+=1;
            }
            else if (bankerCards.get(2).equals("K") || bankerCards.get(2).equals("Q") || bankerCards.get(2).equals("J"))
            {
                bankerTotal +=0;
            }
 	        else 
 	        {
 	            bankerTotal += Integer.parseInt(bankerCards.get(2));
 	        }
    	 	bankerTotal += bankerThirdValue;
    	 	if (bankerTotal>9)
    	 	{
    	 	    bankerTotal -= 10;
    	 	}
    	 	else if (bankerTotal>19)
    	 	{
    	 	    bankerTotal = 0;
    	 	}
    	 	else
    	 	{
    	 	    bankerTotal += 0;
    	 	}
    	 	System.out.println("Dealing the banker a new card... ");
    	 	bac.error();
    	 	System.out.println("The banker drew a " + bankerCardThree);
    	 	bac.error();
            System.out.println("The banker's cards are: ");
    	 	System.out.println(bankerCards);
    	 	System.out.println("The banker's baccarat score is " + bankerTotal);
    	 	System.out.println();
	 	}
	 	if ((playerThirdValue == 4 || playerThirdValue == 5) && bankerTotal<=5)
	 	{
	 	    Integer randIntBankerThree = (int)(Math.random()*47);
	 	    bankerCardThree = cardList.get(randIntBankerThree);
    	 	cardList.remove(randIntBankerThree);
    	 	bankerCards.add(bankerCardThree);
    	 	if (bankerCards.get(2).equals("A"))
 	        {
                bankerTotal+=1;
            }
            else if (bankerCards.get(2).equals("K") || bankerCards.get(2).equals("Q") || bankerCards.get(2).equals("J"))
            {
                bankerTotal +=0;
            }
 	        else 
 	        {
 	            bankerTotal += Integer.parseInt(bankerCards.get(2));
 	        }
    	 	bankerTotal += bankerThirdValue;
    	 	if (bankerTotal>9)
    	 	{
    	 	    bankerTotal -= 10;
    	 	}
    	 	else if (bankerTotal>19)
    	 	{
    	 	    bankerTotal = 0;
    	 	}
    	 	else
    	 	{
    	 	    bankerTotal += 0;
    	 	}
    	 	System.out.println("Dealing the banker a new card... ");
    	 	bac.error();
    	 	System.out.println("The banker drew a " + bankerCardThree);
    	 	bac.error();
            System.out.println("The banker's cards are: ");
    	 	System.out.println(bankerCards);
    	 	System.out.println("The banker's baccarat score is " + bankerTotal);
    	 	System.out.println();
	 	}
	 	if ((playerThirdValue == 2 || playerThirdValue == 3) && bankerTotal<=4)
	 	{
	 	    Integer randIntBankerThree = (int)(Math.random()*47);
	 	    bankerCardThree = cardList.get(randIntBankerThree);
    	 	cardList.remove(randIntBankerThree);
    	 	bankerCards.add(bankerCardThree);
    	 	if (bankerCards.get(2).equals("A"))
 	        {
                bankerTotal+=1;
            }
            else if (bankerCards.get(2).equals("K") || bankerCards.get(2).equals("Q") || bankerCards.get(2).equals("J"))
            {
                bankerTotal +=0;
            }
 	        else 
 	        {
 	            bankerTotal += Integer.parseInt(bankerCards.get(2));
 	        }
    	 	bankerTotal += bankerThirdValue;
    	 	if (bankerTotal>9)
    	 	{
    	 	    bankerTotal -= 10;
    	 	}
    	 	else if (bankerTotal>19)
    	 	{
    	 	    bankerTotal = 0;
    	 	}
    	 	else
    	 	{
    	 	    bankerTotal += 0;
    	 	}
    	 	System.out.println("Dealing the banker a new card... ");
    	 	bac.error();
    	 	System.out.println("The banker drew a " + bankerCardThree);
    	 	bac.error();
            System.out.println("The banker's cards are: ");
    	 	System.out.println(bankerCards);
    	 	System.out.println("The banker's baccarat score is " + bankerTotal);
    	 	System.out.println();
	 	}
	 	if ((playerThirdValue == 9 || playerThirdValue == 10) && bankerTotal<=3)
	 	{
	 	    Integer randIntBankerThree = (int)(Math.random()*47);
	 	    bankerCardThree = cardList.get(randIntBankerThree);
    	 	cardList.remove(randIntBankerThree);
    	 	bankerCards.add(bankerCardThree);
    	 	if (bankerCards.get(2).equals("A"))
 	        {
                bankerTotal+=1;
            }
            else if (bankerCards.get(2).equals("K") || bankerCards.get(2).equals("Q") || bankerCards.get(2).equals("J"))
            {
                bankerTotal +=0;
            }
 	        else 
 	        {
 	            bankerTotal += Integer.parseInt(bankerCards.get(2));
 	        }
    	 	bankerTotal += bankerThirdValue;
    	 	if (bankerTotal>9)
    	 	{
    	 	    bankerTotal -= 10;
    	 	}
    	 	else if (bankerTotal>19)
    	 	{
    	 	    bankerTotal = 0;
    	 	}
    	 	else
    	 	{
    	 	    bankerTotal += 0;
    	 	}
    	 	System.out.println("Dealing the banker a new card... ");
    	 	bac.error();
    	 	System.out.println("The banker drew a " + bankerCardThree);
    	 	bac.error();
            System.out.println("The banker's cards are: ");
    	 	System.out.println(bankerCards);
    	 	System.out.println("The banker's baccarat score is " + bankerTotal);
    	 	System.out.println();
	 	}
	 	if (playerTotal>bankerTotal)
	 	{
	 	    if (playerAmount>0)
	 	    {
	 	        System.out.println("The player wins! You win!");
	 	        total+= (amount*2)-amount;
	 	    }
	 	    else
	 	    {
	 	        System.out.println("The player wins! You lose.");
	 	        total -= amount;
	 	    }
	 	    return total;
	 	}
	 	else if (bankerTotal>playerTotal)
	 	{
	 	    if (bankerAmount>0)
	 	    {
	 	        System.out.println("The banker wins! You win!");
	 	        total+= (amount*1.95)-amount;
	 	    }
	 	    else
	 	    {
	 	        System.out.println("The banker wins! You lose.");
	 	        total -= amount;
	 	    }
	 	    return total;
	 	}
	 	else
	 	{
	 	    if (tieAmount>0)
	 	    {
	 	        System.out.println("The player and the banker tied. You win!");
	 	        total += (amount*8)-amount;
	 	    }
	 	    else
	 	    {
	 	        System.out.println("The player and the banker tied. You lose.");
	 	        total -= amount;
	 	    }
	 	    return total;
	 	}
    }
}