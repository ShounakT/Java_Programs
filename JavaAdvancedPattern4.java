import java.util.Scanner;

public class JavaAdvancedPattern4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to print Pattern:");
        int n = sc.nextInt();
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=(2*(i-1));j++)
            {
                System.out.print("   ");
            }
            for(int j=1;j<=((n-i)+1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
