import java.util.Scanner;

public class variable {
         public static void main(String[] args) {

         // declaring variables;
        double x = 0;
        double y = 0;

         Scanner input = new Scanner(System.in);

      System.out.print("Enter the value for X: ");
      x = input.nextDouble();
      System.out.print("Enter the value for Y: ");
      y = input.nextDouble();

      System.out.println("the average of x and y" + ( x + y ) / 2 );

}
}