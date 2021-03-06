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

  public String showHand(String card1, String card2){
      return "You have " + card1 + " & " + card2; 
    }

  public int pointsInStartHand(Card card1, Card card2){
    int handTotal = 0;
    int card1Value = card1.setCardValue();
    int card2Value = card2.setCardValue();
    handTotal = (card1Value + card2Value);
    return handTotal;
  }

}