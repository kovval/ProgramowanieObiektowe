package poker;

import java.util.*;

public class PokerGame
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        Scanner nkb=new Scanner(System.in);
        Random r=new Random();
        Double jackpot;
        System.out.println("Enter the number of people playing");
        int players=nkb.nextInt();
        List<PokerPlayer> player;
        PokerPlayer[] Playersstorage=new PokerPlayer[players];
        List<String> Names=new ArrayList<String>();
        List<Double> payin=new ArrayList<Double>();
        List<Integer> deck;
        player=new ArrayList<PokerPlayer>();
        Boolean playersinit=true;
        while(playersinit==true)
        {
            for(int x=0;x<players;x++)
            {
                System.out.println("Enter your name please, and then your pay in amount");
                Names.add(kb.nextLine().toLowerCase());
                payin.add(nkb.nextDouble());
            }
            System.out.print("\f");
            playersinit=false;
        }
        Boolean playing=true;
        while(playing==true)
        {
            deck=new ArrayList<Integer>(52);
            final Integer decksize=52;
            Boolean deckshuffled=true;
            while(deckshuffled==true)
            {
                while(deck.size()<decksize)
                {
                    Boolean selectRandom=true;
                    Integer currentRandom=0;
                    while(selectRandom==true)
                    {
                        Boolean comparecard=true;
                        currentRandom=r.nextInt(52)+1;
                        while(comparecard==true)
                        {
                            if(deck.contains(currentRandom))
                            {
                                comparecard=false;
                            }
                            else
                            {
                                selectRandom=false;
                                comparecard=false;
                            }
                        }
                    }
                    deck.add(currentRandom);
                    if(deck.size()==decksize)
                    {
                        deckshuffled=false;
                    }
                }
            }
            boolean card_distributor=true;
            while(card_distributor==true)
            {
                boolean playerstarter=true;
                Integer o=deck.size()-1;
                Integer pinit=0;
                Integer ps=1;
                while(playerstarter==true)
                {
                    Integer[] mycards= new Integer[2];
                    mycards[0]=deck.get(o);
                    deck.remove(deck.size()-1);
                    Integer newdecksize=deck.size();
                    Playersstorage[pinit]=new PokerPlayer(Names.get(pinit),payin.get(pinit),mycards);
                    player.add(Playersstorage[pinit]);
                    pinit++;
                    o=deck.size()-1;
                    if(ps==players)
                    {
                        playerstarter=false;
                        playing=false;
                        card_distributor=false;
                    }
                    ps++;
                }
            }
            Boolean playingCards=true;
            List<Integer> dealerHand=new ArrayList<Integer>();
            Integer dealing=deck.size()-1;
            jackpot=0.00;
            while(playingCards==true)
            {
                /*for(int x=0;x<3;x++)
                {
                    dealerHand.add(deck.get(dealing));
                    deck.remove(dealing);
                    dealing=deck.size()-1;
                }*/
                try
                {
                    Thread.sleep(1000/1);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("What is your name?");
                String name=kb.nextLine().toLowerCase();
                boolean betting=true;
                while(betting==true)
                {
                    System.out.println("Enter your bet");
                    Integer bet=nkb.nextInt();
                    Integer indexofbet=Names.indexOf(name);
                    if(bet>player.get(indexofbet).getMoney())
                    {
                        System.out.println("You can not bet that much without selling your first born childs soul, would you like to do this?");
                        String sellchild=kb.nextLine();
                        if(sellchild.equalsIgnoreCase("yes"))
                        {
                            jackpot+=bet;
                            betting=false;
                        }
                        else
                        {
                            betting=true;
                        }
                    }
                    else
                    {
                        jackpot+=bet;
                        betting=false;
                    }
                }
                System.out.println(jackpot);
                try
                {
                    Thread.sleep(1000/1);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("\f");
                if(Names.contains(name))
                {
                    Integer index=Names.indexOf(name);
                    System.out.println(Arrays.toString(player.get(index).getCards()));

                    Boolean notfinished=true;
                    while(notfinished==true)
                    {
                        try
                        {
                            Thread.sleep(1000/1);
                        }
                        catch(InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                        System.out.println("Are you finished looking at your cards "+name+"?");
                        String done=kb.nextLine();
                        if(done.equalsIgnoreCase("Yes"))
                        {
                            System.out.println("\f");
                            notfinished=false;
                        }
                    }
                }
            }
            List<Integer> gameEnd=new ArrayList<Integer>();
            List<Integer> comparison=new ArrayList<Integer>();
            Boolean checkplayersscore=true;
            while(checkplayersscore==true)
            {
                for(Integer x=0;x<players;x++)
                {
                    if(player.get(x).getMoney()==0.00)
                    {
                        System.out.println(player.get(x).getMoney()+player.get(x).getName());
                        gameEnd.add(1);
                    }
                    else
                    {
                        System.out.println(player.get(x).getMoney()+player.get(x).getName());
                        gameEnd.add(2);
                    }
                    comparison.add(2);
                }
                Boolean continuecheck=true;
                Integer checkover=1;
                while(continuecheck==true)
                {
                    if(gameEnd.contains(1))
                    {
                        Integer remove=gameEnd.indexOf(1);
                        gameEnd.remove(remove);
                        comparison.remove(remove);
                        Names.remove(remove);
                        payin.remove(remove);
                        player.remove(remove);
                        Playersstorage[remove]=null;
                    }
                    if(gameEnd.containsAll(comparison))
                    {
                        continuecheck=false;
                        checkplayersscore=false;
                        playing=false;
                    }
                    if(checkover==players)
                    {
                        continuecheck=false;
                        checkplayersscore=false;
                    }
                    if(player.size()==0)
                    {
                        continuecheck=false;
                        checkplayersscore=false;
                        playing=false;
                    }
                    checkover++;
                }
            }
        }
    }
}

class PokerPlayer
{
    private String name;
    private Double money;
    private Integer[] cards;
    public PokerPlayer(String na, Double n, Integer[] card)
    {
        name = na;
        money=n+0.00;
        cards=new Integer[card.length];
        cards[0]=card[0];
        cards[1]=null;
    }
    public Integer BJScore(List<Integer> mycards)
    {
       /*unfinished code*/

        return null;
    }
    public Integer[] getCards()
    {
        return cards;
    }
    public void setCards(Integer card)
    {
        for(int x=0;x<cards.length;x++)
            if(cards[x]==null)
                cards[1]=card;
    }
    public void setMoney(Double d)
    {
        money-=(d+0.00);
    }
    public Double getMoney()
    {
        return money;
    }
    public String getName()
    {
        return name;
    }
}