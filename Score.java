public class Score {
    private String finalScore;
    private Player player1;
    private Player player2;

    public Score(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void setFinalScore(String text) { this.finalScore = text; }

    public String getFinalScore(Player player1, Player player2) {
        All(player1, player2);

        Deuce(player1, player2);

        LoveScore(player1, player2);
        LoveScore(player2, player1);

        ScoreScore(player1, player2);
        ScoreScore(player2, player1);

        Advantage(player1, player2);
        Advantage(player2, player1);

        Win(player1, player2);
        Win(player2, player1);

        return finalScore;
    }

    public String getPoints(Player p) {
        String score = "";
        if (p.getPoints() == 0)
            score = "Love";
        else if (p.getPoints() == 1)
            score = "Fifteen";
        else if (p.getPoints() == 2)
            score = "Thirty";
        else if (p.getPoints() == 3)
            score = "Forty";

        return score;
    }

    public void All(Player player1, Player player2){
        if (player1.getPoints() == player2.getPoints() && player1.getPoints() < 4) {
            setFinalScore(finalScore = getPoints(player1) + "-All");
        }
    }

    public void LoveScore(Player player1, Player player2){
        if (player1.getPoints() > 0 && player2.getPoints() == 0) {
            player1.setScore(getPoints(player1));
            player2.setScore(getPoints(player2));
            setFinalScore(this.player1.getScore() + "-" + this.player2.getScore());
        }
    }

    public void ScoreScore(Player player1, Player player2){
        if (player1.getPoints() > player2.getPoints() && player1.getPoints() < 4) {
            player1.setScore(getPoints(player1));
            player2.setScore(getPoints(player2));
            setFinalScore(this.player1.getScore() + "-" + this.player2.getScore());
        }
    }

    public void Deuce(Player player1, Player player2) {
        if (player1.getPoints() == player2.getPoints() && player1.getPoints() >= 3)
            setFinalScore("Deuce");
    }

    public void Advantage(Player player1, Player player2) {
        if (player1.getPoints() > player2.getPoints() && player2.getPoints() >= 3) {
            setFinalScore("Advantage player" + player1.getID());
        }
    }

    public void Win(Player player1, Player player2){
        if (player1.getPoints() >= 4 && player2.getPoints() >= 0 && (player1.getPoints() - player2.getPoints()) >= 2) {
            setFinalScore("Win for player" + player1.getID());
        }
    }
}