import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in);
      
      int usernum;



      System.out.println("Please enter a two digit number ");
      usernum = scan.nextInt();
      
      System.out.println("Here are the Digits");
      System.out.println(usernum/10);
      System.out.println(usernum % 10);
    }
}