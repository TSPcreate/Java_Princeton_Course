public class Kary { 
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]); 
        int k = Integer.parseInt(args[1]); 
        double n = k; 
        double ER = 1E-15;
        if (k < 2 || k > 16) { 
            System.err.println("invalid k value"); 
            System.exit(0);
        } else {

        while (Math.abs(Math.pow(k, n)- i) > i*ER) { 
            double function_n = Math.pow(k, n) - i; 
            double function_dn = Math.pow(k, n) * Math.log(k);
            n = n - (function_n/function_dn);  
            
            
            
        }
        
        System.out.println(k + " to the power of " + n + " is " + i);
        }
    }
}