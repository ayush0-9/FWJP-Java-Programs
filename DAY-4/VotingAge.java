import java.util.Scanner;

class CanVote
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter your age : ");
int age = sc.nextInt();

String answer = (age >= 18) ? "YES you are eligible for voting" : "NO you are not eligible for voting";

System.out.println(answer);
}
}