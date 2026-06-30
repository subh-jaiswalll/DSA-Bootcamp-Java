package stack;


import java.util.Stack;

public class remove {

    public static void removeStack(Stack<Integer> st, int position){

        Stack<Integer> temp = new Stack<>();

        for(int i = 1;i < position; i++){
            temp.push(st.pop());
        }

        st.pop();

        while (!temp.isEmpty()){
            st.push(temp.pop());
        }


    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        removeStack(stack, 2);

        System.out.println(stack);
    }


}
