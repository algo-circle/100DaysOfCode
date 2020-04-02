package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Snackdown {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        BufferedReader.nullReader();
        try {
            s = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Scanner obj = new Scanner(System.in);
        //obj.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //int t = obj.nextInt();
        s = s.trim();
        int t = Integer.parseInt(s);
        for(int i = 0; i< t; i++){
            int n = obj.nextInt();
            if(n == 2019 || n == 2015 || n == 2016 || n == 2017 || n == 2010)
                System.out.println("HOSTED");
            else
                System.out.println("NOT HOSTED");
        }

        obj.close();
    }
}