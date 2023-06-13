package org.example.Homework.HW2;

public class Task4 {
    /*Требования
    Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
    1. Каждая строка должна содержать цифру 1-9 без повторения
    2. Каждая колонка должна содержать цифру 1-9 без повторения
    3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
    Ограничения
        • board.length == 9
        • board[i].length == 9
        • board[i][j] значение число или '.'
     */
    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (rowCheck[num]) {
                        return false;
                    }
                    rowCheck[num] = true;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            boolean[] colCheck = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (colCheck[num]) {
                        return false;
                    }
                    colCheck[num] = true;
                }
            }
        }

        for (int block = 0; block < 9; block++) {
            boolean[] blockCheck = new boolean[9];
            int rowStart = 3 * (block / 3);
            int colStart = 3 * (block % 3);
            for (int i = rowStart; i < rowStart + 3; i++) {
                for (int j = colStart; j < colStart + 3; j++) {
                    if (board[i][j] != '.') {
                        int num = board[i][j] - '1';
                        if (blockCheck[num]) {
                            return false;
                        }
                        blockCheck[num] = true;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean isValid = isValidSudoku(board);
        System.out.println("Validate: " + isValid);
    }
}
