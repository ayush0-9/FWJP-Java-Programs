import java.util.Scanner;

class CharacterCheck{
  public static void main(String agrs[]){

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a Character : ");
    char ch = sc.next().charAt(0);

    if (Character.isAlphabetic(ch)){
      System.out.println("Charcter is a Alphabet");
    }
    else if (Character.isDigit(ch)){
      System.out.println("Charcter is a Number");
    }
    else {
      System.out.println("cCharacter is a Special Character");
    }
  }
}