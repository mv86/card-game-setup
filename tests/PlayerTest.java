import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest {

  Player player1;

  @Before
  public void before(){
    player1 = new Player("Player1");//, [[Suit.CLUBS, Rank.ACE],[Suit.HEARTS, Rank.THREE]]);
  }

  @Test
  public void canGetName(){
    assertEquals("Player1", player1.getName());
  }

  // @Test 
  // public void canGetHand() {
  //   assertEquals([[Suit.CLUBS, Rank.ACE],[Suit.HEARTS, Rank.THREE]], player1.getHand());
  // }

  // @Test
  // public void canGetCardRank(){
  //   assertEquals(CardRankType.ACE, card.getCardRank());
  // }
}