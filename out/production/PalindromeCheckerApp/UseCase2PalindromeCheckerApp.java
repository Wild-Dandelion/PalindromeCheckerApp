//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        boolean result = false;

        for(int i = 0; i < input.length() / 2; ++i) {
            if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
                result = true;
            }
        }

        System.out.println("Input text: madam");
        System.out.println("Is it a palindrome? " + result);
    }
}
