import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatch {
    public static void main(String[] args) {
   /*     String Str = new String("Welcome to Tutorialsyiibai.com");



        System.out.print("Return Value :" );
        System.out.println(Str.matches(".*Tutorials.*"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Welcome to Tutorialsyiibai.com"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches(".*Welcome.*"));*/

        String str3 = "+";
        boolean flag2 = str3.matches(".*\\+.*");
        System.out.println(flag2);



        /*Pattern p=Pattern.compile("abc");
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }*/


    }
}
