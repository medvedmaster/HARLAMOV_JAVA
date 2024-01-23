import java.util.Stack;
//Данная скобочная последовательность не является правильной, так как количество открывающих и закрывающих скобок не совпадает, и скобки располагаются неправильным образом.
//
//Для того чтобы сделать эту последовательность правильной, необходимо сбалансировать количество открывающих и закрывающих скобок, а также расположить их так, чтобы каждая открывающая скобка имела соответствующую ей закрывающую скобку.

public class Test4 {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "[(())()(())]";
        if (isBalanced(input)) {
            System.out.println("Скобочная последовательность правильная");
        } else {
            System.out.println("Скобочная последовательность неправильная");
        }
    }
}
