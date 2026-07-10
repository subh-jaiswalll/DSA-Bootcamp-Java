public class FindTheIndexOfFirst {


    public static int findindex(String s, String t){

        if(s.contains(t)){
            return s.indexOf(t);
        }
        return -1;
    }

    public static int findIndex(String s, String t){

        int m = s.length();
        int n = t.length();

        for(int i  = 0; i <= m - n; i++){

            int j  = 0;
            while (j < n && s.charAt(i + j) == t.charAt(j)){
                j++;
            }

            if (j == n) {
                return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(findindex(haystack, needle));

        System.out.println(findIndex(haystack, needle));

    }
}
