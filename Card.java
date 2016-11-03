public class Card {

  private SuitType suit;
  private CardRankType cardRank;

  public Card(SuitType suit, CardRankType cardRank) {
    this.suit = suit;
    this.cardRank = cardRank;
  }

  public SuitType getSuit(){
    return this.suit;
  }

  public CardRankType getCardRank(){
    return this.cardRank;
  }

}