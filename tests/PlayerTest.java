import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest {

  Player player1;
  Player dealer;
  Card card1;
  Card card2;
  Card card3;
  Card card4;

  @Before
  public void before(){
    player1 = new Player("Player1");
    card1 = new Card(Suit.CLUBS, Rank.ACE, 0);
    card2 = new Card(Suit.HEARTS, Rank.THREE, 0);
    player1.setHand(card1, card2);
    dealer = new Player("Dealer");
    card3 = new Card(Suit.DIAMONDS, Rank.FOUR, 0);
    card4 = new Card(Suit.SPADES, Rank.SIX, 0);
    dealer.setHand(card3, card4);
  }

  @Test
  public void canGetName(){
    assertEquals("Player1", player1.getName());
  }

  @Test
  public void playerHasTwoCards(){
    assertEquals(2, player1.countHand());
  }

  @Test
  public void playerPointsInStartHand(){
    assertEquals(14, player1.pointsInStartHand(card1, card2));
  }

  @Test
  public void dealerPointsInStartHand(){
    assertEquals(10, dealer.pointsInStartHand(card3, card4));
  }
  
}