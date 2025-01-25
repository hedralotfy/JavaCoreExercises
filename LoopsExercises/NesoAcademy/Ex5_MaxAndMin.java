import java.util.Scanner;

public class Ex5_MaxAndMin {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers sequence: ");
         int n = in.nextInt();
int maximum = n;
int minimum = n;

if(n >= 0){
	while(true){
	n = in.nextInt();

	if(n<0)
		break;

	maximum = n > maximum ? n : maximum;
	minimum = n < minimum ? n : minimum;
	}
	System.out.println("maximum= " + maximum + ", minimum= " + minimum);
}
else
	System.out.println(n + " is invalid");
    }
}
