// import java.util.*;
public class Lecture13 {
    public static void main(String[] args) {
        //String Builder in java        Strings are immutable
        
        StringBuilder sb = new StringBuilder("Sanyam");
        // sb.setCharAt(0, 'D');
        // System.out.println(sb);
        // sb.insert(0, 0);
        // System.out.println(sb);
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;
            char  frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);

    }
}
