
   public class tribonacci {
    public static void main(String[] args) {
        int n = 10; // Example number of terms
        System.out.print("Tribonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(tribonacci(i) + " ");
        }
    }

    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }
}
