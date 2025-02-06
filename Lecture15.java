public class Lecture15 {
    public static void main(String[] args) {
        //Bit Manipulation
        int n = 7;
        int pos = 2;
        System.out.println(n>>1);
        int bitmask = n<<pos;
        if((bitmask & n) == 0){
            System.out.println("bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}
