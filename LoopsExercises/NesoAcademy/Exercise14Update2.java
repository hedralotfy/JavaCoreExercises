import java.util.Scanner;

public class Exercise14Update2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter input integer N: ");
        int N = in.nextInt();
        int j = 1;
        int i = N;
        String str;
        while(N>0&&j<=i){
            while(j<=N){
                str=(i==N||j!=1&&j!=N||i==1)?"*":" ";
                System.out.print(str);
                j++;
            }
            System.out.println();
            j=1;
            i--;
        }
    }
}
