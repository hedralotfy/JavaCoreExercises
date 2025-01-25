import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = in.nextLine();
        int L = text.length()-1;
        int i=0;
        while(L>=i){
            System.out.print(text.charAt(L));
            L--;
        }
    }
}
