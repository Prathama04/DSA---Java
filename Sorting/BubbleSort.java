package Sorting;
import java.util.Scanner;

class BubbleSort{
    static void bubblesort(int arr[], int n){
    int i,j,temp;
    boolean swapped;
    for(i=0;i<n;i++){
        swapped = false;
        for(j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
        }
        if(swapped==false)
            break;
    }
}
    //Method to print the array
    static void print(int arr[]){
        int n = arr.length;
        int i;
        System.out.println("Sorted array through bubble sort: \n");
        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
            }

}
    public static void main(String args[]){
        int n, i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array: \n");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        bubblesort(arr, n);
        print(arr);
        
        sc.close();

    }}