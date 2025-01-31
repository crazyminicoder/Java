import java.util.Stack;

public class validParentheses {
    public boolean vp(String s) {
        Stack<Character> stack = new Stack<>();

        
        stack.push(s.charAt(0));
        // System.out.println(stack.peek());
        for (int i = 1; i < s.length(); i++) {
            // System.out.println("Char = " + s.charAt(i));
            if (s.charAt(i) == ')') {

                if (stack.isEmpty()) {

                    return false;
                } else if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else if (s.charAt(i) == '}') {
                if (stack.isEmpty()) {

                    return false;
                } else if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else if (s.charAt(i) == '>') {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '<') {
                    // System.out.println("in <" + stack.peek());
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String s = "(){}}{";
        validParentheses v = new validParentheses();
        System.out.println(v.vp(s));
    }
}
