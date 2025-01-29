import java.util.Scanner;

class CharacterCase
{
  public static void main(String agrs[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the character : ");
    char c = sc.next().charAt(0);

    String answer = (Character.isLowerCase(c)) ? "it is lower case character" : "it is a upper case character";

    System.out.println(answer);

  }
}
