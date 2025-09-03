
public class ActivationFunction {

    public static double heaviside(double x) {
        if (!Double.isInfinite(x) && !Double.isNaN(x) ) {
            double value = 0;
            if (x < 0) {
                value = 0;
            }

            if (x == 0) {
                value = 0.5;
            }

            if (x > 0) {
                value = 1;
            }

            return value;
        } else {
            return Double.NaN;
        }

    }

    public static double sigmoid(double x) {
        if (!Double.isInfinite(x) && !Double.isNaN(x)) {
            double e_powered = Math.exp(-x);
            double sigma = 1 / (1 + e_powered);
            return sigma;
        } else {
            return Double.NaN;
        }
    }

    public static double tanh(double x) {
        if (!Double.isInfinite(x) && !Double.isNaN(x)) {
            double e_powered = Math.exp(x);
            double e_minus = Math.exp(-x);
            double hyperbolic = (e_powered - e_minus) / (e_powered + e_minus);
            return hyperbolic;
        } else {
            return Double.NaN;
        }

    }

    public static double softsign(double x) {
        if (!Double.isInfinite(x) && !Double.isNaN(x)) {
            double func = (x) / (1 + Math.abs(x));
            return func;
        } else {
            return Double.NaN;
        }
    }

    public static double sqnl(double x) {
        if (!Double.isInfinite(x) && !Double.isNaN(x)) { 
            double value = 0;
            if (x <= -2) {
                value = -1;
            }
            if (x > -2 && x < 0) {
                value = (x) + (Math.pow(x, 2) / 4);
            }
            if (x >= 0 && x < 2) {
                value = (x) - (Math.pow(x, 2) / 4);
            }
            if (x >= 2) {
                value = 1;
            }

            
            return value;
        } else {
            return Double.NaN;
            
        }
        
    }

    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        double h = heaviside(x);
        double s = sigmoid(x);
        double t = tanh(x);
        double ss = softsign(x);
        double sqnl = sqnl(x);
        StdOut.println("heaviside" + "(" + x + ")" + " = " + h);
        StdOut.println("sigmoid" + "(" + x + ")" + " = " + s);
        StdOut.println("tanh" + "(" + x + ")" + " = " + t);
        StdOut.println("softsign" + "(" + x + ")" + " = " + ss);
        StdOut.println("sqnl" + "(" + x + ")" + " = " + sqnl);

    }

}
