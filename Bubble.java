import java.util.*;
//BUBBLE SORT
//13 46 24 52 20 9

public class Sort2 {
   static void Bubble(int arr[],int n){
       for (int i=n-1;i>=0;i--){
           int didswap = 0;
           for (int j=0;j<=n-2;j++){
               if (arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   didswap = 1;
               }
           }
           if (didswap == 0){
               break;
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
        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Resultant Array :");
        toPrint(arr,n);
        System.out.println("\nAfter Applying Bubble Sorting :");
        Bubble(arr,n);
        toPrint(arr,n);
    }
}
