import java.util.ArrayList;
import java.util.List;

public class FIFOQueueByArray {
    private List<Integer> list;
    private int idx;

    public FIFOQueueByArray() {
        list=new ArrayList<>();
        idx=0;
    }

    public void enQueue(int x){
        list.add(x);
    }

    public void deQueue(){
        idx=idx+1;
    }

    public int getFront(){
        return list.get(idx);
    }

    public boolean isEmpty(){
        if(list.size()>0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        FIFOQueueByArray queue=new FIFOQueueByArray();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println(queue.getFront());
        if(!queue.isEmpty()){
            queue.deQueue();
        }
        System.out.println(queue.getFront());
    }
}
