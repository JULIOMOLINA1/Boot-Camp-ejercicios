import java.util.Scanner;
public class Operations {
 public static void main(String args[]){
   Scanner in = new Scanner(System.in);
   int operation  = 0;
   int matematics = 0;
   int quemistry  = 0;
   double result  = 0;

   System.out.println("Give me the value for your operation: ");
   operation = in.nextInt();

   System.out.println("Give the value of matematics: ");
   matematics = in.nextInt();

   System.out.println("Give the value of quemistry: ");
   quemistry = in.nextInt();

     if(operation == 1){
     result = matematics + quemistry;
     System.out.println("The result of your adition is: " + result);
     } else if(operation == 2){
       result = matematics - quemistry;
       System.out.println("The result of your substraction is: " + result);
     } else if(operation == 3){
       result = matematics * quemistry;
       System.out.println("The result of your multiplication is: " + result);
     } else if(operation == 4){
       result = (double) matematics / quemistry;
       System.out.println("The result of your division is: " + result);
     } else {
       System.out.println("The operation does not exist.");
     }
 }
}
