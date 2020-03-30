package sortings;

import java.util.Scanner;

public class SelectionSort {
    
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i< n; i++){
            arr[i] = obj.nextInt();
        }
        
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        obj.close();
    } 


}