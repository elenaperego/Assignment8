public class Player2 implements  Player{
    private final String name;
    private String score;
    private int points;

    public Player2(String name, String score, int points) {
        this.name = name;
        this.score = score;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
