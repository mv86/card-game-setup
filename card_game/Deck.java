package card_game;
import card_game.*;
import java.util.*;


public class Deck {

  private ArrayList<Card> fullDeck;

  public Deck() {
    this.fullDeck = new ArrayList<Card>();
  }

  public void shuffleDeck() {
    Collections.shuffle(fullDeck);
  }

  public ArrayList<Card> buildDeck() {
    for(Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        fullDeck.add(new Card(suit, rank));
      }
    }
    shuffleDeck();
    return fullDeck;
      // shuffleDeck();
    // System.out.println(fullDeck);
  }
}


