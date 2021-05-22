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
     *      SOLUTION:
     *      We used the Extract Method refactoring technique. Indeed, we divided the different types
     *      of final scores in different methods: All, Deuce, LoveScore, ScoreScore, Advantage and Win.
     *      In this way, when we checked for the final score, we call sequentially all these methods.
     *  2) if statements
     *      SOLUTION:
     *      Thanks to the Extract Method refactoring technique, the if statements were already reduced.
     *      However, we also noticed that many if statements were symmetrical. For example, when the final
     *      score is "Advantage player1" or "Advantage player2", the conditions were identical but applied
     *      to different objects. We resolved this issue by calling our extracted methods two times with the
     *      parameters switched.
     *  3) duplicate code
     *      SOLUTION:
     *      Duplicate code was the main code smell that caused the two before-mentioned problems.
     *      In particular, the assignment of the individual scores to the players based on their
     *      points was repeated in most if statements. Thus, we created a getPoints method that,
     *      based on the player, finds the corresponding score. This method was called to
     *      compute every possible final score and reduce significantly the size of each extracted
     *      method.
     *
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
