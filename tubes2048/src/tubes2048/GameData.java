package tubes2048;

import java.util.ArrayList;
import java.util.List;

public class GameData {
    private int bestScore;
    private List<ScoreEntry> history;

    public GameData() {
        this.bestScore = 0;
        this.history = new ArrayList<>();
    }

    public int getBestScore() { return bestScore; }
    public void setBestScore(int bestScore) { this.bestScore = bestScore; }
    
    public List<ScoreEntry> getHistory() { return history; }
}