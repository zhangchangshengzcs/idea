import java.util.Stack;

/**
 * desc:使用栈思想解决括号匹配
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().isValid("{([])}"));
    }
    public boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty() ){
                    return false;
                }
                char topChar=stack.pop();
                if(topChar=='('&&c!=')'){
                    return false;
                }
                if(topChar=='['&&c!=']'){
                    return false;
                }
                if(topChar=='{'&&c!='}'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
