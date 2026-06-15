import java.util.Stack;

public class ValidPalindrome {

    public static boolean isValidPalindrome(String s){

        Stack<Character> stack = new Stack<>();

        int n = s.length();

        for(int i = 0; i< n; i++){

            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }

            else {
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.peek();

                if((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                (ch == ']' && top == '[')){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {


        String str =  "()[{}";

        boolean result = isValidPalindrome(str);
        System.out.println(result);
    }
}
