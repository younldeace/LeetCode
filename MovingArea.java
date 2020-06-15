public class MovingArea {
    int size;
    int head=-1;
    int count=0;
    int sum=0;
    int q [];
    public MovingArea(int size){
        this.size=size;
        q=new int [size];
    }

    public double next(int val){
        ++count;
        int tail=(head+1)%size;
        sum=sum-q[tail]+val;
        head=(head+1)%size;
        q[head]=val;
        return sum*1.0/Math.min(size, count);
    }

    public static void main(String[] args) {
        MovingArea movingArea=new MovingArea(3);
        System.out.println(movingArea.next(1));
        System.out.println(movingArea.next(2));
        System.out.println(movingArea.next(3));
        System.out.println(movingArea.next(4));
        System.out.println(movingArea.next(5));
    }
}
