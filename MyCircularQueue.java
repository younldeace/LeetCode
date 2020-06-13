public class MyCircularQueue {
    private int[] array;
    private int head;
    private int tear;
    private int size;
    public MyCircularQueue(int size){
        this.size=size;
        array=new int[size];
        head=0;
        tear=0;
    }

    public boolean isEmpty(){
        return head==tear;
    }

    public boolean isFull(){
        return (tear+1)%size==head;
    }

    public boolean enQueue(int x){
        if(isFull()){
            return false;
        }
        array[tear]=x;
        tear=(tear+1)%size;
        return true;
    }

    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        head=(head+1)%size;
        return true;
    }

    public Integer getHead(){
        if(isEmpty()){
            return null;
        }
        return array[head];
    }


    public static void main(String[] args) {
        MyCircularQueue myCircularQueue=new MyCircularQueue(2);
        System.out.println(myCircularQueue.enQueue(1));
        System.out.println(myCircularQueue.enQueue(2));
        System.out.println(myCircularQueue.getHead());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.getHead());
    }
}
