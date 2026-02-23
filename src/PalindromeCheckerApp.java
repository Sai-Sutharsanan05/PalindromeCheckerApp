public class PalindromeCheckerApp {
    public static void main(String[] args) {
     //write a logic for uc2
        String input="madam";
        for(int i=0;i<input.length()/2;i++){
            if (input.charAt(i)!=input.charAt(input.length()-1-i)){
                System.out.println(input+ " is not palindrome.");
                return;
            }
        }
        System.out.println(input+ " is a palindrome.");
    }
}
s