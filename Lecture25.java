import java.util.ArrayList;
public class Lecture25 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(557);
        list.add(26);
        System.out.println(list);
        list.add(1, 16);
        list.set(2, 36);
        list.remove(1);
        System.out.println(list);
    }
}
