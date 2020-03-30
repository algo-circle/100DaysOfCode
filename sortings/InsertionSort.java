package sortings;

import java.util.Scanner;

public class InsertionSort{
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];

        for(int i=0; i< n; i++){
            arr[i] = obj.nextInt();
        }

        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        obj.close();
    } 
    
}