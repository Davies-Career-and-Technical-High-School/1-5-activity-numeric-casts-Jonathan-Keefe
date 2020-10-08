import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in);


     int usernum;
     int num1;
     int num2;
     int fnum2;
     int num3; 


      System.out.println("Please enter a  three number ");
      usernum = scan.nextInt();
      
      num1 = usernum /100;
      num2 = usernum /10;
      fnum2 = num2 % 10;
      num3 = usernum % 10;
       

      System.out.println("Here are the Digits");
      System.out.println(num3);
      System.out.println(fnum2);
      System.out.println(num1);
      
      
      


    }
}