import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int N=in.nextInt();
        int i=N;
        int j=1;
        while(N>0&&j<=i){
            while(j<=N){
                System.out.print("*");
                j++;
            }
            System.out.println();
            j=1;
            i--;
        }
    }
}
