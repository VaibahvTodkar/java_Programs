public class CharCount {
    public static void main(String[] args) {
        String input = "aaaabbbbccccdddd";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            int count = 1;
            while (i + 1 < input.length() && input.charAt(i + 1) == current) {
                count++;
                i++;
            }
            output += current + "" + count;

        }
        System.out.println(output);

    }
}
