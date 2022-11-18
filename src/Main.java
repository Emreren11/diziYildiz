import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for (int row = 0; row < letter.length; row++) {
            for (int col = 0; col < letter[row].length; col++) {
                if (col == 0 || col == 3 || row == 0 || row == 3 || row == 6) {
                    letter[row][col] = "*  ";
                } else {
                    letter[row][col] = "   ";
                }
                if (row == 0 || row == 6) {
                    letter[row][3] = " ";
                }

                System.out.print(letter[row][col]);
            }
            System.out.println();
        }
    }
}