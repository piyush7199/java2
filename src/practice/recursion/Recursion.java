package practice.recursion;

public class Recursion {

    static public void printNos(int N)
    {
        if(N == 0){
            return;
        }else{
            printNos(N-1);
            System.out.print(N+" ");
        }
    }

    public static void printGfg(int N) {
        if(N == 0){
            return;
        }
        printGfg(N-1);
        System.out.print("GFG"+" ");
    }

    public static void printRevNos(int N) {
        if(N == 0){
            return;
        }
        System.out.print(N+" ");
        printNos(N-1);
    }

    public static boolean isPalindrome(String s){
        int left = 0,right = s.length()-1;
        while(right>left){
            char l = s.charAt(left), r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left ++;
            }else if(!Character.isLetterOrDigit(r)){
                right --;
            }else if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }else{
                left ++;
                right --;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // printNos(10);
        // printGfg(10);
        // printRevNos(10);
        System.out.println(isPalindrome("Hey eh"));
    }
}
