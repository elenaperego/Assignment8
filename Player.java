public class Player {
    private final String name;
    private String score;
    private int points;
    private int ID;

    public Player(String name, String score, int points, int ID) {
        this.name = name;
        this.score = score;
        this.points = points;
        this.ID = ID;
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

    public int getID() { return ID; }

    public void setID(int ID) { this.ID = ID; }
}
