import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        int a,sum = 0,b=n;
        while(n != 0)
        {
             a   =  n%10;
             sum += a;
             n   /= 10;
        }
        System.out.println("The sum of digits of " + b + " is " + sum + " !");
    }
}
