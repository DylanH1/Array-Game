import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        char[] board = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
        char currentPl = 'x';

        boolean gameDone= false;
        Scanner sc = new Scanner(System.in);
        //GameLoop
        while (!gameDone) {
            //printing format
            ArrayUtils.prn("-------------");
            for (int i = 0; i < 9; i += 3) {
                ArrayUtils.prnt("l ");
                for (int j = i; j < i + 3; j++) {
                    ArrayUtils.prnt(board[j] + " l ");
                }
                ArrayUtils.prn("\n-------------");
            }
            //player move
            ArrayUtils.prnt("Player " + currentPl + ", input your move (1-9): ");
            int move = sc.nextInt() - 1;

            if (move >= 0 && move < 9 && board[move] == ' ') {

                board[move] = currentPl;
                //winconditions
                boolean won = false;
                int[][] winCon = {
                        { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 },
                        { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 },
                        { 0, 4, 8 }, { 2, 4, 6 }
                };
                //if conditions are met
                for (int i = 0; i < winCon.length; i++) {
                    int[] con = winCon[i];
                    if (board[con[0]] == currentPl && board[con[1]] == currentPl &&
                            board[con[2]] == currentPl) {
                        won = true;
                        break;
                    }
                }
                //playerWins
                if (won) {
                    ArrayUtils.prn("-------------");
                    for (int i = 0; i < 9; i += 3) {
                        ArrayUtils.prnt("l ");
                        for (int j = i; j < i + 3; j++) {
                            ArrayUtils.prnt(board[j] + " l ");
                        }
                        ArrayUtils.prn("\n-------------");
                    }
                    ArrayUtils.prn("pplayer " + currentPl + " wins!");
                    gameDone= true;
                } else {

                    boolean isBoardFul = true;
                    for (int i = 0; i < board.length; i++) {
                        if (board[i] == ' ') {
                            isBoardFul = false;
                            break;
                        }
                    }
                    //is board full, is tie, cats game!
                    if (isBoardFul) {
                        ArrayUtils.prn("-------------");
                        for (int i = 0; i < 9; i += 3) {
                            ArrayUtils.prnt("l ");
                            for (int j = i; j < i + 3; j++) {
                                ArrayUtils.prnt(board[j] + " l ");
                            }
                            ArrayUtils.prn("\n-------------");
                        }
                        ArrayUtils.prn("It's a tie!");
                        gameDone = true;
                    } else {

                        if (currentPl == 'x') {
                            currentPl = 'o';
                        } else {
                            currentPl = 'x';
                        }
                    }
                }
            } else {
                ArrayUtils.prn("invalid move! try again.");
            }
        }
        //endGame
        ArrayUtils.prnt("\033[H\033[2J");
        ArrayUtils.prn("Game FINISHED");
    }
}
