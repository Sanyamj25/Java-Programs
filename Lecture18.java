import java.util.HashSet;
public class Lecture18 {
    public static void TowerOfHanoi(int n,String src,String help,String dest){
        if (n == 1) {
            System.out.println("Transfer disc "+n+" from "+src+" to "+dest);
            return;
        }
        TowerOfHanoi(n-1, src, dest, help);
        System.out.println("Transfer disc"+n+" from "+src+" to "+dest);
        TowerOfHanoi(n-1, help,src, dest);
    }
    public static void Reverse(String name,int idx){
        if(idx == 0){
            System.out.println(name.charAt(idx));
            return;
        }
        System.out.print(name.charAt(idx));
        Reverse(name, idx-1);
    }
    static int first = -1,last = -1;
    public static void occurance(String str,char ele,int idx){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == ele){
            if(first == -1){
                first = idx;
            }
            else { 
                last = idx;
            }
        }
        occurance(str, ele, idx+1);
    }
    public static boolean StrictSort(int arr[],int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]< arr[idx+1]){
            //array is sorted
            return StrictSort(arr, idx+1);
        } else {
            return false;
        }
    }
    public static void MoveAllX(String str,int idx,int count,String NewStr){
        if(idx == str.length()-1){
            for (int i = 0; i < count; i++) {
                NewStr += 'x';
            }
            System.out.println(NewStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            MoveAllX(str, idx+1, count, NewStr);
        } else{
            NewStr += currChar;
            MoveAllX(str, idx+1, count, NewStr);
        }
    }
    public static boolean map[] =  new boolean[26];
    public static void RemoveDupl(String str,int idx,String newStr){
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            RemoveDupl(str, idx+1,newStr);
        } else {
            newStr += currChar;
            map[currChar-'a'] = true;
            RemoveDupl(str, idx+1, newStr);
        }
    }
    public static void SubSequence(String str,int idx,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //To be
        SubSequence(str, idx+1, newString+currChar);
        //Not  to be
        SubSequence(str, idx+1, newString);
    }
    public static void SubSequence(String str,int idx,String newString,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            } else{
            System.out.println(newString);
            set.add(newString);
            return;
            }
            
        }
        char currChar = str.charAt(idx);
        //To be
        SubSequence(str, idx+1, newString+currChar,set);
        //Not  to be
        SubSequence(str, idx+1, newString,set);
    }
    public static String[] keyboard = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int idx,String Comb){
        if(idx == str.length()){
            System.out.println(Comb);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keyboard[currChar-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx+1, Comb+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        // Tower of Hanoi
        // int n =2;
        // TowerOfHanoi(n, "S","H","D");

        //Print a string in reverse
        // String name =  "sanyam";
        // Reverse(name,name.length()-1);

        //Find first and last occurance of an element in a string
    //     String str = "aajfjsjaah";
    //     char ele = 'a';
    //     int idx = 0;
    //     occurance(str,ele,idx);
    // }

    //Strictly sorted
    // int arr[] = {1,2,3,5,6};
    // boolean res = StrictSort(arr,0);
    // System.out.println(res);

    //Move all x to  the end
    // String str = "axjxjxlkxxl";
    // MoveAllX(str,0,0,"");

    //Remove duplicate
    // String str = "ajasbbsb";
    // RemoveDupl(str, 0, "");

    //SubSequense
    // String str = "abc";
    // SubSequence(str,0,"");

    // Hashset Unique sunsequence
    // String str = "aaa";
    // HashSet<String> set = new HashSet<>();
    // SubSequence(str,0,"",set);

    //Keyboard print
    String str = "23";
    printComb(str, 0, "");
}
}