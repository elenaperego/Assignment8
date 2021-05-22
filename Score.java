public class Score {
    private String finalScore;

    public Score(){

    }

    public void setFinalScore(String finalScore) {
        this.finalScore = finalScore;
    }

    public String getFinalScore(Player player1, Player player2) {
        All(player1, player2);

        Deuce(player1, player2);

        LoveScore(player1, player2);
        LoveScore(player2, player1);

        ScoreScore(player1, player2);
        ScoreScore(player2, player1);

        Advantage(player1, player2);

        Win(player1, player2);

        return finalScore;
    }


    public void All(Player player1, Player player2){
        if (player1.getPoints() == player2.getPoints() && player1.getPoints() < 4) {
            if (player1.getPoints() == 0)
                finalScore = "Love";
            if (player1.getPoints() == 1)
                finalScore = "Fifteen";
            if (player1.getPoints() == 2)
                finalScore = "Thirty";
            finalScore += "-All";
        }
    }

    public void LoveScore(Player player1, Player player2){
        if (player1.getPoints() > 0 && player2.getPoints() == 0) {
            if (player1.getPoints() == 1)
                player1.setScore("Fifteen");
            if (player1.getPoints() == 2)
                player1.setScore("Thirty");
            if (player1.getPoints() == 3)
                player1.setScore("Forty");
            player2.setScore("Love");
            finalScore = player1.getScore() + "-" + player2.getScore();
        }
    }

    public void ScoreScore(Player player1, Player player2){
        if (player1.getPoints() > player2.getPoints() && player1.getPoints() < 4) {
            if (player1.getPoints() == 2)
                player1.setScore("Thirty");
            if (player1.getPoints() == 3)
                player1.setScore("Forty");
            if (player2.getPoints() == 1)
                player2.setScore("Fifteen");
            if (player2.getPoints() == 2)
                player2.setScore("Thirty");
            finalScore = player1.getScore() + "-" + player2.getScore();
        }
    }

    public void Deuce(Player player1, Player player2) {
        if (player1.getPoints() == player2.getPoints() && player1.getPoints() >= 3)
            setFinalScore("Deuce");
    }

    public void Advantage(Player player1, Player player2) {
        if (player1.getPoints() > player2.getPoints() && player2.getPoints() >= 3) {
            setFinalScore("Advantage player1");
        }

        if (player2.getPoints() > player1.getPoints() && player1.getPoints() >= 3) {
            setFinalScore("Advantage player2");
        }
    }

    public void Win(Player player1, Player player2){
        if (player1.getPoints() >= 4 && player2.getPoints() >= 0 && (player1.getPoints() - player2.getPoints()) >= 2) {
            setFinalScore("Win for player1");
        }
        if (player2.getPoints() >= 4 && player1.getPoints() >= 0 && (player2.getPoints() - player1.getPoints()) >= 2) {
            setFinalScore("Win for player2");
        }
    }


}
