package apna_college.ch15_bit_manipulation;

public class ClearBit {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitmask= 1<<pos;
        int notbitmask = ~(bitmask); 
        int newNumber = notbitmask & n;
        System.out.println(newNumber);
    }
}
