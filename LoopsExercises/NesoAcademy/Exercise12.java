import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int N=in.nextInt();
        String str;
        int j=1;
        for(int i=N; N>0&&j<=i; i--){
            for(;j<=N; j++){
                str=((j<i)?" ":"*");
                System.out.print(str);
            }
            System.out.println();
            j=1;
        }
//        int i=N;
//        while(N>0&&j<=i){
//            while(j<=N){
//                str=((j<i)?" ":"*");
//                System.out.print(str);
//                j++;
//            }
//            System.out.println();
//            j=1;
//            i--;
//        }
    }
}
