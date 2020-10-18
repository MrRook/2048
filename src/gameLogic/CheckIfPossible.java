package gameLogic;

public class CheckIfPossible {
    public static boolean Possible(int[][] Mat) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (Mat[i][j] == 0)
                    return true;
                if (j < 3 && (Mat[i][j] == Mat[i][j + 1])) {
                    return true;
                }
                if (i < 3 && (Mat[i][j] == Mat[i + 1][j])) {
                    return true;
                }
            }

        }
        return false;
    }
}
