import java.util.*;

public class AqySquareUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int mina = Math.abs(b-a)+Math.abs(c-a)+Math.abs(d-a);
        int minb = Math.abs(a-b)+Math.abs(a-c)+Math.abs(a-d);
        int minc = Math.abs(a-c)+Math.abs(b-c)+Math.abs(d-c);
        int mind = Math.abs(a-d)+Math.abs(b-d)+Math.abs(c-d);
        List<Integer> list = Arrays.asList(mina,minb,minc,mind);
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
