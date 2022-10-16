import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner c= new Scanner(System.in);
        Scanner d=new Scanner(System.in);
        System.out.println("PLease enter the first coordinate pair!: ");
        String c1=c.nextLine();


        System.out.println("Please enter the second coordinate pair!: ");
        String c2=d.nextLine();

        String x1=c1.substring(1,c1.indexOf(","));
        String y1=c1.substring(c1.indexOf(",") + 1,c1.indexOf(")"));

        String x2=c2.substring(1,c2.indexOf(","));
        String y2=c2.substring(c1.indexOf(",") + 1,c2.indexOf(")"));
        Integer xF=Integer.valueOf(x1);
        Integer yF=Integer.valueOf(y1);
        Integer xS=Integer.valueOf(x2);
        Integer yS=Integer.valueOf(y2);

        LinearEquation coordinate=new LinearEquation(xF,yF,xS,yS);
        System.out.println(coordinate.toString());


        Scanner x=new Scanner(System.in);
        System.out.println("Please enter an x-value: ");
        double x3=x.nextDouble();
        LinearEquation xCoordinate=new LinearEquation(xF,yF,xS,yS,x3);
        System.out.println(xCoordinate.calcCP());
    }
}
