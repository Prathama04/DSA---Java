package Searching;

import java.util.Scanner;

public class LinearSearch {
    static void linearsearch(int arr[], int num){
        int i;
        int n = arr.length;
        boolean found = false;
        for(i=0; i<n; i++){
            if(arr[i] == num){
            System.out.println("The number is at index " + i);
            found = true;
            break;
            }
        }
         if (!found) {
        System.out.println("Number not found in the array.");
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
        System.out.println("Enter the number to be searched: ");
        int num = sc.nextInt();
        linearsearch(arr, num);
        sc.close();
    }
}

