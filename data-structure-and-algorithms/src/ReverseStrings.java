public class ReverseStrings {
    public static void main(String[] args) {
        String test = "able was i ere i saw elba";// palindrome :^)
        String visitor = ""; // make your test! input your text and run
        ReverseString(test);
        ReverseString(visitor);
    }

    public static void ReverseString(String input) {
        int stringLength = input.length();
        StringBuilder aux = new StringBuilder();
        for (int i = (stringLength - 1); i >= 0; i--) {
            aux.append(input.charAt(i));
        }
        System.out.println(
                "Before the process: '" + input + "', and now..." +
                        "\nthe string already reversed: " + aux
        );
    }
}
