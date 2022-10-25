public class LinearEquation {
    private int x;
    private int y;
    private int x2;
    private int y2;
    private double x3;

    public LinearEquation(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public LinearEquation(int x, int y, int x2, int y2, double x3) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
    }

    public double calcDistance() {
        double d = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
        return d;
    }

    public double calcSlope() {
        double s = (double) (y2 - y) / (x2 - x);
        return s;
    }

    public String slope() {
        int dX = x2 - x;
        int dY = y2 - y;
        String s = dY + "/" + dX;
        return s;
    }

    public double calcYInt() {
        double yin =  (y - calcSlope() * x);
        return yin;
    }

    public String toString() {

        String infoC = "First Pair: (" + x + "," + y + ")\n" + "Second Pair: (" + x2 + "," + y2 + ")\n";
        String infoS = "Slope of the line: " + String.format("%.2f", calcSlope()) + "\n";
        String infoY = "Y-intercept: " +  String.format("%.2f", calcYInt()) + "\n" ;
        String infoSl = "Slope intercept form: " + "y= " + slope() + "x + " + String.format("%.2f", calcYInt()) + "\n";
        String infoD = "The distance between points: " + String.format("%.2f", calcDistance()) + "\n";
        return infoC + infoS + infoY + infoSl + infoD;


    }

    public String calcCP() {
        double c = calcSlope() * x3 + calcYInt();
        String cP = "Solved coordinate point is: " + "(" + String.format("%.2f", x3) + "," + String.format("%.2f", c) + ")";
        return cP;
    }
}