import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.Comparator;
public class Poker
{
    private String playerCardOne;
    private String playerCardTwo;
    private String skeletonOneCardOne;
    private String skeletonOneCardTwo;
    private String skeletonTwoCardOne;
    private String skeletonTwoCardTwo;
    private String skeletonThreeCardOne;
    private String skeletonThreeCardTwo;
    private String commonCardOne;
    private String commonCardTwo;
    private String commonCardThree;
    private String commonCardFour;
    private String commonCardFive;
    private String firstChoice;
    private String pair1Value = "";
    private String pair2Value = "";
    private String twoPairValue = "";
    private String threeOfAKindValue = "";
    private String straightValue = "";
    private String flushValue = "";
    private String fullHouseValue = "";
    private String fourOfAKindValue = "";
    private String straightFlushValue = "";
    private String royalStraightFlushValue = "";
    private ArrayList<String> skeletonOneCards = new ArrayList<String>();
    private ArrayList<String> skeletonTwoCards = new ArrayList<String>();
    private ArrayList<String> skeletonThreeCards = new ArrayList<String>();
    private ArrayList<String> commonCards = new ArrayList<String>();
    private boolean pair = false;
    private boolean twoPair = false;
    private boolean threeOfAKind = false;
    private boolean straight = false;
    private boolean flush = false;
    private boolean fullHouse = false;
    private boolean fourOfAKind = false;
    private boolean straightFlush = false;
    private boolean royalStraightFlush = false;
    private int score;
    private int clubTotal;
    private int spadeTotal;
    private int heartTotal;
    private int diamondTotal;
    private int callAmount;
    private int bet;
    private int skeletonOneAmount;
    private int skeletonTwoAmount;
    private int skeletonThreeAmount;
    private int potTotal;
    
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
    
