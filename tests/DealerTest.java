import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DealerTest {

  Dealer dealer;

  @Before
  public void before(){
    dealer = new Dealer("Dealer");
  }

  @Test
  public void canGetName(){
    assertEquals("Dealer", dealer.getName());
  }

  // @Test
  // public void canGetCardRank(){
  //   assertEquals(CardRankType.ACE, card.getCardRank());
  // }
}