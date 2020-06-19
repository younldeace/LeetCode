import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                stack.push(Integer.valueOf(tokens[i]));
            }else{
                int p1=0;
                int p2=0;
                if(tokens[i].equals("+")){
                    p1=stack.pop();
                    p2=stack.pop();
                    stack.push(p2+p1);
                }else if(tokens[i].equals("-")){
                    p1=stack.pop();
                    p2=stack.pop();
                    stack.push(p2-p1);
                }else if(tokens[i].equals("*")){
                    p1=stack.pop();
                    p2=stack.pop();
                    stack.push(p2*p1);
                }else if(tokens[i].equals("/")){
                    p1=stack.pop();
                    p2=stack.pop();
                    stack.push(p2/p1);
                }
            }
        }
        return stack.pop();
    }

    private int i = 0;
    private String[] s;

    public int evalRPN2(String[] tokens) {
        i = tokens.length - 1;
        s = tokens;
        return dfs();
    }

    private int dfs() {
        String temp = s[i--];
        int a, b;
        switch (temp) {
            case "+":
                a = dfs();
                b = dfs();
                return a + b;
            case "-":
                a = dfs();
                b = dfs();
                return b - a;
            case "*":
                a = dfs();
                b = dfs();
                return a * b;
            case "/":
                a = dfs();
                b = dfs();
                return b / a;
            default:
                return Integer.parseInt(temp);
        }
    }

    public static void main(String[] args) {
        EvalRPN evalRPN=new EvalRPN();
        String [] tokens={"2","1","+","3","*"};
        System.out.println(evalRPN.evalRPN2(tokens));
    }
}
