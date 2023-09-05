import java.util.Scanner;
//SUB-ARRAYS OF ARRAY
public class B2 {
    static void toGenrate(int arr[],int n){
        for (int i=0;i<=n-1;i++){
            for (int j=i;j<=n-1;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println("");
            }
        }
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
        for (int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        //output
        toPrint(arr,n);

        System.out.println("\nPossible Sub-Arrays are :");
        toGenrate(arr,n);

    }
}
