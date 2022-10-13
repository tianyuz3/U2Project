import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner c= new Scanner(System.in);
        System.out.println("PLease enter the first coordinate pair!: ");
        int cX=c.nextInt();
        int cY=c.nextInt();
        Scanner d=new Scanner(System.in);
        System.out.println("Please enter the second coordinate pair!: ");
        int c3=d.nextInt();
        int c4=d.nextInt();

        LinearEquation coordinate=new LinearEquation(cX,cY,c3,c4);
        System.out.println(coordinate.toString());

        Scanner x=new Scanner(System.in);
        System.out.println("Please enter an x-value: ");
        double x3=x.nextDouble();
        LinearEquation xCoordinate=new LinearEquation(x3);
        System.out.println(xCoordinate.calcCP());
    }
}
