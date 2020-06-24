import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {
    public int[][] merge(int[][] intervals) {
        List<int[]> result;
        if(intervals.length==0){
            return new int[0][];
        }
        result=new ArrayList<>();
        if(intervals.length==1){
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        for(int i=0;i<intervals.length;i++){
            if(result.size()==0){
                result.add(intervals[i]);
                continue;
            }else{
                int result_right=result.get(result.size()-1)[1];
                int n_left=intervals[i][0];
                int n_right=intervals[i][1];
                if(n_left<=result_right){
                    if(n_right>=result_right){
                        result.get(result.size()-1)[1]=n_right;
                    }
                }else{
                    result.add(intervals[i]);
                }
            }
        }
        int[][] rr=result.toArray(new int[result.size()][]);
        return rr;
    }

    public int[][] merge2(int[][] intervals) {
        if (intervals.length == 0 || intervals[0].length == 0){
            return new int[0][];
        }
        List<int[]> res = new ArrayList<>();
        int[] left = new int[intervals.length];
        int[] right = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            left[i] = intervals[i][0];
            right[i] = intervals[i][1];
        }
        Arrays.sort(left);
        Arrays.sort(right);

        int i = 0, j = 0;
        while (i < left.length) {
            if (i == left.length - 1 || right[i] < left[i + 1]) {
                res.add(new int[]{left[j], right[i]});
                j = i + 1;
            }
            i++;
        }
        int[][] result = new int[res.size()][2];
        for (int index = 0; index < result.length; index++) {
            result[index] = res.get(index);
        }
        return result;
    }

    public static void main(String[] args) {
        Merge merge=new Merge();
        //System.out.println(Arrays.toString(merge.merge(new int[][]{{1,6},{2,6},{8,10},{15,18}})[2]));
        //System.out.println(Arrays.toString(merge.merge(new int[][]{{1,4},{0,4}})[0]));
        //System.out.println(Arrays.toString(merge.merge(new int[][]{{1,4},{4,6}})[0]));
        //System.out.println(Arrays.toString(merge.merge(new int[][]{{1,4},{0,2},{3,5}})[0]));
        //System.out.println(Arrays.toString(merge.merge2(new int[][]{{1,6},{2,6},{8,10},{15,18}})[2]));
        System.out.println(Arrays.toString(merge.merge2(new int[][]{{1,4},{0,4}})[0]));
        //System.out.println(Arrays.toString(merge.merge2(new int[][]{{1,4},{4,6}})[0]));
        //System.out.println(Arrays.toString(merge.merge2(new int[][]{{1,4},{0,2},{3,5}})[0]));
    }
}
