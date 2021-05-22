
public class TennisGame {
    /*
    CODE SMELLS:
    1) long method
    2) if statements
     */
    private Player player1;
    private Player player2;

    public TennisGame(String player1, String player2) {
        this.player1 = new Player(player1, 0, "");
        this.player2 = new Player(player2, 0, "");
    }

    public String getScore() {
        String score = "";
        if (player1.getPoints() == player2.getPoints() && player1.getPoints() < 4) {
            if (player1.getPoints() == 0)
                score = "Love";
            if (player1.getPoints() == 1)
                score = "Fifteen";
            if (player1.getPoints() == 2)
                score = "Thirty";
            score += "-All";
        }
        if (player1.getPoints() == player2.getPoints() && player1.getPoints() >= 3)
            score = "Deuce";

        if (player1.getPoints() > 0 && player2.getPoints() == 0) {
            if (player1.getPoints() == 1)
                player1.setScore("Fifteen");
            if (player1.getPoints() == 2)
                player1.setScore("Thirty");
            if (player1.getPoints() == 3)
                player1.setScore("Forty");

            player2.setScore("Love");
            score = player1.getScore() + "-" + player2.getScore();
        }
        if (player2.getPoints() > 0 && player1.getPoints() == 0) {
            if (player2.getPoints() == 1)
                player2.setScore("Fifteen");
            if (player2.getPoints() == 2)
                player2.setScore("Thirty");
            if (player2.getPoints() == 3)
                player2.setScore("Forty");

            player1.setScore("Love");;
            score = player1.getScore() + "-" + player2.getScore();
        }

        if (player1.getPoints() > player2.getPoints() && player1.getPoints() < 4) {
            if (player1.getPoints() == 2)
                player1.setScore("Thirty");
            if (player1.getPoints() == 3)
                player1.setScore("Forty");
            if (player2.getPoints() == 1)
                player2.setScore("Fifteen");
            if (player2.getPoints() == 2)
                player2.setScore("Thirty");
            score = player1.getScore() + "-" + player2.getScore();
        }
        if (player2.getPoints() > player1.getPoints() && player2.getPoints() < 4) {
            if (player2.getPoints() == 2)
                player2.setScore("Thirty");
            if (player2.getPoints() == 3)
                player2.setScore("Forty");
            if (player1.getPoints() == 1)
                player1.setScore("Fifteen");
            if (player1.getPoints() == 2)
                player1.setScore("Thirty");
            score = player1.getScore() + "-" + player2.getScore();
        }

        if (player1.getPoints() > player2.getPoints() && player2.getPoints() >= 3) {
            score = "Advantage player1";
        }

        if (player2.getPoints() > player1.getPoints() && player1.getPoints() >= 3) {
            score = "Advantage player2";
        }

        if (player1.getPoints() >= 4 && player2.getPoints() >= 0 && (player1.getPoints() - player2.getPoints()) >= 2) {
            score = "Win for player1";
        }
        if (player2.getPoints() >= 4 && player1.getPoints() >= 0 && (player2.getPoints() - player1.getPoints()) >= 2) {
            score = "Win for player2";
        }
        return score;
    }


    public void wonPoint(String player) {
        if (player == "player1")
            player1.setPoints(player1.getPoints()+1);
        else
            player2.setPoints(player2.getPoints()+1);;
    }
}