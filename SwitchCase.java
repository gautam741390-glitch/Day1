import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("VIBGYOR Colors:");
        System.out.println("1 - Violet");
        System.out.println("2 - Indigo");
        System.out.println("3 - Blue");
        System.out.println("4 - Green");
        System.out.println("5 - Yellow");
        System.out.println("6 - Orange");
        System.out.println("7 - Red");
        
        System.out.print("Enter a number (1-7): ");
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("Violet");
                break;
            case 2:
                System.out.println("Indigo");
                break;
            case 3:
                System.out.println("Blue");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Yellow");
                break;
            case 6:
                System.out.println("Orange");
                break;
            case 7:
                System.out.println("Red");
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 7.");
        }
        
        sc.close();
    }
}
