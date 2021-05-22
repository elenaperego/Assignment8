public class TennisGame {
    /**
     *  GROUP 66:
     *
     *  Elena Perego         i6238107
     *  Chiara Paglioni      i6149782
     *
     *  CODE SMELLS:
     *
     *  1) long method
     *  2) if statements
     *  3) duplicate code
     *
     */

    private Player player1;
    private Player player2;

    public TennisGame(String player1, String player2) {
        this.player1 = new Player("player1", "", 0, 1);
        this.player2 = new Player("player2", "", 0, 2);
    }

    public String getScore() {
        Score score = new Score(player1, player2);
        return score.getFinalScore(player1, player2);
    }

    public void wonPoint(String player) {
        if (player == "player1")
            player1.setPoints(player1.getPoints()+1);
        else
            player2.setPoints(player2.getPoints()+1);
    }
}