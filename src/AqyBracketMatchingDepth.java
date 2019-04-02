import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AqyBracketMatchingDepth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int depth = 0,max = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == '('){
                depth++;
            }
            else {
                if(depth != 0){
                    depth--;
                }
            }
            max = Math.max(depth,max);
        }
        System.out.println(max);


        //        char[] cs = str.toCharArray();

/*        for(int i = 0;i<str.length();i++){
            list.add(str.charAt(i));
        }
        int count = 0;
        while(list.size()!=0){
            if(list.get(0)==')'){
                count++;
                list.remove(0);
            }
            else{
                if(list.size()>1){
                    for (int i = 1; i < list.size(); i++) {
                        if(list.get(i) == ')'){
                            list.remove(i);
                            break;
                        }
                        if(list.get(list.size()-1)=='('){
                            count++;
                        }
                    }
                    list.remove(0);
                }

                if(list.size()==1){
                    count++;
                    list.remove(0);
                }
            }
        }
        System.out.println(count);*/

//        int countL = 0,countR = 0,i = 0;
//        while(i < cs.length){
//            if(cs[i] == '('){
//                countL++;
//            }else {
//                if(countL != 0){
//                    countL--;
//                }else{
//                    countR++;
//                }
//            }
//            i++;
//        }
//        System.out.println(countL + countR);
    }
}

