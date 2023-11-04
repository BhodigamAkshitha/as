public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }
}
