public class maxLengthBetweenEqualCharacters {

    public static int maxLen(String s){

        int n = s.length();
        int maxLen = 0;
        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){
                if (s.charAt(i) == s.charAt(j)) {
                    maxLen = Math.max(maxLen, j - i - 1);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {

        String str = "abcdefghijklmnopqrstuvwxyza";
        int result = maxLen(str);
        System.out.println(result);
    }
}
