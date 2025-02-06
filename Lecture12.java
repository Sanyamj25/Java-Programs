import java.util.*;
public class Lecture12 {
    public static void main(String[] args) {
        //Strings in java
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String name3 = name1+name2;
        System.out.println(name3);
        System.out.println(name3.length());
        //charAt()<---- function  to access one character
        if(name1.compareTo(name2)==0){
            System.out.println(" Strings are equal");
        } else {
            System.out.println("String are not equal");
        }
        String name = name1.substring(5);
        System.out.println(name);
    }
}
