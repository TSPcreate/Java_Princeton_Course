public class Divisors { 
   public static int gcd(int a, int b) { 
    int a_new = Math.abs(a);
    int b_new = Math.abs(b); 
    int a_b = 0;
    while (b_new != 0) { 
        a_b = a_new % b_new;
        a_new = b_new;
        b_new = a_b;
        
        

    }
    
    return Math.abs(a_new);

   }

   public static int lcm(int a, int b) { 
        if (a == 0 && b == 0) {
            return 0;
        } else {
         int part1 = Math.abs(a) / gcd(a, b);
         int part2 = part1 * b;
         return Math.abs(part2);
        }
   }

   public static boolean areRelativelyPrime(int a, int b) { 
        int divisor = gcd(a, b);
        if (divisor == 1) {
            return true;
        } else { 
            return false;
        }
   }

   public static int totient(int n) { 
        int count = 0;
        if (n <= 0) { 
            return 0;
        } else {
        for (int i = 0; i < n; i ++) { 
            if (areRelativelyPrime(i, n) == true) { 
                count = count + 1;

            }
        }
        return count;
        }

   }

   public static void main(String[] args) {
       int a = Integer.parseInt(args[0]); 
       int b = Integer.parseInt(args[1]);
       int g = gcd(a, b);
       int l = lcm(a, b);
       boolean a_r = areRelativelyPrime(a, b); 
       int t1 = totient(a);
       int t2 = totient(b);
       StdOut.println("gcd(" + a + ", " + b + ") = " + g);
       StdOut.println("lcm(" + a + ", " + b + ") = " + l);
       StdOut.println("areRelativelyPrime(" + a + ", " + b + ") = " + a_r);
       StdOut.println("totient(" + a + ") = " + t1);
       StdOut.println("totient(" + b + ") = " + t2);
   }

   
}