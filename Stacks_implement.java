import java.util.Stack;

public class Stacks_implement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        stack.pop();
        System.out.println(stack.peek());
    }
}
