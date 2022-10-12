public class LinearEquation {
    private int x;
    private int y;
    private int x2;
    private int y2;
    private double x3;

    public LinearEquation(int x,int y, int x2, int y2)
    {
        this.x= x;
        this.y= y;
        this.x2= x2;
        this.y2= y2;
    }
    public LinearEquation(double x3){
        this.x3=x3;
    }

    public double calcDistance(){
        double d= Math.sqrt(Math.pow(x2-x,2)+Math.pow(y2-y,2));
        return d;
    }

    public double calcInfo(){
        double s= (y2-y)/(x2-x);
        double yin=y-s*x;
        return s;
        return yin;
    }
public String toString(){

        String infoc="First Pair: (" + x + "," + y + ")\n" + "Second Pair: (" + x + "," + y + ")";
        String infos="Slope of line:" + 


}

}
