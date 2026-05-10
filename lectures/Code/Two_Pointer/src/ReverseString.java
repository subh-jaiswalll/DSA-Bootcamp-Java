

//https://leetcode.com/problems/reverse-string/description/
public class ReverseString {



    static void reverseStringBruteForce(char[] s){

        int n = s.length;

        String str = "";

        for(int i = n - 1; i >= 0; i--){
            str = str + s[i];
        }

        System.out.print(str);
    }

    static void reverseStringTwoPointer(char[] str){

        int n = str.length;

        int start = 0;
        int end= n -1;

        while (start < end){
            char ch = str[start];
            str[start] = str[end];
            str[end] = ch;

            start++;
            end--;


        }

        for(char ch : str){
            System.out.print(ch + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        reverseStringBruteForce(ch);
        reverseStringTwoPointer(ch);
    }
}
