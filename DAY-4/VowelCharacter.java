import java.util.Scanner;

class CheckVowel
{
  public static void main(String agrs[])
  {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the Character : ");
    char ch = sc.next().charAt(0);

    String answer = (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') ? " Is a Vowel" : " Is Not a Vowel";

    System.out.println(ch+answer);
  }
}