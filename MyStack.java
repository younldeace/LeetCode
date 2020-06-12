import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Integer> list;
    public MyStack(){
        list=new ArrayList<>();
    }

    public void push(int x){
        list.add(x);
    }
    public void pull(){
        list.remove(list.size()-1);

    }

    public Integer top(){
        if(list!=null &&list.size()>0){
            return list.get(list.size()-1);
        }
        return null;
    }

    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
        stack.pull();
        System.out.println(stack.top());
    }
}
