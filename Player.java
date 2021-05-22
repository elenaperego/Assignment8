public class Player {

    private final String name;
    private int points;
    private String score;

    public Player(String name, int points, String score){
        this.name = name;
        this.points = points;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public String getScore() {
        return score;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setScore(String score) {
        this.score = score;
    }


}
