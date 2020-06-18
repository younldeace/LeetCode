import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temp) {
        int[] result = new int[temp.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() &&temp[i]>temp[stack.peek()]){
                result[stack.peek()]=i-stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}
