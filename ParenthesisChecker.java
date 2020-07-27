
import java.util.Stack;

public class ParenthesisChecker {

    public static void main(String[] args){
        String str = "{}{{}}(())()(){{{(())}}}()(";
        boolean isValid = true;
        Stack<Character> myStack= new Stack<>();
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                myStack.push(c);
                continue;
            }
            if(myStack.isEmpty()){
                isValid = false;
                break;
            }
            if(c == '}'){
                if(myStack.peek() == '{'){
                    myStack.pop();
                    continue;
                }
                else{isValid = false;break;}
            }
            if(c == ')'){
                if(myStack.peek() == '('){
                    myStack.pop();
                    continue;
                }
                else{isValid = false;break;}
            }
            if(c == ']'){
                if(myStack.peek() == '('){
                    myStack.pop();
                }
                else{isValid = false;break;}
            }

        }
        if(!(myStack.isEmpty())){
            isValid = false;
        }
        if(isValid){
            System.out.println("Valid Expression.");
        }
        else{
            System.out.println("Invalid Expression.");
        }
    }
}
