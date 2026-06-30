package stack;

import java.util.Stack;

public class Push {

    public static void pushStack(Stack<Integer> st, int position, int value){

        if(position < 1 && position > st.size() + 1){
            System.out.println("Invalid ");
            return;
        }

        Stack<Integer> temp = new Stack<>();

        for(int i = 1; i < position; i++){
            temp.push(st.pop());
        }

        st.push(value);

        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);

        pushStack(st, 3, 3);
        System.out.println(st);
    }
}
