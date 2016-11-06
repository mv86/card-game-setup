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
    card1 = new Card(Suit.DIAMONDS, Rank.FOUR);
    card1 = new Card(Suit.SPADES, Rank.SIX);
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

  
}