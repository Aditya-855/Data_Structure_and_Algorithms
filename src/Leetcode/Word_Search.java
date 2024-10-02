package Leetcode;

public class Word_Search {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";

        Word_Search ws = new Word_Search();
        boolean result = ws.exist(board, word);
        System.out.println("Word found: " + result);
    }

    public boolean exists(char[][] board, int i, int j, char[] word, int index) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '*' || board[i][j] != word[index]) {
            return false;
        }

        if (index == word.length - 1) {
            return true;
        }

        char ch = board[i][j];
        board[i][j] = '*';  // Mark as visited

        boolean result = exists(board, i + 1, j, word, index + 1) ||
                exists(board, i - 1, j, word, index + 1) ||
                exists(board, i, j + 1, word, index + 1) ||
                exists(board, i, j - 1, word, index + 1);

        board[i][j] = ch;  // Restore original character

        return result;
    }

    public boolean exist(char[][] board, String word) {
        char[] word_arr = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word_arr[0] && exists(board, i, j, word_arr, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
