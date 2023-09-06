import java.util.*;
//INSERTION SORT
//13 46 24 52 20 9

public class Sort3 {
   static void Insertion(int arr[],int n){
       for (int i=0;i<=n-1;i++){
           int j = i;
           while(j>0 && arr[j-1] > arr[j]){
               int temp = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = temp;
               j--;
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
        System.out.println("Resultant Array :");
        toPrint(arr,n);

        System.out.println("\nAfter Applying Insertion Sort :");
        Insertion(arr,n);
        toPrint(arr,n);

    }
}
