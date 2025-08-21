public class OutputHandler {
    public void showField(int[][] field){
        for (int _row =  0; _row < 3; ++_row){
            for (int _col =  0; _col < 3; ++_col){
                System.out.print(field[_row][_col]);
                if (_col != 2)
                    System.out.print("|");
            }
            System.out.println();
            if (_row != 2)
                System.out.println("-+-+-");
        }
    }
}
