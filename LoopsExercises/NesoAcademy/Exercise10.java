import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        int j = str.length()-1;
        int i = 0;
        while(j>=i){
            if(i==j){
                System.out.println("String you entered is palindrome.");
                break;
            }
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                System.out.println("String you entered is not palindrome.");
                break;
            }
            if(i>j)
                System.out.println("String you entered is palindrome.");
        }
    }
}
