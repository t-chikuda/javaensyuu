import java.util.*;

public class Practice13_3 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addLast("あ");
        list.addLast("い");


        for (String str : list) { //(1)
            System.out.println(str);
        }

        Iterator<String> it = list.iterator(); //(2)
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
