import java.util.Scanner;

public class JavaAdvancedPattern2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to print Pattern:");
        int n = sc.nextInt();
        int m = n-1;

        for(int i= 0; i<7 ; i++) {

                if(i>=0 && i<n) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                }



                if(i>=4 && i<7) {
                   for(int l=m;l>0;l--)
                   {
                       System.out.print("* ");
                   }
                   m--;
                }



            System.out.println();

        }
    }
}
