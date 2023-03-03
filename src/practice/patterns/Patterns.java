package practice.patterns;

public class Patterns{
    /*
     
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * *   

    */
    public static void printSquare(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

     *
     * *
     * * *
     * * * *
     * * * * *

     */
    public static void printTriangle(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

     */
    public static void printNumberTriangle(int n) {
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*

     * * * * *
     * * * *
     * * *
     * *
     *

     */
    public static void printReverseTriangle(int n) {
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1

     */
    public static void printReverseNumberTriangle(int n) {
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    /*

    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15

     */
    public static void printCountTriangle(int n){
        char count = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    /*

    A
    AB
    ABC
    ABCD
    ABCDE

     */
    public static void printAlphaTriangle(int n){
        for(int i = 0;i<n;i++){
            char count = 'A';
            for(int j = 0;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    /*

    ABCDE
    ABCD
    ABC
    AB
    A

     */
    public static void printAlphaReverseTriangle(int n){
        for(int i = 0;i<n;i++){
            char count = 'A';
            for(int j = i;j<n;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    /*

    A
    BB
    CCC
    DDDD
    EEEEE

     */
    public static void printAlphaSameTriangle(int n){
        char count = 'A';
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(count);
            }
            System.out.println();
            count++;
        }
    }

    /*

     ****
     *  *
     *  *
     ****

     */
    public static void printEmptySquare(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*

         *
        ***
       *****
      *******
     *********

     */
    public static void printFullTriangle(int n) {
        for(int i = 0;i<n;i++){
           for(int j=0;j<n-1;j++){
               if(i+j>=n-1){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
            System.out.print("*");
           for(int j = n;j<n*2-1;j++){
               if(j-i<=n-1){
                   System.out.print("*");
               }
           }
            System.out.println();
        }
    }

    /*

     *********
      *******
       *****
        ***
         *


     */
    public static void printReverseFullTriangle(int n) {
        for(int i = 0;i<n;i++){
            for(int j=2*n-1;j>n;j--){
                if(i+j<=2*n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            for(int j = n-1;j>0;j--){
                if(j-i>0){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    /*

         *
        * *
       * * *
      * * * *
     * * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

     */
    public static void printDiamond(int n) {

    }

    public static void printOneSidedTriangle(int n) {
        for(int i = 0;i<=2*n-1;i++){
            for(int j = 0;j<i && i<=n;j++){
                System.out.print("* ");
            }
            for(int j = i;j<=2*n-1 && i>n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *

     */
    public static void printOneSidedTriangle2(int n) {
        for(int i = 1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j = 0;j<stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1

     */
    public static void printAlternative(int n){
        for(int i = 0;i<n;i++){
            int print = (i%2==0) ? 1 : 0;
            for(int j=0;j<=i;j++) {
                System.out.print(print);
                print = 1 - print;
            }
            System.out.println();
        }
    }

    /*

        A
       ABA
      ABCBA
     ABCDCBA
    ABCDEDCBA

     */
    public static void printATriangle(int n) {
        for(int i = 0;i<n;i++){
            char print = 'A';
            for(int j=0;j<n-1;j++){
                if(i+j>=n-1){
                    System.out.print(print);
                    print++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print(print);
            print--;
            for(int j = n;j<n*2-1;j++){
                if(j-i<=n-1){
                    System.out.print(print);
                    print--;
                }
            }
            System.out.println();
        }
    }

    /*

        1                 1
        1 2             2 1
        1 2 3         3 2 1
        1 2 3 4     4 3 2 1
        1 2 3 4 5 5 4 3 2 1

     */
    public static void printTwoNumberTriangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                    System.out.print(j+" ");
            }
            for(int j = i+1;j<=2*n;j++){
                if(i+j>2*n)
                    System.out.print(2*n-j+1+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    /*

    E
    D E
    C D E
    B C D E
    A B C D E

     */
    public static void printCharTriangle(int n){
        for(int i=0;i<n;i++){
            char print = 'A';
            print = (char) (print+n-1-i);
            for(int j = 0;j<=i;j++){
                System.out.print(print);
                print++;
            }
            System.out.println();
        }
    }

    /*

    E
    E D
    E D C
    E D C B
    E D C B A

     */
    public static void printCharTriangle2(int n) {
        for(int i=0;i<n;i++){
            char print = 'A';
            print = (char) (print+n-1);
            for(int j = 0;j<=i;j++){
                System.out.print(print+" ");
                print--;
            }
            System.out.println();
        }
    }

    /*

     **********
     ****  ****
     ***    ***
     **      **
     *        *
     *        *
     **      **
     ***    ***
     ****  ****
     **********

     */
    public static void pattern19(int n){
        int spaces = 0;
        for(int i = 0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
            spaces += 2;
        }
        spaces -= 2;
        for(int i = 0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            spaces -= 2;
        }
    }

    /*

     *        * [1,8,1]
     **      ** [2,6,2]
     ***    *** [3,4,3]
     ****  **** [4,2,4]
     ********** [5,0,5]
     ****  **** [4,2,4]
     ***    *** [3,4,3]
     **      ** [2,6,2]
     *        * [1,8,1]

     */
    public static void pattern20(int n){
        int spaces = 2*n-2;
        for(int i = 0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            spaces -= 2;
            System.out.println();
        }
        spaces = 2;
        for(int i = 0;i<n-1;i++) {
            for(int j=0;j<n-1-i;j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-1-i;j++){
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }
    }

    /*

    4444444
    4333334
    4322234
    4321234
    4322234
    4333334
    4444444

     */
    public static void pattern22(int n) {
        int count = 2*n-1;
        for(int i = 0;i<count;i++){
            for(int j=0;j<count;j++){
                int top     = i;
                int left    = j;
                int right   = 2*n-2-j;
                int buttom  = 2*n-2-i;
                int min     = Math.min(Math.min(Math.min(top,left),buttom),right);
                System.out.print(n-min);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // printSquare(5);
        // printTriangle(5);
        // printNumberTriangle(5);
        // printReverseTriangle(5);
        // printReverseNumberTriangle(5);
        // printCountTriangle(5);
        // printAlphaTriangle(5);
        // printAlphaReverseTriangle(5);
        // printAlphaSameTriangle(5);
        // printEmptySquare(4);
        // printReverseNumberTriangle(5);
        // printFullTriangle(5);
        // printReverseFullTriangle(5);
        // printDiamond(5); TODO this one
        // printOneSidedTriangle(5); // TODO change the logic
        // printAlternative(5);
        // printATriangle(5);
        // printTwoNumberTriangle(5);
        // printCharTriangle(5);
        // printCharTriangle2(5);
        //printOneSidedTriangle2(5);
        // pattern19(5);
        // pattern20(5);
        pattern22(4);
    }
}