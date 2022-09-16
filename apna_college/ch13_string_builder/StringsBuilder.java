package apna_college.ch13_string_builder;
public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ravinder");
        System.out.println(sb);

        // char at index 0
        // System.out.println(sb.charAt(1));

        // set char at index 0
        // sb.setCharAt(0, 'v');
        // System.out.println(sb);
        
        // inserting string
        sb.insert(2,'R');
        System.out.println(sb);

        // deleting string
        sb.delete(1,2);
        System.out.println(sb);

        // appending value
        StringBuilder grt = new StringBuilder("V");
        grt.append("i");
        grt.append("n");
        grt.append("i");
        grt.append("t");
        grt.append("a");
        System.out.println(grt);
    }
}
