import java.util.Scanner;

public class JavaAdvancedPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to print Pattern:");
        int n = sc.nextInt();
        int h =1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<= n-i;j++)
            {
                System.out.print("   ");
            }
            for(int j=1;j<= i;j++)
            {
                System.out.print(h + "   ");
                h++;
            }
            System.out.println();
        }

    }
}
