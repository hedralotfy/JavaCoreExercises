public class Exercise9Update {
    public static void main(String[] args) {
        String text = "ab cd";
        int L = text.length()-1;
        int i=0;
        String reverse = "";
        while(L>=i){
            reverse += text.charAt(L);
            L--;
        }

        System.out.println(reverse);
    }
}
