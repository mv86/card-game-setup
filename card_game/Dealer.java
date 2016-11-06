package card_game;
import java.util.*;

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

  public int cardInHandCount(){
    return this.hand.size();
  }

}