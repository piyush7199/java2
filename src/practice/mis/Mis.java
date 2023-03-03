package practice.mis;
import java.util.*;
public class Mis {

    public static ArrayList<Long> factorialNumbers(long N){
        ArrayList<Long> res = new ArrayList();
        long count = 1l;
        long j = 1l;
        while(j*count<=N){
            res.add(j*count);
            count = j*count;
            j++;
        }
        return res;
    }

    public static long[] printFibb(int n)
    {
        long res[];
        if(n == 1){
            res = new long[1];
            res[0]=1l;
            return res;
        }
        if(n == 2){
            res = new long[2];
            res[0] = 1l;
            res[1] = 1l;
            return res;
        }
        res  = new long[n];
        res[0] = 1l;
        res[1] = 1l;
        for(int i = 2;i<n;i++){
            res[i] = res[i-1]+res[i-2];
        }
        return res;

    }

    public static void main(String[] args) {

    }
}
