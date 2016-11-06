import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardTest {

  Card card;

  @Before
  public void before(){
    card = new Card(Suit.CLUBS, Rank.ACE);
  }

  @Test
  public void canGetSuit(){
    assertEquals(Suit.CLUBS, card.getSuit());
  }

  @Test
  public void canGetCardRank(){
    assertEquals(Rank.ACE, card.getCardRank());
  }
}