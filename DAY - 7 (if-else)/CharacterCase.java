import java.util.Scanner;

class CharacterCase{

  public static void main(String agrs[]){
    
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the charcter : ");
    char character = sc.next().charAt(0);

    if(Character.isUpperCase(character)){
      System.out.println(character+" is upper case character");
    } else {
      System.out.println(character+" is lower case");
    }
  }
}
