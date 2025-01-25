import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int N = in.nextInt();
        int sum, count, i, j;
        i = j = count = 0;
        sum = 1;
        if (N > 0) {
            while (true) {
                if (count == N) {
                    System.out.println(sum + " is in place " + N + " in Fibonacci sequence.");
                    break;
                }
                count++;
                if (count == 1)
                    continue;
                i = sum;
                sum = i + j;
                j = i;
            }
        }else
            System.out.println("What you entered is not in the Fibonacci sequence.");
    }
}
