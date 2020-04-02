package implementation;

import java.util.Scanner;

public class SurfaceArea {

    public static void main(String[]args){

        Scanner obj = new Scanner(System.in);
        int h = obj.nextInt();
        int w = obj.nextInt();
        int result = 0;
        result = 6*h*w;
        int[][] arr = new int[h][w];

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                arr[i][j] = obj.nextInt();
            }
        }

        for(int i = 1; i< h; i++){
            for(int j = 0; j< w; j++){
                if(arr[i][j] > 0){
                    result+=5;
                    arr[i][j]--;
                }
            }
        }
        System.out.println(result);
        obj.close();
    }
}