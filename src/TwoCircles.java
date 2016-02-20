import java.util.Scanner;

public class TwoCircles {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter circle1's center x-, y coordinates, and radius: ");
    double c1x = input.nextDouble();
    double c1y = input.nextDouble();
    double c1rad = input.nextDouble();
    System.out.print("Enter circle2's center x-, y coordinates, and radius: ");
    double c2x = input.nextDouble();
    double c2y = input.nextDouble();
    double c2rad = input.nextDouble();
    
    double distance = Math.pow(((c2x-c1x)*(c2x-c1x) + 
            (c2y-c1y)*(c2y-c1y)), 0.5);
    
    if (distance <= Math.abs(c1rad-c2rad)){
      System.out.println("circle2 is inside circle1"); 
      System.exit(0);
    } // if
    if (distance <= (c1rad + c2rad))
      System.out.println("circle2 overlaps circle1");
    else
      System.out.println("circle2 does not overlap circle1");
    
  } // main   
} // TwoCircles
