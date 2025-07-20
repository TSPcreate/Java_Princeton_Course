public class Test{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]); 
        int Max = Math.max(a, b); 
        int Max2 = Math.max(Max, c);
        int Min = Math.min(a, b); 
        int Min2 = Math.min(Min, c);
        int middle1 = Math.min(a, b); 
        int middle2 = Math.min(b, c); 
        int middle3 = Math.min(c, a);
        int middle4 = Math.max(middle1, middle2); 
        int middle5 = Math.max(middle4, middle3); 
        System.out.println(Min2); 
        System.out.println(middle5); 
        System.out.println(Max2);

    }
}