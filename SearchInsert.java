public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        if(target<nums[low]){
            return 0;
        }
        if(target>nums[high]){
            return high+1;
        }
        while(low<=high){
            mid=(low+high)/2;
            if(target>nums[mid]){
                low=mid+1;
            }else if(target<nums[mid]){
                high=mid-1;
            }else{
                return mid;
            }
        }
        if(nums[mid]>target){
            return mid;
        }else{
            return mid+1;
        }
    }

    public static void main(String[] args) {
        SearchInsert searchInsert=new SearchInsert();
        System.out.println(searchInsert.searchInsert(new int[]{1,3}, 2));
        ;
    }
}
