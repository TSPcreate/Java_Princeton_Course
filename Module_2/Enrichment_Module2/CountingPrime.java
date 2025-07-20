public class CountingPrime { 
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        int count = 0;
        System.out.println("2");
        for (int i = 1; i <= n; i+=2) { 
            for (int j = 1; j <= Math.sqrt(i); j+=2) { 
                if (i % j == 0) { 
                    count = count + 1;
                }


            }
            
            if (count == 1 && i != 1) {
            System.out.println(i); }
            count = 0;
         }
         
    }
}