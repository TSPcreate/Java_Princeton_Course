
public class ThueMorse {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] Morse_sequence = new boolean[n];
        String[][] i_j = new String[n][n];
        for (int i = 1; i <= n; i += i) {
            boolean[] temp = new boolean[i];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = Morse_sequence[j];
            }

            for (int check = 0; check < temp.length; check++) {
                if (temp[check] == false) {
                    temp[check] = true;
                } else {
                    temp[check] = false;
                }

            }

            int convert = temp.length;
            for (int l = 0; l < temp.length; l++) {
                if (convert + l < n) {
                    boolean a = temp[l];

                    Morse_sequence[convert + l] = a;

                }
            }
        }

        for (int row_i = 0; row_i < n; row_i++) {
            for (int column_j = 0; column_j < n; column_j++) {
                if (Morse_sequence[column_j] == Morse_sequence[row_i]) {
                    i_j[row_i][column_j] = "+  ";

                } else {
                    i_j[row_i][column_j] = "-  ";
                }
            }
        }

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(i_j[row][column]);
            }

            System.out.println("");

        }

    }
}