    public int check(ArrayList<String> al, ArrayList<String> common)
    {
        ArrayList<String> temp = new ArrayList<String>();
        ArrayList<String> temp2 = new ArrayList<String>();
        bet = 0;
        score = 0;
        temp.add(al.get(1));
        temp.add(al.get(0));
        for (int w = 0; w<common.size(); w++)
        {
            temp.add(common.get(w));
        }
        int size = temp.size();
        boolean hasA = false;
        boolean has2 = false;
        boolean has3 = false;
        boolean has4 = false;
        boolean has5 = false;
        boolean has6 = false;
        boolean has7 = false;
        boolean has8 = false;
        boolean has9 = false;
        boolean has1 = false;
        boolean hasJ = false;
        boolean hasQ = false;
        boolean hasK = false;
        pair = false;
        twoPair = false;
        threeOfAKind = false;
        straight = false;
        flush = false;
        fullHouse = false;
        fourOfAKind = false;
        straightFlush = false;
        royalStraightFlush = false;
        
        //pair
        for (int i = 0; i < size-1; i++) 
        {
            for (int j = i + 1; j < size; j++) 
            {
                if ((temp.get(i).substring(0,1)).equals((temp.get(j)).substring(0,1))) 
                {
                    pair = true;
                    score = 1;
                    pair1Value = (temp.get(i).substring(0,1));
                }
            }
        }
        //two pair
        if (pair==true)
        {
            for (int i = 0; i < size-1; i++) 
            {
                for (int j = i + 1; j < size; j++) 
                {
                    if ((temp.get(i).substring(0,1)).equals((temp.get(j)).substring(0,1))) 
                    {
                        pair2Value = (temp.get(i).substring(0,1));
                        if (!(pair1Value.equals(pair2Value)))
                        {
                            twoPair = true;
                            score = 2;
                            twoPairValue = pair1Value + pair2Value;
                        }
                    }
                }
            }
        }
        //three of a kind
        for (int i = 0; i < temp.size(); i++) 
        {
            for (int j = i + 1; j < temp.size(); j++) 
            {
                for (int h = j+1; h< temp.size(); h++)
                {
                    if ((temp.get(i).substring(0,1)).equals((temp.get(j)).substring(0,1)) && (temp.get(j).substring(0,1)).equals((temp.get(h)).substring(0,1))) 
                    {
                        threeOfAKind = true;
                        score = 3;
                        threeOfAKindValue = (temp.get(h).substring(0,1));
                    }
                }
                
            }
        }
        //straight
        for(int i = 0; i<temp.size();i++)
        {
            if (temp.get(i).substring(0,1).equals("A"))
            {
                hasA = true;
            }
            else if (temp.get(i).substring(0,1).equals("2"))
            {
                has2 = true;
            }
            else if (temp.get(i).substring(0,1).equals("3"))
            {
                has3 = true;
            }
            else if (temp.get(i).substring(0,1).equals("4"))
            {
                has4 = true;
            }
            else if (temp.get(i).substring(0,1).equals("5"))
            {
                has5 = true;
            }
            else if (temp.get(i).substring(0,1).equals("6"))
            {
                has6 = true;
            }
            else if (temp.get(i).substring(0,1).equals("7"))
            {
                has7 = true;
            }
            else if (temp.get(i).substring(0,1).equals("8"))
            {
                has8 = true;
            }
            else if (temp.get(i).substring(0,1).equals("9"))
            {
                has9 = true;
            }
            else if (temp.get(i).substring(0,1).equals("1"))
            {
                has1 = true;
            }
            else if (temp.get(i).substring(0,1).equals("J"))
            {
                hasJ = true;
            }
            else if (temp.get(i).substring(0,1).equals("Q"))
            {
                hasQ = true;
            }
            else if (temp.get(i).substring(0,1).equals("K"))
            {
                hasK = true;
            }
        }
        if (hasA && has2 && has3 && has4 && has5)
        {
            straight = true;
        }
        else if (has2 && has3 && has4 && has5 && has6)
        {
            straight = true;
        }
        else if (has3 && has4 && has5 && has6 && has7)
        {
            straight = true;
        }
        else if (has4 && has5 && has6 && has7 && has8)
        {
            straight = true;
        }
        else if (has5 && has6 && has7 && has8 && has9)
        {
            straight = true;
        }
        else if (has6 && has7 && has8 && has9 && has1)
        {
            straight = true;
        }
        else if (has7 && has8 && has9 && has1 && hasJ)
        {
            straight = true;
        }
        else if (has8 && has9 && has1 && hasJ && hasQ)
        {
            straight = true;
        }
        else if (has9 && has1 && hasJ && hasQ && hasK)
        {
            straight = true;
        }
        else if (has1 && hasJ && hasQ && hasK && hasA)
        {
            straight = true;
        }
        else
        {
            straight = false;
        }
        if (straight)
        {
            score = 4;
        }
        //flush
        diamondTotal = 0;
        heartTotal = 0;
        clubTotal = 0;
        spadeTotal = 0;
        ArrayList<String> diamonds = new ArrayList<String>();
        ArrayList<String> hearts = new ArrayList<String>();
        ArrayList<String> clubs = new ArrayList<String>();
        ArrayList<String> spades = new ArrayList<String>();
        for (int i = 0; i<temp.size();i++)
        {
            int length = temp.get(i).length();
            if (temp.get(i).substring(length-1,length).equals("♥"))
            {
                heartTotal++;
                diamonds.add(temp.get(i));
            }
            if (temp.get(i).substring(length-1,length).equals("♦"))
            {
                diamondTotal++;
                hearts.add(temp.get(i));
            }
            if (temp.get(i).substring(length-1,length).equals("♣"))
            {
                clubTotal++;
                clubs.add(temp.get(i));
            }
            if (temp.get(i).substring(length-1,length).equals("♠"))
            {
                spadeTotal++;
                spades.add(temp.get(i));
            }
        }
        if ((heartTotal>=5) || (diamondTotal>=5) || (clubTotal>=5) || (spadeTotal>=5))
        {
            flush = true;
            score = 5;
        }
        //full house
        if ((pair && threeOfAKind) && !(pair1Value.equals(threeOfAKindValue)))
        {
            System.out.println(pair1Value);
            System.out.println(threeOfAKindValue);
            fullHouse = true;
            score = 6;
            fullHouseValue = threeOfAKindValue + pair1Value;
        }
        //four of a kind
        for (int i = 0; i < temp.size(); i++) 
        {
            for (int j = i + 1; j < temp.size(); j++) 
            {
                for (int h = j+1; h< temp.size(); h++)
                {
                    for (int g = h+1; g<temp.size();g++)
                    {
                        if ((temp.get(i).substring(0,1)).equals((temp.get(j)).substring(0,1)) && (temp.get(j).substring(0,1)).equals((temp.get(h)).substring(0,1)) && (temp.get(h).substring(0,1)).equals((temp.get(g)).substring(0,1))) 
                        {
                            fourOfAKind = true;
                            score = 7;
                            fourOfAKindValue = (temp.get(i).substring(0,1));
                        }
                    }
                    
                }
                
            }
        }
        //straight flush
        boolean straightFlushDiamonds = false;
        boolean straightFlushHearts = false;
        boolean straightFlushClubs = false;
        boolean straightFlushSpades = false;
        if (flush)
        {
            for(int i = 0; i<diamonds.size();i++)
            {
                if (diamonds.get(i).substring(0,1).equals("A"))
                {
                    hasA = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("2"))
                {
                    has2 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("3"))
                {
                    has3 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("4"))
                {
                    has4 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("5"))
                {
                    has5 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("6"))
                {
                    has6 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("7"))
                {
                    has7 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("8"))
                {
                    has8 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("9"))
                {
                    has9 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("1"))
                {
                    has1 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("J"))
                {
                    hasJ = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("Q"))
                {
                    hasQ = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("K"))
                {
                    hasK = true;
                }
            }
            if (hasA && has2 && has3 && has4 && has5)
            {
                straightFlushDiamonds = true;
            }
            else if (has2 && has3 && has4 && has5 && has6)
            {
                straightFlushDiamonds = true;
            }
            else if (has3 && has4 && has5 && has6 && has7)
            {
                straightFlushDiamonds = true;
            }
            else if (has4 && has5 && has6 && has7 && has8)
            {
                straightFlushDiamonds = true;
            }
            else if (has5 && has6 && has7 && has8 && has9)
            {
                straightFlushDiamonds = true;
            }
            else if (has6 && has7 && has8 && has9 && has1)
            {
                straightFlushDiamonds = true;
            }
            else if (has7 && has8 && has9 && has1 && hasJ)
            {
                straightFlushDiamonds = true;
            }
            else if (has8 && has9 && has1 && hasJ && hasQ)
            {
                straightFlushDiamonds = true;
            }
            else if (has9 && has1 && hasJ && hasQ && hasK)
            {
                straightFlushDiamonds = true;
            }
            else if (has1 && hasJ && hasQ && hasK && hasA)
            {
                straightFlushDiamonds = true;
            }
            else
            {
                straightFlushDiamonds = false;
            }
        
        for(int i = 0; i<hearts.size();i++)
            {
                if (hearts.get(i).substring(0,1).equals("A"))
                {
                    hasA = true;
                }
                else if (hearts.get(i).substring(0,1).equals("2"))
                {
                    has2 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("3"))
                {
                    has3 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("4"))
                {
                    has4 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("5"))
                {
                    has5 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("6"))
                {
                    has6 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("7"))
                {
                    has7 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("8"))
                {
                    has8 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("9"))
                {
                    has9 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("1"))
                {
                    has1 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("J"))
                {
                    hasJ = true;
                }
                else if (hearts.get(i).substring(0,1).equals("Q"))
                {
                    hasQ = true;
                }
                else if (hearts.get(i).substring(0,1).equals("K"))
                {
                    hasK = true;
                }
            }
            if (hasA && has2 && has3 && has4 && has5)
            {
                straightFlushHearts = true;
            }
            else if (has2 && has3 && has4 && has5 && has6)
            {
                straightFlushHearts = true;
            }
            else if (has3 && has4 && has5 && has6 && has7)
            {
                straightFlushHearts = true;
            }
            else if (has4 && has5 && has6 && has7 && has8)
            {
                straightFlushHearts = true;
            }
            else if (has5 && has6 && has7 && has8 && has9)
            {
                straightFlushHearts = true;
            }
            else if (has6 && has7 && has8 && has9 && has1)
            {
                straightFlushHearts = true;
            }
            else if (has7 && has8 && has9 && has1 && hasJ)
            {
                straightFlushHearts = true;
            }
            else if (has8 && has9 && has1 && hasJ && hasQ)
            {
                straightFlushHearts = true;
            }
            else if (has9 && has1 && hasJ && hasQ && hasK)
            {
                straightFlushHearts = true;
            }
            else if (has1 && hasJ && hasQ && hasK && hasA)
            {
                straightFlushHearts = true;
            }
            else
            {
                straightFlushHearts = false;
            }
        
        for(int i = 0; i<clubs.size();i++)
            {
                if (clubs.get(i).substring(0,1).equals("A"))
                {
                    hasA = true;
                }
                else if (clubs.get(i).substring(0,1).equals("2"))
                {
                    has2 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("3"))
                {
                    has3 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("4"))
                {
                    has4 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("5"))
                {
                    has5 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("6"))
                {
                    has6 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("7"))
                {
                    has7 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("8"))
                {
                    has8 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("9"))
                {
                    has9 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("1"))
                {
                    has1 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("J"))
                {
                    hasJ = true;
                }
                else if (clubs.get(i).substring(0,1).equals("Q"))
                {
                    hasQ = true;
                }
                else if (clubs.get(i).substring(0,1).equals("K"))
                {
                    hasK = true;
                }
            }
            if (hasA && has2 && has3 && has4 && has5)
            {
                straightFlushClubs = true;
            }
            else if (has2 && has3 && has4 && has5 && has6)
            {
                straightFlushClubs = true;
            }
            else if (has3 && has4 && has5 && has6 && has7)
            {
                straightFlushClubs = true;
            }
            else if (has4 && has5 && has6 && has7 && has8)
            {
                straightFlushClubs = true;
            }
            else if (has5 && has6 && has7 && has8 && has9)
            {
                straightFlushClubs = true;
            }
            else if (has6 && has7 && has8 && has9 && has1)
            {
                straightFlushClubs = true;
            }
            else if (has7 && has8 && has9 && has1 && hasJ)
            {
                straightFlushClubs = true;
            }
            else if (has8 && has9 && has1 && hasJ && hasQ)
            {
                straightFlushClubs = true;
            }
            else if (has9 && has1 && hasJ && hasQ && hasK)
            {
                straightFlushClubs = true;
            }
            else if (has1 && hasJ && hasQ && hasK && hasA)
            {
                straightFlushClubs = true;
            }
            else
            {
                straightFlushClubs = false;
            }
        
        for(int i = 0; i<spades.size();i++)
            {
                if (spades.get(i).substring(0,1).equals("A"))
                {
                    hasA = true;
                }
                else if (spades.get(i).substring(0,1).equals("2"))
                {
                    has2 = true;
                }
                else if (spades.get(i).substring(0,1).equals("3"))
                {
                    has3 = true;
                }
                else if (spades.get(i).substring(0,1).equals("4"))
                {
                    has4 = true;
                }
                else if (spades.get(i).substring(0,1).equals("5"))
                {
                    has5 = true;
                }
                else if (spades.get(i).substring(0,1).equals("6"))
                {
                    has6 = true;
                }
                else if (spades.get(i).substring(0,1).equals("7"))
                {
                    has7 = true;
                }
                else if (spades.get(i).substring(0,1).equals("8"))
                {
                    has8 = true;
                }
                else if (spades.get(i).substring(0,1).equals("9"))
                {
                    has9 = true;
                }
                else if (spades.get(i).substring(0,1).equals("1"))
                {
                    has1 = true;
                }
                else if (spades.get(i).substring(0,1).equals("J"))
                {
                    hasJ = true;
                }
                else if (spades.get(i).substring(0,1).equals("Q"))
                {
                    hasQ = true;
                }
                else if (spades.get(i).substring(0,1).equals("K"))
                {
                    hasK = true;
                }
            }
            if (hasA && has2 && has3 && has4 && has5)
            {
                straightFlushSpades = true;
            }
            else if (has2 && has3 && has4 && has5 && has6)
            {
                straightFlushSpades = true;
            }
            else if (has3 && has4 && has5 && has6 && has7)
            {
                straightFlushSpades = true;
            }
            else if (has4 && has5 && has6 && has7 && has8)
            {
                straightFlushSpades = true;
            }
            else if (has5 && has6 && has7 && has8 && has9)
            {
                straightFlushSpades = true;
            }
            else if (has6 && has7 && has8 && has9 && has1)
            {
                straightFlushSpades = true;
            }
            else if (has7 && has8 && has9 && has1 && hasJ)
            {
                straightFlushSpades = true;
            }
            else if (has8 && has9 && has1 && hasJ && hasQ)
            {
                straightFlushSpades = true;
            }
            else if (has9 && has1 && hasJ && hasQ && hasK)
            {
                straightFlushSpades = true;
            }
            else if (has1 && hasJ && hasQ && hasK && hasA)
            {
                straightFlushSpades = true;
            }
            else
            {
                straightFlushSpades = false;
            }
        }
        if (straightFlushDiamonds || straightFlushHearts || straightFlushClubs || straightFlushSpades)
        {
            score = 8;
            straightFlush = true;
        }
        //royal straight Flush
        if (straightFlushDiamonds)
        {
            for(int i = 0; i<diamonds.size();i++)
            {
                if (diamonds.get(i).substring(0,1).equals("A"))
                {
                    hasA = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("2"))
                {
                    has2 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("3"))
                {
                    has3 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("4"))
                {
                    has4 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("5"))
                {
                    has5 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("6"))
                {
                    has6 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("7"))
                {
                    has7 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("8"))
                {
                    has8 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("9"))
                {
                    has9 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("1"))
                {
                    has1 = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("J"))
                {
                    hasJ = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("Q"))
                {
                    hasQ = true;
                }
                else if (diamonds.get(i).substring(0,1).equals("K"))
                {
                    hasK = true;
                }
            }
            if (hasA && hasK && hasQ && hasJ && has1)
            {
                royalStraightFlush = true;
                score = 9;
            }
        }
        if (straightFlushHearts)
        {
            for(int i = 0; i<hearts.size();i++)
            {
                if (hearts.get(i).substring(0,1).equals("A"))
                {
                    hasA = true;
                }
                else if (hearts.get(i).substring(0,1).equals("2"))
                {
                    has2 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("3"))
                {
                    has3 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("4"))
                {
                    has4 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("5"))
                {
                    has5 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("6"))
                {
                    has6 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("7"))
                {
                    has7 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("8"))
                {
                    has8 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("9"))
                {
                    has9 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("1"))
                {
                    has1 = true;
                }
                else if (hearts.get(i).substring(0,1).equals("J"))
                {
                    hasJ = true;
                }
                else if (hearts.get(i).substring(0,1).equals("Q"))
                {
                    hasQ = true;
                }
                else if (hearts.get(i).substring(0,1).equals("K"))
                {
                    hasK = true;
                }
            }
            if (hasA && hasK && hasQ && hasJ && has1)
            {
                royalStraightFlush = true;
                score = 9;
            }
        }
        if (straightFlushClubs)
        {
            for(int i = 0; i<clubs.size();i++)
            {
                if (clubs.get(i).substring(0,1).equals("A"))
                {
                    hasA = true;
                }
                else if (clubs.get(i).substring(0,1).equals("2"))
                {
                    has2 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("3"))
                {
                    has3 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("4"))
                {
                    has4 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("5"))
                {
                    has5 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("6"))
                {
                    has6 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("7"))
                {
                    has7 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("8"))
                {
                    has8 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("9"))
                {
                    has9 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("1"))
                {
                    has1 = true;
                }
                else if (clubs.get(i).substring(0,1).equals("J"))
                {
                    hasJ = true;
                }
                else if (clubs.get(i).substring(0,1).equals("Q"))
                {
                    hasQ = true;
                }
                else if (clubs.get(i).substring(0,1).equals("K"))
                {
                    hasK = true;
                }
            }
            if (hasA && hasK && hasQ && hasJ && has1)
            {
                royalStraightFlush = true;
                score = 9;
            }
        }
        if (straightFlushSpades)
        {
            for(int i = 0; i<spades.size();i++)
            {
                if (spades.get(i).substring(0,1).equals("A"))
                {
                    hasA = true;
                }
                else if (spades.get(i).substring(0,1).equals("2"))
                {
                    has2 = true;
                }
                else if (spades.get(i).substring(0,1).equals("3"))
                {
                    has3 = true;
                }
                else if (spades.get(i).substring(0,1).equals("4"))
                {
                    has4 = true;
                }
                else if (spades.get(i).substring(0,1).equals("5"))
                {
                    has5 = true;
                }
                else if (spades.get(i).substring(0,1).equals("6"))
                {
                    has6 = true;
                }
                else if (spades.get(i).substring(0,1).equals("7"))
                {
                    has7 = true;
                }
                else if (spades.get(i).substring(0,1).equals("8"))
                {
                    has8 = true;
                }
                else if (spades.get(i).substring(0,1).equals("9"))
                {
                    has9 = true;
                }
                else if (spades.get(i).substring(0,1).equals("1"))
                {
                    has1 = true;
                }
                else if (spades.get(i).substring(0,1).equals("J"))
                {
                    hasJ = true;
                }
                else if (spades.get(i).substring(0,1).equals("Q"))
                {
                    hasQ = true;
                }
                else if (spades.get(i).substring(0,1).equals("K"))
                {
                    hasK = true;
                }
            }
            if (hasA && hasK && hasQ && hasJ && has1)
            {
                royalStraightFlush = true;
                score = 9;
            }
        }
        
        if (callAmount>10)
        {
            int rand5 = (int)(Math.random()*101);
            if (rand5 <50)
            {
                if (score>6)
                {
                    int rand1 = (int)(Math.random()*200)+300;
                    bet = rand1;
                    callAmount = bet;
                }
                else if (score>3)
                {
                    int rand2 = (int)(Math.random()*200)+100;
                    bet = rand2;
                    callAmount = bet;
                }
                else 
                {
                    int rand3 = (int)(Math.random()*100)+1;
                    int rand4 = (int)(Math.random()*200)+50;
                    if (rand3<11)
                    {
                        bet = 0;
                        callAmount = bet;
                    }
                    else if (rand3>=11 && rand3<71)
                    {
                        bet = rand4;
                        callAmount = bet;
                    }
                    else
                    {
                        bet = callAmount;
                        callAmount = bet;
                    }
                }
            }
            else
            {
                bet = callAmount;
            }
        }
        
        System.out.println("Call amount: " + callAmount);
        System.out.println("bet amount: " + bet);
        
        return bet;
        
    }
    public int playPoker(int total)
    {
        Poker p = new Poker();
        boolean allIn = false;
        
        String[] cards = {"A♦", "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦", "9♦", "10♦", "J♦", "Q♦", "K♦", "A♥", "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥","A♣", "2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣","A♠", "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠"};
        ArrayList<String> cardList = new ArrayList<String>(Arrays.asList(cards));
        ArrayList<String> playerCards = new ArrayList<String>();
        
        
        int randIntOne = (int)(Math.random()*52);
	 	playerCardOne = cardList.get(randIntOne);
	 	cardList.remove(randIntOne);
	 	playerCards.add(playerCardOne);
	 	int randIntSkeleton1One = (int)(Math.random()*51);
	 	skeletonOneCardOne = cardList.get(randIntSkeleton1One);
	 	cardList.remove(randIntSkeleton1One);
	 	skeletonOneCards.add(skeletonOneCardOne);
	 	int randIntSkeleton2One = (int)(Math.random()*50);
	 	skeletonTwoCardOne = cardList.get(randIntSkeleton2One);
	 	cardList.remove(randIntSkeleton2One);
	 	skeletonTwoCards.add(skeletonTwoCardOne);
	 	int randIntSkeleton3One = (int)(Math.random()*49);
	 	skeletonThreeCardOne = cardList.get(randIntSkeleton3One);
	 	cardList.remove(randIntSkeleton3One);
	 	skeletonThreeCards.add(skeletonThreeCardOne);
	 	
	 	int randIntTwo = (int)(Math.random()*48);
	 	playerCardTwo = cardList.get(randIntTwo);
	 	cardList.remove(randIntTwo);
	 	playerCards.add(playerCardTwo);
	 	int randIntSkeleton1Two = (int)(Math.random()*47);
	 	skeletonOneCardTwo = cardList.get(randIntSkeleton1Two);
	 	cardList.remove(randIntSkeleton1Two);
	 	skeletonOneCards.add(skeletonOneCardTwo);
	 	int randIntSkeleton2Two = (int)(Math.random()*46);
	 	skeletonTwoCardTwo = cardList.get(randIntSkeleton2Two);
	 	cardList.remove(randIntSkeleton2Two);
	 	skeletonTwoCards.add(skeletonTwoCardTwo);
	 	int randIntSkeleton3Two = (int)(Math.random()*45);
	 	skeletonThreeCardTwo = cardList.get(randIntSkeleton3Two);
	 	cardList.remove(randIntSkeleton3Two);
	 	skeletonThreeCards.add(skeletonThreeCardTwo);
	 	
	 	System.out.println("Welcome to the poker table! You will play against three skeletons ");
	 	System.out.println();
	 	System.out.println("In case you don't know how to play, here is a chart of ways to win:");
	 	System.out.println("1. Royal Flush: The highest straight flush, from 10 to Ace. Ex: 10♣, J♣, Q♣, K♣, A♣");
	 	System.out.println("2. Straight Flush: Five cards in sequence and of the same suit. Ex: 3♥, 4♥, 5♥, 6♥, 7♥ ");
	 	System.out.println("3. Four of a Kind: Four cards of the same value. Ex: 6♦, 6♥, 6♣, 6♠");
	 	System.out.println("4. Full House: Three of a kind and a pair. Ex: 7♦, 7♣, 7♠, 8♥, 8♠");
	 	System.out.println("5. Flush: Five cards of the same suit, not in sequence. Ex: 4♦, 7♦, 9♦, K♦, A♦");
	 	System.out.println("6. Straight: Five cards in sequence, but not of the same suit. Ex: 3♦, 4♣, 5♠, 6♦, 7♥");
	 	System.out.println("7. Three of a Kind: Three cards of the same value. Ex: 3♦, 3♠, 3♣");
	 	System.out.println("8. Two Pair: Two sets of pairs. Ex: 2♣, 2♠, 5♦, 5♣");
	 	System.out.println("9. Pair: Two cards of the same value. Ex: J♦, J♠");
	 	System.out.println("10. High Card: The highest card in your hand wins if no other hand is made. Ex: A♦ beats K♠");
	 	System.out.println();
        p.error(3);
        
        int amount = 0;
        System.out.println("This poker table has a small blind and a big blind. They will rotate every turn.");
        System.out.println();
        int sbNum = 0;
        int bbNum = 0;
        if (amount>1000)
        {
            skeletonOneAmount = 1000;
            skeletonTwoAmount = 1000;
            skeletonThreeAmount = 1000;
        }
        else if ((amount>500)&&(amount<=1000))
        {
            skeletonOneAmount = 500;
            skeletonTwoAmount = 500;
            skeletonThreeAmount = 500;
        }
        else
        {
            skeletonOneAmount = 250;
            skeletonTwoAmount = 250;
            skeletonThreeAmount = 250;
        }
        
        sbNum = (int)(Math.random()*4)+1;
	 	if (sbNum == 4)
	 	{
	 	    bbNum = 1;
	 	}
	 	else
	 	{
	 	    bbNum = sbNum+1;
	 	}

	 	if (sbNum ==1)
	 	{
	 	    System.out.println("Skeleton One is the small blind. $5 has been deducted from their total and put in the pot.");
	 	    skeletonOneAmount -= 5;
	 	    potTotal +=5;
	 	    sbNum++;
	 	}
	 	else if (sbNum==2)
	 	{
	 	    System.out.println("Skeleton Two is the small blind. $5 has been deducted from their total and put in the pot.");
	 	    skeletonTwoAmount -=5;
	 	    potTotal+=5;
	 	    sbNum++;
	 	}
	 	else if (sbNum==3)
	 	{
	 	    System.out.println("Skeleton Three is the small blind. $5 has been deducted from their total and put in the pot.");
	 	    skeletonThreeAmount-=5;
	 	    potTotal+=5;
	 	    sbNum++;
	 	}
	 	else if (sbNum==4)
	 	{
	 	    System.out.println("You are the small blind. $5 has been deducted from your total and put in the pot.");
	 	    if (total>=5)
	 	    {
	 	        total-=5;
	 	        potTotal+=5;
	 	    }
	 	    else
	 	    {
	 	        potTotal+=total;
	 	        total = 0;
	 	    }
	 	    sbNum=1;
	 	    if ((total == 0)|| (total<0))
	 	    {
	 	        allIn = true;
	 	    }
	 	}
	 	
	 	if (bbNum == 1)
	 	{
	 	    System.out.println("Skeleton One is the big blind. $10 has been deducted from their total and put in the pot.");
	 	    skeletonOneAmount -= 10;
	 	    potTotal +=10;
	 	    bbNum++;
	 	}
	 	else if (bbNum==2)
	 	{
	 	    System.out.println("Skeleton Two is the big blind. $10 has been deducted from their total and put in the pot.");
	 	    skeletonTwoAmount -=10;
	 	    potTotal+=10;
	 	    bbNum++;
	 	}
	 	else if (bbNum==3)
	 	{
	 	    System.out.println("Skeleton Three is the big blind. $10 has been deducted from their total and put in the pot.");
	 	    skeletonThreeAmount-=10;
	 	    potTotal+=10;
	 	    bbNum++;
	 	}
	 	else if (bbNum==4)
	 	{
	 	    System.out.println("You are the big blind. $10 has been deducted from your total and put in the pot.");
	 	    if (total>=10)
	 	    {
	 	        total-=10;
	 	        potTotal+=10;
	 	    }
	 	    else
	 	    {
	 	        potTotal+=total;
	 	        total = 0;
	 	    }
	 	    bbNum=1;
	 	    if ((total == 0)|| (total<0))
	 	    {
	 	        allIn = true;
	 	    }
	 	}
	 	p.error(5);
	 	System.out.println("Pot Total: "+potTotal);
	 	System.out.println("Your total: "+total);
	 	p.error(3);
	 	System.out.println();
	 	System.out.println("Skeleton One Total: " + skeletonOneAmount);
	 	System.out.println("Skeleton Two Total: " + skeletonTwoAmount);
	 	System.out.println("Skeleton Three Total: " + skeletonThreeAmount);
	 	System.out.println();
	 	p.error(3);
	 	System.out.println("Dealing the cards out...");
	 	p.error(4);
	 	
	 	System.out.println("Your cards are: ");
	 	System.out.println(playerCards);
	 	p.error(3);
	 	
	 	if (allIn == false)
	 	{
    	 	System.out.println("Input whether you want to raise 'r', call 'c', or fold 'f' ");
    	 	Scanner first = new Scanner(System.in);
    	 	firstChoice = first.nextLine();
    	 	if (firstChoice.equals("r"))
    	 	{
    	 	    System.out.println("You currently have " + total + " dollars. Enter an amount the amount you want to raise: ");
        	 	Scanner betInput = new Scanner(System.in);
        	 	amount += Integer.parseInt(betInput.nextLine());
        	 	while (amount > total)
        	 	{
        	 	    System.out.println("Select an amount within your total.");
        	 	    Scanner newBetInput = new Scanner(System.in);
        	 	    amount = Integer.parseInt(newBetInput.nextLine());
        	 	} 
        	 	callAmount = amount;
    	 	}
    	 	if (firstChoice.equals("f"))
    	 	{
    	 	    System.out.println("You fold.");
    	 	    p.error(2);
    	 	    return total;
    	 	}
    	 	if (firstChoice.equals("c"))
    	 	{
    	 	    amount = 10;
    	 	    callAmount = 10;
    	 	}
	 	}
	 	
	 	
	 	
	 	int randIntCommonCard1 = (int)(Math.random()*44);
	 	commonCardOne = cardList.get(randIntCommonCard1);
	 	cardList.remove(randIntCommonCard1);
	 	commonCards.add(commonCardOne);
	 	int randIntCommonCard2 = (int)(Math.random()*43);
	 	commonCardTwo = cardList.get(randIntCommonCard2);
	 	cardList.remove(randIntCommonCard2);
	 	commonCards.add(commonCardTwo);
	 	int randIntCommonCard3 = (int)(Math.random()*42);
	 	commonCardThree = cardList.get(randIntCommonCard3);
	 	cardList.remove(randIntCommonCard3);
	 	commonCards.add(commonCardThree);
	 	
	 	System.out.println("Dealing the flop...");
	 	p.error(3);
	 	System.out.println("The community cards are:");
	 	System.out.println(commonCards);
	 	p.error(3);
	 	
	 	//flop check for bots
	 	p.check(skeletonOneCards, commonCards);
	 	p.check(skeletonTwoCards, commonCards);
	 	p.check(skeletonThreeCards, commonCards);
	 	
	 	int randIntCommonCard4 = (int)(Math.random()*41);
	 	commonCardFour = cardList.get(randIntCommonCard4);
	 	cardList.remove(randIntCommonCard4);
	 	commonCards.add(commonCardFour);
	 	
	 	System.out.println("Dealing the turn...");
	 	p.error(3);
	 	System.out.println("The turn was a " + commonCards.get(commonCards.size()-1));
	 	p.error(3);
	 	System.out.println("The community cards are now: ");
	 	System.out.println(commonCards);
	 	p.error(3);
	 	
	 	//turn check for bots
	 	p.check(skeletonOneCards, commonCards);
	 	p.check(skeletonTwoCards, commonCards);
	 	p.check(skeletonThreeCards, commonCards);
	 	
	 	int randIntCommonCard5 = (int)(Math.random()*40);
	 	commonCardFive = cardList.get(randIntCommonCard5);
	 	cardList.remove(randIntCommonCard5);
	 	commonCards.add(commonCardFive);
	 	
	 	System.out.println("Dealing the river...");
	 	p.error(3);
	 	System.out.println("The river was a " + commonCards.get(commonCards.size()-1));
	 	p.error(3);
	 	System.out.println("The community cards are now : ");
	 	System.out.println(commonCards);
	 	p.error(3);
	 	
	 	//river check for bots
	 	p.check(skeletonOneCards, commonCards);
	 	p.check(skeletonTwoCards, commonCards);
	 	p.check(skeletonThreeCards, commonCards);

	    return total;
    }
}
