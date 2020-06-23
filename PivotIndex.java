public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int all=0;
        for(int i=0;i<nums.length;i++){
            all=all+nums[i];
        }
        int half=0;
        for(int i=0;i<nums.length-1;i++){
            if(half*2+nums[i]==all){
                return i;
            }
            half=half+nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        PivotIndex pivotIndex=new PivotIndex();
        int nums[]={-1,-1,1};
        System.out.println(pivotIndex.pivotIndex(nums));
        ;
    }
}
