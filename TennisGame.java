
public class TennisGame {
    /*
    CODE SMELLS:
    1) long method
    2) if statements
     */
    private Player player1;
    private Player player2;

    public TennisGame(String player1, String player2) {
        this.player1 = new Player1(player1, "", 0);
        this.player2 = new Player2(player2, "", 0);
    }

    public String getScore() {
        Score score = new Score();
        return score.getFinalScore(player1, player2);
    }


    public void wonPoint(String player) {
        if (player == "player1")
            player1.setPoints(player1.getPoints()+1);
        else
            player2.setPoints(player2.getPoints()+1);;
    }
}