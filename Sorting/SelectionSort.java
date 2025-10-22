package Sorting;

import java.util.Scanner;

public class SelectionSort {
    static void selectionsort(int arr[], int n){
        int i,j,min,temp;
        for(i=0;i<n-1;i++){
            min=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
            }
        }
        temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;  
    }    
}
    //Method to print the array
    static void print(int arr[]){
        int n = arr.length;
        int i;
        System.out.println("Sorted array through selection sort: \n");
        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
            }

    }

    public static void main(String args[]){
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        n=sc.nextInt();
         int[] arr = new int[n];
        System.out.print("Enter the array: \n");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionsort(arr, n);
        print(arr);
        sc.close();
    }
    
}
