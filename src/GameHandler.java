import java.util.Arrays;

public class GameHandler {
    public boolean haveWinner(int[][] field){
        for (int _field = 0; _field < 3; ++_field){
            if (field[0][_field] == field[1][_field] && field[0][_field] == field[2][_field]
                || field[_field][0] == field[_field][1] && field[_field][0] == field[_field][2])
                return true;
        }
        return field[0][0] == field[1][1] && field[0][0] == field[2][2]
            || field[0][2] == field[1][1] && field[0][2] == field[2][0];
    }
    public boolean isDraw(int[][] field){
        return !Arrays.stream(field)
                .flatMapToInt(Arrays::stream)
                .anyMatch(i -> i < 10);
    }
}
