import java.util.*;
public class Lecture19 {
    public static void Permutation(String str,String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr  = str.substring(0, i)+str.substring(i+1);
            Permutation(newStr, perm+currChar);
        }
    }
    //Count total paths in a maze to move from (0,0) to(m,n)
    public static int CountPath(int i,int j,int n,int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        //Downwards paths
        int downward = CountPath(i+1, j, n, m);
        //Right paths
        int right = CountPath(i, j+1, n, m);
        return downward+right;
    } 
    //Place tiles of a size 1Xm in a floor of size nXm
    public static int placeTile(int n,int m){
        if(n ==  m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        //Vertical
        int ver = placeTile(n-m, m);
        //Horizontal
        int hor = placeTile(n-1, m);
        return ver+hor;
    }
    //Find the number of ways in which you can invite n people to your party ,single or in pairs
    public static int CallGuest(int n){
        if(n <= 1){
            return 1;
        }
        //Single
        int ways1 = CallGuest(n-1);
        //Pairs
        int ways2 = (n-1)*CallGuest(n-2);
        return ways1+ways2;
    }
    public static void printSubset(ArrayList<Integer> subset){
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void SubsetOfNatural(int n,ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        SubsetOfNatural(n-1, subset);
        //add nhi hoga
        subset.remove(subset.size()-1);
        SubsetOfNatural(n-1, subset);
    }
    public static void main(String[] args) {
        // Permutation of a string "abc"
        // String str = "abc";
        // Permutation(str, "");

        // Count Paths
        // int  n = 3, m = 3;
        // int res = CountPath(0,0,n,m);
        // System.out.println("Total paths "+res);

        //Place tiles in a floor
        // int n =2,m =2;
        // int ans = placeTile(n, m);
        // System.out.println(ans);

        //Call Guest
        // int n = 3;
        // int ans = CallGuest(n);
        // System.out.println(ans);

        //Subset of n natural number
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        SubsetOfNatural(n,subset);
    }   
}
