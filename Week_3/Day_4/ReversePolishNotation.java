package Day_4;

import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        for(String token:tokens){
            if(isOperator(token)){
                int num2=stk.pop();
                int num1=stk.pop();
                int result= evaluate(token,num1,num2);
                stk.push(result);
            }
            else{
                stk.push(Integer.parseInt(token));
            }
        }
        return stk.pop();
    }
    boolean isOperator(String token){
        return token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")||token.equals("^");
    }
    int evaluate(String token,int num1,int num2){
        if(token.equals("+")){
            return num1+num2;
        }
        else if(token.equals("-")){
            return num1-num2;
        }
        else if(token.equals("*")){
            return num1*num2;
        }
        else if(token.equals("/")){
            return num1/num2;
        }
        else if(token.equals("^")){
            return num1^num2;
        }
        else{
            return num1%num2;
        }
        
    }
} 
    

