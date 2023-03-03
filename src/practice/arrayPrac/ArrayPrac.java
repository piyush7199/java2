package practice.arrayPrac;

public class ArrayPrac {

    // Array is a collection of similar data elements
    // In java every array is an object and it is created in heap
    // Length is the property (that is why we call it without length())
    // It will have the default values of the data type

    public static void rotateByOne(int arr[]){
        int temp = arr[0];
        for(int i = 1;i< arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]=temp;
    }

    public static void rotate(int arr[], int r){
        r = r%arr.length;
        for(int i = 0;i<r;i++){
            rotateByOne(arr);
        }
    }

    public static void insert(int arr[],int index,int len,int val){
        for(int i = len;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=val;
        return;
    }

    public static void delete(int arr[],int index){
        for(int i = index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
    }

    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

//        int array2[] = {1,2,3,4,5};
//        print(array2);
//        rotate(array2,7);
//        print(array2);
//        int arr[] = new int[6];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        arr[4]=5;
//        arr[5]=6;
//        print(arr);
//        insert(arr,2,6,7);
//        print(arr);
//        delete(arr,2);
//        print(arr);
//        int arr[][] = new int[5][4];
//        int[] E, F[]; // E is 1D array but F is 2D;

        int A[][] = {{3,5,9,4},{7,6,2,2},{4,3,5,1}}; //3*4
        /*
        3 5 9 4     1 5 2 1 2
        7 6 2 2     6 8 4 7 8
        4 3 5 1     3 9 7 9 4
                    1 2 3 4 3
         */

        int B[][] = {{1,5,2,1,2},{6,8,4,7,8},{3,9,7,9,4},{1,2,3,4,3}}; //4*5
        int C[][] = new int[3][5];

        for(int i =0;i<3;i++){
            for(int j = 0; j < 5 ;j++){
                int sum = 0;
                for(int k = 0;k<4;k++){
                    sum = sum+ (A[i][k]*B[k][j]);
                }
                C[i][j]=sum;
            }
        }

        for(int a[]:C){
            for(int x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}
