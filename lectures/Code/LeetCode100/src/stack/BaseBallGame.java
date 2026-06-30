package stack;

import java.util.Arrays;
import java.util.Stack;

public class BaseBallGame {

    public static int baseballGame(String[] op){

        Stack<Integer> st = new Stack<>();

        for(String ops : op) {

            if (ops.equals("+")) {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            } else if (ops.equals("C")) {
                st.pop();
            } else if (ops.equals("D")) {
                st.push(2 * st.peek());
            } else {
                st.push(Integer.parseInt(ops));
            }

        }
            int ans = 0;

            while (!st.isEmpty()){
                ans+=st.pop();
            }

        return ans;
    }

    public static void main(String[] args) {

        String[] str = {"5","-2","4","C","D","9","+","+"};

        int result = baseballGame(str);
        System.out.println(result);
    }
}
