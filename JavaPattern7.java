import java.util.Scanner;

public class JavaPattern7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to print Pattern:");
        int n = sc.nextInt();
        int o = 0;
            for(int k=1;k<=n;k++)
            {
                    for(int l=1;l<=n-k+1;l++)
                    {
                        System.out.print("* ");
                    }
                    for(int l=1;l<=2*k;l++)
                    {
                        System.out.print("  ");
                    }
                    for(int l=1;l<=n-k+1;l++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();

            }
            System.out.println();
            for(int k=1;k<=n;k++)
            {
                for(int j=1;j<=k;j++)
                {
                    System.out.print("* ");
                }
                for(int j=1;j<=((n*2)-o);j++)
                {
                    System.out.print("  ");
                }
                for(int j=1;j<=k;j++)
                {
                    System.out.print("* ");
                }
                o+=2;
                System.out.println();

            }
    }
}
