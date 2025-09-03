
public class ShannonEntropy {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = StdIn.readAllInts();
        int[] frequency_list = new int[m];
        double shannon = 0;
        double sum = 0.0;
        int total_frequency = a.length;
        // calculating frequencies
        for (int i = 0; i < a.length; i++) { 
            int temp = 0;
            temp = a[i] - 1;
            frequency_list[temp] = frequency_list[temp] + 1;

        }
        for (int i = 1; i <= m; i++) {
            int count = frequency_list[i-1];
            
            double p_i = (double) count / total_frequency;
            // StdOut.println("Probability: " + " " + i + " " + frequency_list[i-1] + "  " + p_i);
            if (p_i == 0.0) {

            } else {
                double log = Math.log(p_i) / Math.log(2);
                shannon = -(p_i) * log;
                sum = sum + shannon;

            }
        }

        StdOut.printf("%.4f", sum);

    }
}
