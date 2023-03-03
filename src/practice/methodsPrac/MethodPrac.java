package practice.methodsPrac;

import static java.lang.Integer.max;

public class MethodPrac {
    public static void incre(Integer x){
        x++;
    }

    // Variable argument
    // It should be the last argument in the function
    public static void variableArg(int ...n){
        for(int i : n){
            System.out.println(i);
        }
        int max = Integer.MIN_VALUE;
        for(int i:n){
            max = max(i,max);
        }
    }

    public static void main(String[] args) {
        Integer x = 45;
        System.out.println(x);
        incre(x);
        System.out.println(x);

    }
}
