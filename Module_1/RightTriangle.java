public class RightTriangle{
    public static void main(String[] args) {
        int firstside = Integer.parseInt(args[0]); 
        int secondside = Integer.parseInt(args[1]); 
        int thirdside = Integer.parseInt(args[2]); 
        int largestside = Math.max(firstside, secondside);
        int largestside2 = Math.max(largestside, thirdside);
        int smallestside = Math.min(firstside, secondside); 
        int smallestside2 = Math.min(smallestside, thirdside);
        int middleside = Math.min(firstside, secondside); 
        int middleside2 = Math.min(firstside, thirdside); 
        int middleside3 = Math.min(secondside, thirdside); 
        int middleside4 = Math.max(middleside, middleside2); 
        int middleside5 = Math.max(middleside4, middleside3);
        boolean IsRightTriangle = (firstside > 0 &&
            secondside > 0 && 
            thirdside > 0) &&
            (middleside5*middleside5) + (smallestside2*smallestside2) == (largestside2*largestside2);
        System.out.println(IsRightTriangle);
    }
}