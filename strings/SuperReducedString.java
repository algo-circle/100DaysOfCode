package strings;

/*  Given a string of lowercase letters, select a pair of adjacent lowercase letters that match, and delete them. 
*   Reduce the string to its shortest length by doing a series of operations
*   For instance, the string aab could be shortened to b in one operation.
*   Task is to delete as many characters as possible and print the result.
*   If the output string is empty then print "Empty String"
*/


import java.util.Scanner;

public class SuperReducedString {

    static String reduceString(String s) {

        String str = s;
        int n;
        //int count = 0;
        StringBuilder sb = new StringBuilder("");;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                str = str.substring(0, i-1) + str.substring(i+1);
                i = 0;
            }
        }
        if (str.length() == 0) {
            return("Empty String");
        } else {
            return str;
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        String output = reduceString(s);
        System.out.println(output);

        obj.close();
    }
}