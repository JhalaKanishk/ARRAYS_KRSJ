import java.util.*;
//SELECTION SORT
//13 46 24 52 20 9
public class Sort1 {
    static void Selection(int arr[],int n){
        for (int i=0;i<=n-2;i++) {
            int min = i;
            for (int j = 0; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
        System.out.println("Resultant Array :");
        toPrint(arr,n);
        System.out.println();
        System.out.println("After Applying Selection Sorting :");
        Selection(arr,n);
        toPrint(arr,n);
    }
}
