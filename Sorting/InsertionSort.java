package Sorting;

import java.util.Scanner;

public class InsertionSort {
    static void insertionsort(int arr[], int n){
        int i,j,key;
        for(i=1; i<n; i++){
        key = arr[i];
        j = i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1] = key;
}
}

    //Method to print the array
    static void print(int arr[]){
        int n = arr.length;
        int i;
        System.out.println("Sorted array through selection sort: \n");
        for(i=0; i<n; i++){
            System.out.print(arr[i] + " ");
            }

    }
    public static void main(String args[]){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array: \n");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        insertionsort(arr, n);
        print(arr);
        sc.close();
    }
}
