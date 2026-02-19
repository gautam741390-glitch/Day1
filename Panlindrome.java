import java.util.Scanner;

public class Panlindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String num = sc.nextLine();
        
        String reversed = new StringBuilder(num).reverse().toString();
        
        if (num.equals(reversed)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is not a Palindrome");
        }
        
        sc.close();
    }
}
