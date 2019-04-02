import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class XiaoYilikesTheSequence {
    public static void main(String[] args) {

        try {
            Class cl = Class.forName("Person");
            try {
                Person per =(Person)cl.getDeclaredConstructor().newInstance();
                per.move();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




    }
}
