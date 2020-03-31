package sortings;

import java.util.Scanner;

public class MergeSort {
    
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i=0; i< n; i++){
            arr[i] = obj.nextInt();
        }

        obj.close();
    }
}


