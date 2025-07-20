
public class Birthday {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        boolean birthday = false;
        //int[] birth_dates = new int[100000];
        int[][] results = new int[100][2];
        for (int k = 0; k < results.length; k++) {
            results[k][0] = k + 1;
        }
        for (int i = 0; i < trials; i++) {
            int count = 0;
            birthday = false;
            int[] duplicates = new int[n];

            while (birthday == false) {
                for (int j = 0; j < duplicates.length; j++) {
                    int index = (int) (Math.random() * n);
                    //System.out.println("The new random birthday is: " + index);
                    count = count + 1;
                    //System.out.println("Number of people entering the room: " + count);

                    duplicates[index] = duplicates[index] + 1;
                    if (duplicates[index] > 1) {
                        
                        birthday = true;
                        break;
                    }
                }
            }
            // System.out.println("count: " + count);
            // System.out.println("trial: " + i);
            if (count < 100) {
            results[count - 1][1] = results[count - 1][1] + 1;
            }

        }
        double fraction = 0;
        for (int i = 0; i < results.length; i++) { 
            double total = 0;
            for (int j = 0; j <= i; j++) { 
                total += results[j][1];
                
            }
            if (fraction < 0.5) {
                    fraction = total/trials;
                    System.out.println(results[i][0] + "	" + results[i][1] + "	" + fraction);
            }
            }
        }
    }

