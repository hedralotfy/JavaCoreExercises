import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int N = in.nextInt();
        int i = 1;
        while(N>0&&i<=N){
            int j=1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
