import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DealerTest {

  Dealer dealer;
  Card card1;
  Card card2;

  @Before
  public void before(){
    dealer = new Dealer("Dealer");
    card1 = new Card(Suit.DIAMONDS, Rank.FOUR, 0);
    card2 = new Card(Suit.SPADES, Rank.SIX, 0);
    dealer.setHand(card1, card2);
  }

  @Test
  public void canGetName(){
    assertEquals("Dealer", dealer.getName());
  }

  @Test
  public void dealerHasTwoCards(){
    assertEquals(2, dealer.countHand());
  }

  @Test
  public void dealerPointsInStartHand(){
    assertEquals(10, dealer.pointsInStartHand(card1, card2));
  }

  
}