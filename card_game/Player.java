package card_game;
import java.util.*;
import card_game.*;

public class Player {

  private String name;
  private ArrayList<Card> hand;

  public Player(String name){
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

  public String getName(){
    return this.name;
  }

  public void setHand(Card card1, Card card2){
    this.hand.add(card1);
    this.hand.add(card2);
  }

  public int countHand(){
    return this.hand.size();
  }

  public int pointsInStartHand(Card card1, Card card2){
    int points = 0;
    int card1Points = card1.setCardValue();
    int card2Points = card2.setCardValue();
    points = (card1Points + card2Points);
    return points;
  }

}