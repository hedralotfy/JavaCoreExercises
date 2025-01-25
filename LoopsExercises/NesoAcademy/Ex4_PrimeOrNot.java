import java.util.Scanner;

public class Ex4_PrimeOrNot {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int N = in.nextInt();
//        int i = 2;
//
//        while(N>0){
//            if(i>1 && i<N && (N%i == 1))
//                i++;
//            else if(i>1 && i<N && (N%i == 0)){
//                System.out.println(N + " is not a prime number.");
//                break;
//            }else{
//                System.out.println(N + " is a prime number.");
//                break;
//            }
//        }
        //FINAL CODE.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int N = in.nextInt();
//        int i = 2;
//        while(N>0){
//            while(N>1){
//                if(i>1 && i<N && (N%i == 1))
//                    i++;
//                else if(i>1 && i<N && (N%i == 0)){
//                    System.out.println(N + " is not a prime number.");
//                    break;
//                }else{
//                    System.out.println(N + " is a prime number.");
//                    break;
//                }
//            }
//            System.out.println(N + " is not a prime number.");
//            break;
//        }
//        System.out.println(N + "is a negative number.");

        //FINAL CODE WITH EDIT.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int N = in.nextInt();
//        int i = 2;
//        while(N>0){
//            while(N>1){
//                if(i>1 && i<N && (N%i == 1))
//                    i++;
//                else if(i>1 && i<N && (N%i == 0)){
//                    System.out.println(N + " is not a prime number.");
//                    break;
//                }else{
//                    System.out.println(N + " is a prime number.");
//                    break;
//                }
//            }
//            System.out.println(N + " is not a prime number.");
//            break;
//        }
//        System.out.println(N + "is a negative number.");

        //FINAL CODE WITH LATEST EDIT.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int N = in.nextInt();
//        int i = 2;
//        if(N>0){
//            while(N>1){
//                if(i>1 && i<N && (N%i == 1))
//                    i++;
//                else if(i>1 && i<N && (N%i == 0)){
//                    System.out.println(N + " is not a prime number.");
//                    break;
//                }else{
//                    System.out.println(N + " is a prime number.");
//                    break;
//                }
//            }
//            System.out.println(N + " is not a prime number.");
//            break;
//        }else
//            System.out.println(N + "is a negative number.");

        //Final code with another edit.
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int N = in.nextInt();
//        int i = 2;
//        if(N>0){
//            while(N>1){
//                if(i>1 && i<N && (N%i == 1))
//                    i++;
//                else if(i>1 && i<N && (N%i == 0)){
//                    System.out.println(N + " is not a prime number.");
//                    break;
//                }else{
//                    System.out.println(N + " is a prime number.");
//                    break;
//                }
//            }
//            System.out.println(N + " is not a prime number.");
//        }else
//            System.out.println(N + "is a negative number.");

        //Final code after another edit:
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int N = in.nextInt();
//        int i = 2;
//        if(N>0){
//            while(N>1){
//                if(i>1 && i<N && (N%i == 1))
//                    i++;
//                else if(i>1 && i<N && (N%i == 0)){
//                    System.out.println(N + " is not a prime number.");
//                    break;
//                }else{
//                    System.out.println(N + " is a prime number.");
//                    break;
//                }
//            }
//            System.out.println(N + " is not a prime number.");
//        }else
//            System.out.println(N + " is not a positive number.");
        //TO BE EDITED.

        //Final code when brain was calm.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = in.nextInt();
        int i = 2;

        if (N > 0) {
            while (true) {
                if (i > 1 && i < N && (N % i == 1))
                    i++;
                else if (i > 1 && i < N && (N % i == 0) || N == 1) { //<--The edit was || N == 1
                    //and it will be explained later.
                    System.out.println(N + " is not a prime number.");
                    break;
                } else {
                    System.out.println(N + " is a prime number.");
                    break;
                }
            }
        } else
            System.out.println(N + " is not a positive number.");
    }
}

