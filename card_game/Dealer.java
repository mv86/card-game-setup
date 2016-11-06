package card_game;
import java.util.*;
import card_game.*;

public class Dealer {

  private String name;
  private ArrayList<Card> hand;

  public Dealer(String name){
    this.name = name;
    this.hand = new ArrayList<Card>();
  }

  public String getName(){
    return this.name;
  }

  // public ArrayList<Card> getHand(){
  //   return this.hand
  // }
  // public ArrayList<Card> getNewHand(){
  //   // ArrayList<Card> cardsFromDeck = new Deck.builtDeck().get(1,3);
  //   hand.add(fullDeck.builtDeck().get(1,3));
  // };

  // public int cardInHandCount(){
  //   return this.hand.size();
  // }

}