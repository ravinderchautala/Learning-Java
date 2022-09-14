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
        sb.insert(2,'V');
        System.out.println(sb);

        // deleting string
        sb.delete(2,4);
        System.out.println(sb);

        // appending value
        StringBuilder grt = new StringBuilder("h");
        grt.append("e");
        grt.append("l");
        grt.append("l");
        grt.append("o");
        System.out.println(grt);
    }
}
