import java.util.Stack;
public class Main {
//    stack is a lifo data structure
//    Last In and First out
//    Push to add obj to the top
//    Pop to remove obj from the top
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());
        stack.push("minecraft");
        stack.push("Doom");
        stack.push("Fortnite");
        for (int i = 0; i < 1000000000; i++){
            stack.push("Vice City");
        }
        System.out.println(stack.search("Vice City"));

    }
}