import java.util.Scanner;

public class Ex2_SumOfNumberSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int n;
    int sum;
        System.out.print("Enter number sequence: ");
        n = in.nextInt();
        sum = n;
        while(sum <= 100){
            n = in.nextInt();
            sum = sum + n;
        }
        //System.out.println("Done");
        //or
        System.out.println("Done! sum is " + sum);

//        int n;
//    int sum;
//        System.out.print("Enter number sequence: ");
//        n = in.nextInt();
//        sum = n;
//        while(sum <= 100){
//            sum = sum + n; //sum like that is equivalent to: n*n
//            n = in.nextInt();
//        }
//        System.out.println("Done");
    }
}
