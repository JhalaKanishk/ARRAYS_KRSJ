import java.util.Scanner;
//https://www.scaler.com/topics/how-to-run-java-program/
public class B0 {
    //SUM AND MULTIPLY OF ARRAY ELEMENTS
    static int toMul(int arr[],int n){
        int mul = 1;
        for (int i=0;i<=n-1;i++) {
            mul *= arr[i];
        }
        return mul;
    }
    static int toSum(int arr[],int n){
        int sum = 0;
        for (int i=0;i<=arr.length-1;i++){
            sum += arr[i];
        }
        return sum;
    }
    static void toPrint(int arr[],int n){
        for (int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int arr[] = new int[n];
        //input
        for (int i=0;i<=n-1;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Resultant Array :");
        toPrint(arr,n);

        System.out.println("Array Elements Sum is : "+toSum(arr,n));
        System.out.println("Array Elements Multiply is : "+toMul(arr,n));
    }
}
