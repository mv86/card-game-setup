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

  // public int cardInHandCount(){
  //   return this.hand.size();
  // }

}