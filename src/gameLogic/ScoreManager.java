package gameLogic;

public class ScoreManager {
    int score = 0;

    public void UpdateScore(display.Display d, int deltaScore) {
        score += deltaScore;
        d.Score.setText("     Score : " + score);
    }

    public void GameOver(display.Display d) {
        d.Score.setText("Score : " + score + " Game Over! Press R to reset");
    }
}
