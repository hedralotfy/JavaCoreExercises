import java.util.Scanner;

public class Ex6_SumOfIntegerDigits {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int N = in.nextInt();
//        int digit = N % 10;
//        int divisor = 1;
////        int multiplier = divisor * 10;
//        int sum = 0;
//        while(true){
//            sum+=digit;
//            divisor *= 10;
//            if(divisor<N) {
//                digit = (N / divisor) % 10;
//            }
//            else
//                break;
////            divisor *= 10;
////            else if(sum<N)
////                break;
//        }
//        Or
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = in.nextInt();
        int digit = N % 10;
        int divisor = 1;
        int sum = 0;
        while(divisor<N) {
            sum += digit;
            divisor *= 10;
            digit = (N / divisor) % 10;
        }
        System.out.println("sum of digits in number is " + sum);
        }
    }
