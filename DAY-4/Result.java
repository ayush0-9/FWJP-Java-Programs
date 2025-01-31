import java.util.Scanner;

class Result
{
  public static void main(String agrs[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the marks out of 500 : ");
    int marks = sc.nextInt();

    String answer = (marks >= 250) ? "Pass" : "Fail";

    System.out.println("The student is "+answer);
  }
}