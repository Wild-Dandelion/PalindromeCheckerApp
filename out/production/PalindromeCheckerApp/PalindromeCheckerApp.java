//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        welcomemessage();
        hardinput();
        stringReverse();
        stringChar();
    }

    public static void welcomemessage() {
        System.out.println("Welcome to Palindrome Checker Management System :D");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully. \n");
    }

    public static void hardinput() {
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

    public static void stringReverse(){
        String input = "madam";
        String newString = "";
        boolean result = false;
        for (int i = input.length()-1; i >= 0 ; i-- ){
            newString += input.charAt(i);
        }

        if (input.equals(newString)){
            result = true;
        }

        System.out.println("Is it a palindrome ?" + result + "\n");
    }

    public static void stringChar(){
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length-1;
        boolean isPalindrome = true;
        while (start<end){
            if (chars[start] == chars[end]){
                end -=1;
                start +=1;
           }
           else {
                isPalindrome = false;          // Update boolean if mismatch
                break;
            }
        }
        System.out.println("Input: " + input);
        if (isPalindrome) {
            System.out.println("Is it a Palindrome ?: True");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
