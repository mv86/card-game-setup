import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardTest {

  Card card;

  @Before
  public void before(){
    card = new Card(Suit.CLUBS, Rank.ACE, 0);
  }

  @Test
  public void canGetSuit(){
    assertEquals(Suit.CLUBS, card.getSuit());
  }

  @Test
  public void canGetRank(){
    assertEquals(Rank.ACE, card.getRank());
  }

  @Test 
  public void canGetInitialValue(){
    assertEquals(0, card.getValue());
  }

  @Test
  public void canGetGameAssignedValue(){
    int newCardValue = card.setCardValue();
    assertEquals(11, newCardValue);
  }


}