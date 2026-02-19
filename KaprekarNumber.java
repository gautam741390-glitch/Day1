import java.util.Scanner;

public class KaprekarNumber {

    public static boolean isKaprekar(int n) {
        if (n == 1) return true;

        int square = n * n;
        String str = String.valueOf(square);

        for (int i = 1; i < str.length(); i++) {
            String leftPart = str.substring(0, i);
            String rightPart = str.substring(i);

            int left = Integer.parseInt(leftPart);
            int right = Integer.parseInt(rightPart);

            if (right != 0 && left + right == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isKaprekar(n))
            System.out.println(n + " is a Kaprekar number");
        else
            System.out.println(n + " is NOT a Kaprekar number");

        sc.close();
    }
}
