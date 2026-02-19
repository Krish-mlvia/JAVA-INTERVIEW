public class PalindromeStrings {
    public static void main(String[] args) {
        String str = "madaam";
        String reverse = "";

        for (int i = str.length() - 1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse))
            System.out.println("palindrome string");
        else
            System.out.println("not a palindrome string");    
    }
    
}
