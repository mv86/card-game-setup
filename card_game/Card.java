package card_game;

public class Card {

  private Suit suit;
  private Rank rank;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public Rank getCardRank(){
    return this.rank;
  }

}