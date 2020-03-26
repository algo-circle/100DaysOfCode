package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
/*
*   Problem: Sort a sentence on the basis of length of the words in it.
*   Maintain the order if two words are of equal length.
*   Example -->
*   input:      "man cow holy"
*   output:     "holy man cow" 
*/

public class SentenceSort {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        String input;
        Scanner obj = new Scanner(System.in);

        while(obj.hasNext()){
            input = obj.nextLine();
            list = Arrays.asList(input.split(" "));

            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
                }
            });
            ListIterator<String> iter = list.listIterator();
            while(iter.hasNext()){
                    System.out.println(iter.next());
            }
        }
        obj.close();
    }
}