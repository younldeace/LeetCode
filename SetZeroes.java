import java.util.Arrays;

public class SetZeroes {
    public void setZeroes(int[][] matrix) {
         boolean [] rows=new boolean[matrix.length];
         boolean[] column=new boolean[matrix[0].length];
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]==0){
                    rows[i]=true;
                    column[j]=true;
                 }
             }
         }

         for(int i=0;i<rows.length;i++){
            if(rows[i]){
                for(int j=0;j<column.length;j++){
                    matrix[i][j]=0;
                }
            }
         }

         for(int i=0;i<column.length;i++){
            if(column[i]){
                for(int j=0;j<rows.length;j++){
                    matrix[j][i]=0;
                }
            }
         }
    }

    public static void main(String[] args) {
        int [][] matrix=new int[][]{
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        new SetZeroes().setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
