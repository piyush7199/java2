package practice.maths;

public class BasicMathPractice {
    public static int countDigit(int N){
        int c = 0;
        while(N>0){
            int rem = N%10;
            if(rem != 0 && N%rem == 0) c++;
            N = N/10;
        }
        // return (int) Math.floor(Math.log10(N) + 1);
        return c;
    }

    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] res = new Long[2];
        res[1] = gcd(A,B);
        res[0] = (A*B)/res[1];
        return res;
    }
    public static Long gcd(Long a, Long b){
        while(a>0 && b>0){
            if(a>b) {
                a = a % b;
            }
            else {
                b=b%a;
            }
        }
        return a==0?b:a;
    }
    public static int reverseNumber(int X){
        int num = X<0?-X:X;
        long res = 0;
        while(num>0){
            long rem = num%10;
            res = res*10+rem;
            num = num/10;
        }
        if(X<0){
            res = -res;
            if(res<-2147483648) return 0;
            return (int)res;
        }
        if(res>2147483647) return 0;
        return (int)res;
    }

    public static boolean isPalindrome(int X) {
        if(X<0) return false;
        int num = X;
        long res = 0;
        while(num>0){
            long rem = num%10;
            res = res*10+rem;
            num = num/10;
        }
        return X==res;
    }

    public static String armstrongNumber(int n){
        // code here
        int num = n;
        int res = 0;
        while(num>0){
            int rem = num%10;
            res += (rem*rem*rem);
            num = num/10;
        }
        return res==n?"Yes":"No";
    }
    public static void main(String[] args) {
        // System.out.println(countDigit(2226));
        // System.out.println(reverseNumber(2147448));
        // System.out.println(isPalindrome(-1221));
        // System.out.println(armstrongNumber(153));
        System.out.println(gcd(25105l,71530l));
    }
}
