import java.util.Scanner;

class EmployeeBonus
{
public static void main(String agrs[])
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter the employee's salary: ");
double salary = sc.nextDouble();

System.out.print("Enter the employee's experience: ");
int experience = sc.nextInt();

double bonus = (experience > 20) ? (0.20 * salary) : (0.10 * salary);

System.out.println("The bonus of employee : "+bonus);


}
}