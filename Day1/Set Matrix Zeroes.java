 boolean hasFirstRow = false;
        boolean hasFirstCol = false;
        
        for(int col = 0; col < matrix[0].length;col++){//First row
            if(matrix[0][col]==0){
                hasFirstRow = true;
                break;
            }
        }

        for(int row = 0; row < matrix.length;row++){ // First Column
            if(matrix[row][0]==0){
                hasFirstCol = true;
                break;
            }
        }   
        for(int row = 1; row < matrix.length; row++){ //Preprocessing
            for(int col = 1; col < matrix[0].length; col++){
                if(matrix[row][col] == 0){
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
        for(int col = 1; col < matrix[0].length; col++)
            if(matrix[0][col] == 0) nullifyCol(matrix,col);
        
        for(int row = 1; row < matrix.length; row++)
            if(matrix[row][0] == 0) nullifyRow(matrix,row);
        
        if(hasFirstRow) nullifyRow(matrix, 0);
        if(hasFirstCol) nullifyCol(matrix, 0);
    }
    private void nullifyRow(int[][] matrix, int row){
        for(int col = 0; col < matrix[0].length; col++){
            matrix[row][col] = 0;
        }
    }

    private void nullifyCol(int[][] matrix, int col){
        for(int row = 0; row < matrix.length; row++){
            matrix[row][col] = 0;
        }
    }
}