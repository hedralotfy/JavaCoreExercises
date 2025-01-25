public class Ex1_EvenNumbersFrom1to100 {
    public static void main(String[] args) {
        //Hedra's solution
        /*int n;
        n = 0;
        while(n <= 98){
            n = n+2;
            System.out.print(n + " ");
        }*/

        //Neso Academy's solution
        /*int n = 1;
        int ne = 100;
        while (n <= ne){
            if (n % 2 == 0)
                System.out.print(n + " ");
            n++;
        }*/
        
        int start = 100;
        int end = 1;
        while (start >= end) {
            if (start % 2 == 0)
                System.out.print(start + " ");
            start--;
        }
    }
}