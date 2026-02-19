import java.util.Scanner;

public class SuperNumber {
    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int digitSum = 0;
        int temp = num;
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("Sum of digits: " + digitSum);
        
        if (isPerfect(digitSum)) {
            System.out.println(num + " is a Super Number");
        } else {
            System.out.println(num + " is not a Super Number");
        }
        
        sc.close();
    }
}
