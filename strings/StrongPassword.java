package strings;

import java.util.Scanner;

class StrongPassword{
    
    static int additional=0;
    static boolean low_count=false, upper_count=false, digit_count=false, special_count=false;

    static void checkChars(int n, String password){

        for(int i=0; i< n; i++){
            if(password.charAt(i) >= 65  && password.charAt(i) <= 90 )
                upper_count = true;

            if(password.charAt(i) >=97  && password.charAt(i) <= 122 )
                low_count = true;

            if(password.charAt(i) >=48  && password.charAt(i) <= 57 )
                digit_count = true;
            //!@#$%^&*()-+
            if(password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#'
            || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '^'
            || password.charAt(i) == '&' || password.charAt(i) == '*' || password.charAt(i) == '('
            || password.charAt(i) == ')' || password.charAt(i) == '-' || password.charAt(i) == '+')   
                special_count = true;
        }
    }

    static int checkPassword(int n, String password){
        int total = 0;
        if(n < 6)
            additional = 6-n-1;
        else
            additional = 0;
        
        checkChars(n, password);
        
            if(!upper_count)
                total++;
            if(!low_count)
                total++;
            if(!special_count)
                total++;
            if(!digit_count)
                total++;


            return total + additional;
        }

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = obj.next();
        int output = checkPassword(s.length(), s);
        System.out.println( output);
    }
}