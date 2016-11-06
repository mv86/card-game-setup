import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest {

  Deck deck = new Deck();

  @Test
  public void fullDeckBuilt() {
    deck.builtDeck();
    assertEquals(52, deck.deckCount());
  }


}