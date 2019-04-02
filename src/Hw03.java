import java.util.Scanner;

public class Hw03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            str = str.substring(2,str.length());
            Integer res = Integer.parseInt(str,16);
            System.out.println(res);
        }
    }
}
