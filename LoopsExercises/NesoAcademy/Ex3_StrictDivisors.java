import java.util.Scanner;

public class Ex3_StrictDivisors {
    public static void main(String[] args) {
  //A wrong code
//    Scanner in = new Scanner(System.in);
//System.out.print("Enter a number: ");
//    int N = in.nextInt();
//System.out.print("Strict divisors of " + N + " are: ");
//    int i = 1;
//while(i <= N/2){
//        int j = 1;
//        while(j <= i){
//            if(N%i == 0){
//                System.out.print(i + " + ");
//            }
//            j++;
//        }
//        i++;
//    }

        //Final code with inner while loop commented.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int N = in.nextInt();
//        System.out.print("Strict divisors of " + N + " are: ");
//        int i = 1;
//        while(i <= N/2){
//            if(N%i == 0){
//                System.out.print(i+ " ");
//            }
//            while(i != N/2){
//                if (N%i == 0) {
//                    System.out.print(" + ");
//                }
//                i++;
//            }
//            i++;
//        }

        //another wrong code.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int N = in.nextInt();
//        System.out.print("Strict divisors of " + N + " are: ");
//        int i = 1;
//        while(i <= N/2){
//            if(N%i == 0){
//                System.out.print(i);
//            }
//            while(i != N/2 && N%i == 0){
//                System.out.print(" + ");
//                i++;
//            }
//            i++;
//        }

        //Final code as I thought.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int N = in.nextInt();
//        System.out.print("Strict divisors of " + N + " are: ");
//        int i = 1;
//        while(i <= N/2){
//            if(N%i == 0){
//                System.out.print(i + " ");
//            }
//            i++;
//        }

        //Same final code but with doubles.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        double N = in.nextDouble();
//        System.out.print("Strict divisors of " + N + " are: ");
//        double i = 1;
//        while(i <= N/2){
//            if(N%i == 0){
//                System.out.print(i + " ");
//            }
//            i++;
//        }
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = in.nextInt();
        System.out.print("Strict divisors of " + N + " are: ");
        int i = 1;
        int sum = 0;

        while(i <= N/2){
            if(N%i == 0){
                System.out.print(i+ " ");
                sum = sum + i;
            }
            i++;
        }
        System.out.println();
        System.out.println("Sum of strict divisors is: " + sum);
        //To get sum of all the divisors of a number
        System.out.println("Sum of all divisors is: " + (sum + N));
    }
}
