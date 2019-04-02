import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lwx
 */
public class Hw1603 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] sudoku = new int[9][9];
        for (int i = 0; i < 9; i++) {
            String[] strs = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(strs[j]);
            }
        }

        dfs(sudoku, 0, 0);
    }

    private static boolean dfs(int[][] sudoku, int i, int j) {
        if (i == 8 && j == 9) {
            prtSudoku(sudoku);
            return true;
        }
        if (j == 9) {
            i++;
            j = 0;
        }

        boolean res = false;
        if (sudoku[i][j] == 0) {
            boolean[] options = optionalNumber(sudoku, i, j);
            for (int k = 1; k < options.length; k++) {
                if (!res && !options[k]) {
                    sudoku[i][j] = k;
                    res = dfs(sudoku, i, j + 1);
                }
            }
            if (!res) sudoku[i][j] = 0;
        } else {
            dfs(sudoku, i, j + 1);
        }
        return res;
    }

    private static void prtSudoku(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length - 1; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println(sudoku[i][sudoku[0].length - 1]);
        }
    }

    private static boolean[] optionalNumber(int[][] sudoku, int x, int y) {
        boolean[] options = new boolean[10];
        for (int i = 0; i < sudoku.length; i++) {
            options[sudoku[x][i]] = true;
            options[sudoku[i][y]] = true;
        }
        int row = x / 3 * 3, col = y / 3 * 3;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                options[sudoku[i][j]] = true;
            }
        }
        return options;
    }
}