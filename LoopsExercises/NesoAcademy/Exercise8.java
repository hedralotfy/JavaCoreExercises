import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = in.nextLine();
        int index=0;
        int L = text.length();
        while(index<L){
            System.out.print(text.charAt(index)+(" "));
            index++;
        }
    }
}
