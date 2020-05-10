public class StringUtilities {

    public static String reverse(String s) {
        if (s == null) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder();
        for(Character c: s.toCharArray()) {
            sb.append(c);
        }

        return sb.reverse().toString();
    }
}
