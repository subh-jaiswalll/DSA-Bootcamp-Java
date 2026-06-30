package stack;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Stack<Integer> reverse = new Stack<>();

        while (!st.isEmpty()){
            reverse.push(st.pop());
        }

        System.out.println(reverse);
    }
}
