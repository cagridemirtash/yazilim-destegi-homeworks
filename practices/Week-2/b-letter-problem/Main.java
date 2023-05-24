import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            if(i % 3 == 0) {
                for(int j = 0; j<letter[i].length; j++) {
                    if(j == 3) {
                        letter[i][j] = "   ";
                        continue;
                    }
                    letter[i][j] = " * ";
                }
                continue;
            }
            for(int j = 0; j<letter[i].length; j++) {
                if(j == 0|| j == 3) {
                    letter[i][j] = " * ";
                    continue;
                }
                letter[i][j] = "   ";
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
