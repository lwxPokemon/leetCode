import java.util.*;
public class AqyDigitalGames{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        List<Character> list = new ArrayList<>();
        List<Integer> resList = new ArrayList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j < strArr[i].length();j++){
                list.add(strArr[i].charAt(j));
            }
            Collections.sort(list);
            String s = "";
            for(Character c:list){
                s += String.valueOf(c);
            }
            resList.add(Integer.valueOf(s));
            list.clear();
        }
        Collections.sort(resList);
        System.out.println(resList.get(resList.size()-1));
    }
}