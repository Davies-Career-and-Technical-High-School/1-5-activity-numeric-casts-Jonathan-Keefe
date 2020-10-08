import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in);

      int usernum1;
      int usernum2;
      
      System.out.println("Please enter two integers");
      usernum1 = scan.nextInt();
      usernum2 = scan.nextInt();

      double z = 1.0 * ((usernum1 + usernum2) /2); 
      double y = 0.5 % ((usernum1 + usernum2) /2); 
      double x = y + z;

      
      System.out.println("Average of two Positive or two Negative Nums");
      System.out.println(z);
    
      System.out.println("Average of a Negative and a Positive");
      System.out.println(x);

    }
}