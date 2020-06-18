import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int a;
        int c = n;
        int b = 0;
        while(n != 0)
        {
            a = n % 10;
            b = (b*10) + a;
            n /= 10;
        }
        Boolean isPalindrome = (b == c ) ?  true : false;
        System.out.println("It's " + isPalindrome + " that the number is Palindrome!");
    }
}
