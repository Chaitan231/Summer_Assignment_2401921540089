class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int direction=0;
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> list=new ArrayList<>();
        int top=0,bottom=m-1,right=n-1,left=0;
        while(top<=bottom&&left<=right){
            if(direction==0){
                for(int j=left;j<=right;j++){
                list.add(matrix[top][j]);   
                }
            direction=1;
            top++;
            }
            else if(direction==1){
                for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);   
                }
            direction=2;
            right--;
            }
            else if(direction==2){
                for(int j=right;j>=left;j--){
                list.add(matrix[bottom][j]);   
                }
            direction=3;
            bottom--;
            }
            else{
                for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);   
                }
            direction=0;
            left++;;
            }
        }
        return list;
    }
}