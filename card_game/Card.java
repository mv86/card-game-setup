package card_game;

public class Card {

  private Suit suit;
  private Rank rank;
  private int value;

  public Card(Suit suit, Rank rank, int value) {
    this.suit = suit;
    this.rank = rank;
    this.value = 0;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public Rank getCardRank(){
    return this.rank;
  }

  public int setCardValue(){
    int value = 0;
    switch (this.rank) {
      case ACE : value = 11;
      return value;
      case TWO: value = 2;
      return value;
      case THREE: value = 3;
      return value;
      case FOUR: value = 4;
      return value;
      case FIVE: value = 5;
      return value;
      case SIX: value = 6;
      return value;
      case SEVEN: value = 7;
      return value;
      case EIGHT: value = 8;
      return value;
      case NINE: value = 9;
      return value;
      case TEN: value = 10;
      return value;
      case JACK: value = 10;
      return value;
      case QUEEN: value = 10;
      return value;
      case KING: value = 10;
      return value;
      default: value = 0;
      return value;
    }
  }

}