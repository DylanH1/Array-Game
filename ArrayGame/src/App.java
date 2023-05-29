import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean done = false;
        int[][] map = {
            { 1, 2, 3,},
            { 4, 5, 6,},
            { 7, 8, 0,},
            
    };
        while (!done) {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    ArrayUtils.prn( map[i][j]);
        }   
    }
}
    }
}
