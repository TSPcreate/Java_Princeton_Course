public class CMYKtoRGB{
    public static void main(String[] args) {
        Double cyan = Double.parseDouble(args[0]); 
        Double magneta = Double.parseDouble(args[1]); 
        Double Yellow = Double.parseDouble(args[2]); 
        Double Black = Double.parseDouble(args[3]); 
        Double white = 1 - Black; 
        Double red = 255 * white * (1-cyan); 
        Double green = 255 * white * (1-magneta); 
        Double blue = 255* white * (1-Yellow); 
        System.out.println("red" + " " + " " + "=" + " " + Math.round(red) );
        System.out.println("green" + " " + "=" + " " + Math.round(green)); 
        System.out.println("blue" + " " +  "= " + " " + Math.round(blue));
    }
}