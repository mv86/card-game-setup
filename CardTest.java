import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

  Card card;

  @Before
  public void before(){
    card = new Card(SuitType.CLUBS, CardRankType.ACE);
  }

  @Test
  public void canGetSuit(){
    assertEquals(SuitType.CLUBS, card.getSuit());
  }

  @Test
  public void canGetCardRank(){
    assertEquals(CardRankType.ACE, card.getCardRank());
  }
}