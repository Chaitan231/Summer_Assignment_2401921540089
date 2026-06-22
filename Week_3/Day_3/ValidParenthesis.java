import java.util.Stack;

class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray()){
            if(isOpen(c)){
                stk.push(c);
            }
            else{
                if(stk.size()>0 && isSameType(stk.peek(),c)){
                    stk.pop();
                }
                else{
                    return false;
                }
                
            }
            
        }
        return stk.size()==0;
    }
    private boolean isOpen(char c){
        return c=='('||c=='{'||c=='[';
    }
    private boolean isSameType(char open,char close){
        return (open=='{' && close=='}')||(open=='[' && close==']')||(open=='(' && close==')');
    }
}