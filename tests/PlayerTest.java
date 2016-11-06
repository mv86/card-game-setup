import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest {

  Player player1;
  Card card1;
  Card card2;

  @Before
  public void before(){
    player1 = new Player("Player1");
    card1 = new Card(Suit.CLUBS, Rank.ACE, 0);
    card2 = new Card(Suit.HEARTS, Rank.THREE, 0);
    player1.setHand(card1, card2);
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

}