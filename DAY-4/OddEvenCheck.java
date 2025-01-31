import java.util.Scanner;

class OddEven
{
  public static void main(String agrs[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the number : ");
    int num = sc.nextInt();

    String result = (num % 2 == 0) ? " is Even" : " is Odd";

    System.out.println(num+result);

  }
}
