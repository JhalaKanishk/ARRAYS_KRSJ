import java.util.*;
public class Sort4 {
    static void ms(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;//starting index of left half
        int right = mid+1;//starting index of right half

        while(left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while (right <= high){
            temp.add(arr[right]);
            right++;
        }

        //add the elements back to array
        for (int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }

    }
    static void mergesort(int arr[],int low,int high){
        if (low >= high) return;
        int mid =  (low+high)/2;//mid
        mergesort(arr,low,mid);//left
        mergesort(arr,mid+1,high);//right
        ms(arr,low,mid,high);

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
        int arr[] =  new int[n];
        //input
        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        //output
        System.out.println("Resultant Array :");
        toPrint(arr,n);

        System.out.println("\nAfter Applying Merge Sort :");
        mergesort(arr,0,n-1);
        toPrint(arr,n);
    }
}
