package Sorting;

import java.util.Scanner;

public class MergeSort{
static void merge(int arr[], int l, int m, int r ){
    int n1 = m-l+1;
    int n2 = r-m;
    int[] subarr1 = new int[n1];
    int[] subarr2 = new int[n2];

    for(int i=0; i<n1; i++){
    subarr1[i] = arr[l+i];
    }

    for(int i=0; i<n2; i++){
    subarr2[i] = arr[m+1+i];
    }

    int i = 0;
    int j = 0;
    int k = l;

    while (i<n1 && j<n2){
        if(subarr1[i] <= subarr2[j]){
            arr[k] = subarr1[i];
            i++;
        }
        else{
            arr[k] = subarr2[j];
            j++;
        }
        k++;
    }

    while(i<n1){
        arr[k] = subarr1[i];
        i++;
        k++;
    }

    while(j<n2){
        arr[k] = subarr2[j];
        j++;
        k++;
    }
}

static void mergesort(int arr[], int left, int right){
    if(left<right){
        int mid = (left+right)/2;
        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);

        merge(arr, left, mid, right);
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
    mergesort(arr,0,n-1);
    print(arr);
}
}