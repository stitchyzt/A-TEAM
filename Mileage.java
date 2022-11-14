import java.util.Scanner;

public class Mileage
{
    /**Testing */
    public static void main (String[] args)
    {

int miles;
double gallons, mpg;
//mpg = miles / gallons;
Scanner s = new Scanner (System.in);

System.out .println ("Enter miles and gallons: ");
miles = s.nextInt () ;
gallons = s.nextDouble () ;
mpg = miles / gallons;

//output
System.out.println("Miles" + "Per"
+ "Gallon:" + mpg) ;
    } 
    
}