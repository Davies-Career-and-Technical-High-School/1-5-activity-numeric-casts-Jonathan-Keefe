import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in);

      
      double user1;
      int ones;
      int tenths;
      int num;
      int num2;
    

      System.out.println("Please Input a decimal number");
      user1 = scan.nextDouble();

      double a = user1 * 10;
      double b = user1 * 100;

      ones = (int)a;
      tenths = (int)b;

      num = ones % 10;
      num2 =tenths % 10;
      
      
      

      System.out.println("Answer: " + num+ " "+ num2);






      
    }
}