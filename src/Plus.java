import java.util.Scanner;
public class Plus {
  public static void main (String args[]){
      Scanner in = new Scanner(System.in);
      String name = "";
      int numOne = 0, numTwo = 0, result = 0;
      System.out.println("¿what is your name?");
      name = in.nextLine();

      System.out.println("Give me the first value of your adition: ");
      numOne = in.nextInt();

      System.out.println("Give me the second value of your adition: ");
      numTwo = in.nextInt();

      result = numOne + numTwo;
      System.out.println("The value of your adition is: " + result);
  }
}
