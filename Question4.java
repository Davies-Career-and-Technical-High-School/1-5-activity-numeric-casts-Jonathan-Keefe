import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in);

      
      double user1;
      double user2;

      System.out.println("Please Input a decimal number");
      user1 = scan.nextDouble();
      double a = user1 + 0.5;
      double b = user1 - 0.5;

      int c = (int)a;
      int d = (int)b;
      

      System.out.println("Answer: " + c + " or " + d );


     
      




      
    }
}