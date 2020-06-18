import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int b = n;
        int count = (int) Math.log10(n) + 1;
        System.out.println("The number of digits in " + b + " is: " + count + " !");
    }
}
