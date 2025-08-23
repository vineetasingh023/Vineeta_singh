import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // Input number
        int count = (a % 2 == 0) ? a - 1 : a; // If even, use previous odd

        int num = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(num);
            if (i < count) {
                System.out.print(", ");  // Add comma except last
            }
            num += 2;
        }
        sc.close();
    }
}
