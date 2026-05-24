package tubes2048;

public class Player {
    private String name;
    private int highScore;
    
    public Player(String name) {
        this.name = name;
        this.highScore = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHighScore() {
        return highScore;
    }
    
    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
}
