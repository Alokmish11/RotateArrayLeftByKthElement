
public class RotateArryLeftByKthElement {
    static void Reverse(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void Rotate(int arr[],int n,int k){
        // Reverse First K element
        Reverse(arr,0,k-1);

        // Reverse last k element
        Reverse(arr,k,n-1);
         // Reverse whole arry
         Reverse(arr,0,n-1);
    }
    
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        int n=7;
        int k=3;
        Rotate(arr,n,k);
        System.out.println("After Rotate left Kth element");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        }
    }

