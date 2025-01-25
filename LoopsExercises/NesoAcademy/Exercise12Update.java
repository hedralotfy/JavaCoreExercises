import java.util.Scanner;

public class Exercise12Update {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int N = in.nextInt();
        int i,k;
        i=k=N;
        String str;
        int j = 1;
        int M=N*2-1;
        while(N>0&&j<=i){
            while(j<=M){
                str = (j>=i&&j<=k)? "*":" ";
                System.out.print(str);
                j++;
            }
            System.out.println();
            j=1;
            i--;
            k++;
        }
//        for(int j=1; N>0&&j<=i; i--){
//            for(int M=N*2-1; j<=M; j++){
//                str = (j>=i&&j<=k)? "*":" ";
//                System.out.print(str);
//            }
//            System.out.println();
//            j=1;
//            k++;
//        }
    }
}
