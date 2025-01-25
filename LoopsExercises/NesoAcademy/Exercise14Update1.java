import java.util.Scanner;

public class Exercise14Update1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter input integer N: ");
        int N = in.nextInt();
        int j=1;
        int i=N;
        String str;
        while(N>0&&j<=i){
            while(j<=N){
                str=(j==1||i==1||i==N||j==N)?"*":" ";
                System.out.print(str);
                j++;
            }
            System.out.println();
            j=1;
            i--;
        }
    }
}
