public class GreatCircle{ 
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1])); 
        double x2 = Math.toRadians(Double.parseDouble(args[2])); 
        double y2 = Math.toRadians(Double.parseDouble(args[3])); 
        double sin1 = Math.sin((x2-x1)/2) * Math.sin((x2-x1)/2);
        double sin2 = Math.sin((y2-y1)/2) * Math.sin((y2-y1)/2);
        double harvis_p1 = Math.sqrt(sin1 + sin2 * Math.cos(x1) * Math.cos(x2)); 
        double r = 6371.0; 
        double distance = 2 * r * Math.asin(harvis_p1);
        System.out.println(distance + " " + "kilometers");
    }
}