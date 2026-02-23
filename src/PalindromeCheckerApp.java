public class PalindromeCheckerApp{
    public static void main(String[] args){
        welcomemessage();
        hardinput();
    }

    public static void welcomemessage(){
        System.out.println("Welcome to Palindrome Checker Management System :D");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully. \n");
    }

    public static void hardinput(){
        String input = "madam";
        boolean result = false;

        for (int i = 0; i < input.length()/2; i++){
            if (input.charAt(i) == input.charAt(input.length()-1-i)){
                result = true;
            }
        }
        System.out.println("Input text: madam");
        System.out.println("Is it a palindrome? " + result);
    }
}
