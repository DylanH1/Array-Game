import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayUtils.prn(" Which number would you like to move?");
        int input2 = sc.nextInt();
        int playerSprite = input2;
        int rowMove = 0;
        int colMove = 0;
        String input = sc.nextLine();
        if (input.equals("up")) {
            rowMove--;
        }
        else if (input.equals("down")) {
            rowMove++;
        }
        else if (input.equals("left")) {
            colMove--;
        }
        else if (input.equals("right")) {
            colMove++;
        }

    }

    public static int[][] loadMap() {
        // TODO: Load from a file.
        int[][] map = {
                { 2, 4, 5 },
                { 7, 6, 9 },
                { 3, 8, 1 },         
        };
        System.out.println(map);
        return map;
    }
    public static void display(int[][] map, String[] tiles, String playerSprite, int playerRow, int playerCol) {

        // TODO: Display borders around map.

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == playerRow && j == playerCol) { // Player
                    System.out.print(playerSprite);
                }
                else {  // Display correct tile according to tile code in game map.
                    int tileCode = map[i][j];
                    System.out.print(tiles[tileCode]);
                }
            }
            System.out.println();
        }
    }
}
