import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class GameTest {

  Game game;
  Player dealer;
  Player player1;
  Card card1;
  Card card2;
  Card card3;
  Card card4;

  @Before
  public void before(){
    game = new Game();
    dealer = new Player("Dealer");
    player1 = new Player("Player1");
    card1 = new Card(Suit.CLUBS, Rank.ACE, 0);
    card2 = new Card(Suit.DIAMONDS, Rank.FOUR, 0);
    card3 = new Card(Suit.HEARTS, Rank.THREE, 0);
    card4 = new Card(Suit.SPADES, Rank.SIX, 0);
    player1.setHand(card1, card3);
    dealer.setHand(card2, card4); 
  }

  @Test
  public void showPlayerHand(){
    String card1Is = card1.showCard(card1);
    String card3Is = card3.showCard(card3);
    String player1Hand = player1.showHand(card1Is, card3Is);
    assertEquals("You have ACE of CLUBS & THREE of HEARTS", player1Hand);
  }

  @Test 
  public void whoHasHighestHand(){
    int player1Score = player1.pointsInStartHand(card1, card3);
    int dealerScore = dealer.pointsInStartHand(card2, card4);
    assertEquals("Player 1 Wins", game.handComparison(player1Score, dealerScore));
  }

}