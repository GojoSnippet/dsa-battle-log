class Solution {
    public void setZeroes(int[][] matrix) {
        int rowSize = matrix.length;int columnSize = matrix[0].length;
        int columnValue = matrix[0][0];
        for(int i=0;i<rowSize;++i){
            for(int j=0;j<columnSize;++j){
                if(matrix[i][j] == 0){
                    if(j == 0)columnValue=0;
                    else{
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                    }
                }
            }
        }
        for(int i=0;i<rowSize;++i){
            for(int j=0;j<columnSize;++j){
                System.out.println(" " + matrix[i][j]);
            }
            System.out.println("______________");
        }
        int rowValue = matrix[0][0];
        for(int i=1;i<rowSize;++i){
            if(matrix[i][0] == 0){
                for(int j=1;j<columnSize;++j)matrix[i][j]=0;
            }
        }
        for(int i=1;i<columnSize;++i){
            if(matrix[0][i] == 0){
                for(int j=1;j<rowSize;++j)matrix[j][i]=0;
            }
        }
        if(columnValue == 0){
            for(int i=0;i<rowSize;++i)matrix[i][0]=0;
        }
        if(rowValue == 0){
            for(int j=0;j<columnSize;++j)matrix[0][j]=0;
        }
        return ;
    }
}
