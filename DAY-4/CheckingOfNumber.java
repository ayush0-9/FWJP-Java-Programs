import java.util.Scanner;

class CheckingOfNumber
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the Number : ");
    int number = sc.nextInt();

    String answer = (number < 0) ? "Number is negetive" : "Number is positive";

    System.out.println(answer);
  }
}