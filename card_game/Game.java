package card_game;
import java.util.*;
import card_game.*;

public class Game {

  public String handComparison(int player1Score, int dealerScore){
    if (player1Score > dealerScore) {
      return "Player 1 Wins";
     } else if (player1Score < dealerScore) {
        return "Dealer Wins";
      }  else {
          return "You Are Drawing";
        }
  }

}
