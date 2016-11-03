package card_game;

import java.util.*;

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

  public int cardInHandCount(){
    return this.hand.size();
  }

}