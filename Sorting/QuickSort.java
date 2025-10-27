package Sorting;

import java.util.Scanner;

public class QuickSort {
    
    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    static void swap(int arr[], int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quicksort(int arr[], int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }

    }

    static void print(int arr[]){
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
}
    
public static void main(String args[]){
    int n,i;
    System.out.println("Enter the no. of elements in array: ");
    Scanner sc=new Scanner(System.in);
    n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter the array: ");
    for(i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    quicksort(arr,0, n-1);
    print(arr);
}
    }
